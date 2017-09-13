package df.learn.NeteaseServerAPI;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @ClassName df.learn.NeteaseServerAPI.APIHelper
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:33:14
 * @Author 854154025@qq.com
 * 
 * @Description API工具类
 * 
 */
public final class APIHelper {
	public static final Charset APP_CHARSET = Charset.forName("UTF-8");
	/**
	 * 需要网易云的公钥和密钥
	 */
	private String appKey;
	private String appSecret;

	/**
	 * @Constructors APIHelper
	 * 
	 * 
	 * @Description TODO
	 */
	public APIHelper() {
		appKey = "";
		appSecret = "";
	}

	/**
	 * 当前线程执行。<br>
	 * 调用网易云（云信、直播、实时视频等API），返回同步结果<br>
	 * 
	 * @param request {@link NeteaseRequest} 网易云请求，参照各实现类
	 * @param typeReference 因泛型为编译时状态，因此在编译时应为返回结果指定类型。{@link TypeReference}用于获取返回类型。
	 * @return {@link NeteaseResponse} 参照各实现类，不同请求对应不同响应结果。
	 */
	@SuppressWarnings("unchecked")
	public <T extends NeteaseResponse> T api(NeteaseRequest request, TypeReference<T> typeReference) {
		String appKey = getAppKey();
		String nonce = getNonce();
		String curTime = getCurTime() + "";
		String checkSum = getCheckSum(getAppSecret(), nonce, curTime);
		request.getHeaders().put("AppKey", appKey);// 开发者平台分配的appkey
		request.getHeaders().put("Nonce", nonce);// 随机数（最大长度128个字符）
		request.getHeaders().put("CurTime", curTime);// 当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String)
		request.getHeaders().put("CheckSum", checkSum);// SHA1(AppSecret + Nonce + CurTime),三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写)
		CloseableHttpResponse response = HTTP.execute(request);
		int httpStatus = HttpStatus.SC_OK;
		try {
			String entity = EntityUtils.toString(response.getEntity());
			httpStatus = response.getStatusLine().getStatusCode();
			if (StringUtils.isNotEmpty(entity)) {
				return APIHelper.JSON.toBean(entity, typeReference);
			}
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		} finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		if (typeReference != null) {
			try {
				T t = (T) typeReference.getType().getClass().newInstance();
				t.setCode(httpStatus);
				return t;
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		NeteaseResponse neteaseResponse = new NeteaseResponse();
		neteaseResponse.setCode(httpStatus);
		return null;
	}

	/**
	 * 新线程执行。<br>
	 * 调用网易云（云信、直播、实时视频等API），不返回结果。<br>
	 * 此接口无论调用成功失败，均不响应任何结果。<br>
	 * 
	 * @param request {@link NeteaseRequest} 网易云请求，参照各实现类
	 */
	public <T extends NeteaseResponse> void apiAsync(NeteaseRequest request) {
		apiAsync(request, null, null);
	}

	/**
	 * 新线程执行。<br>
	 * 调用网易云（云信、直播、实时视频等API），异步返回结果。<br>
	 * 
	 * @param request {@link NeteaseRequest} 网易云请求，参照各实现类
	 * @param handler 异步回调，{@link ResultHandler}
	 * @param typeReference 因泛型为编译时状态，因此在编译时应为返回结果指定类型。{@link TypeReference}用于获取返回类型。
	 */
	public <T extends NeteaseResponse> void apiAsync(NeteaseRequest request, ResultHandler<T> handler, TypeReference<T> typeReference) {
		String appKey = getAppKey();
		String nonce = getNonce();
		String curTime = getCurTime() + "";
		String checkSum = getCheckSum(getAppSecret(), nonce, curTime);
		request.getHeaders().put("AppKey", appKey);// 开发者平台分配的appkey
		request.getHeaders().put("Nonce", nonce);// 随机数（最大长度128个字符）
		request.getHeaders().put("CurTime", curTime);// 当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String)
		request.getHeaders().put("CheckSum", checkSum);// SHA1(AppSecret + Nonce + CurTime),三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写)
		HTTP.executeAsync(request, handler, typeReference);
	}

	/**
	 * @return 开发者平台分配的appkey
	 */
	public String getAppKey() {
		return appKey;
	}

	/**
	 * @Methods getAppSecret
	 * 
	 * @return String
	 * 
	 * @Description 开发者平台分配的AppSecret
	 */
	public String getAppSecret() {
		return appSecret;
	}

	/**
	 * @return 随机数（最大长度128个字符）
	 */
	public String getNonce() {
		return RandomUtils.nextLong(99999999L, 999999999L) + "";
	}

	/**
	 * 当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String)
	 */
	public long getCurTime() {
		return (SecondClock.getNow() / 1000L);
	}

	/**
	 * @param appSecret
	 * @param nonce
	 * @param curTime
	 * @return SHA1(AppSecret + Nonce + CurTime),三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写)
	 */
	public String getCheckSum(String appSecret, String nonce, String curTime) {
		return DigestUtils.sha1Hex(appSecret + nonce + curTime);
	}

	static class HTTP {
		private static final CloseableHttpClient httpClient;
		static {
			httpClient = HttpClients.custom().setConnectionManager(new PoolingHttpClientConnectionManager()).build();
		}

		public static <T> void executeAsync(final NeteaseRequest req, final ResultHandler<T> hanlder, final TypeReference<T> typeReference) {
			/*
			 * 这里可以调用AsyncHttpClient 前提是需要加入apache-AsyncHttpClient包
			 */
			ThreadPoolScheduler.addTask(new Runnable() {

				@Override
				public void run() {
					CloseableHttpResponse response = execute(req);
					try {
						int httpStatus = response.getStatusLine().getStatusCode();
						String entity = EntityUtils.toString(response.getEntity());
						// System.out.println(entity);
						if (hanlder != null) {
							hanlder.handle(httpStatus);
							T t = null;
							if (StringUtils.isNotEmpty(entity) && typeReference != null) {
								t = APIHelper.JSON.toBean(entity, typeReference);
							}
							hanlder.handle(httpStatus, t);
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (response != null) {
							try {
								response.close();
							} catch (IOException e) {
							}
						}
					}
				}
			});
		}

		public static CloseableHttpResponse execute(NeteaseRequest req) {
			if (req == null) {
				return null;
			}
			HttpPost httpPost = new HttpPost(req.getURL());
			Map<String, String> headers = req.getHeaders();
			if (headers != null && headers.size() > 0) {
				Set<Entry<String, String>> entries = headers.entrySet();
				for (Entry<String, String> entry : entries) {
					httpPost.setHeader(entry.getKey(), entry.getValue());
				}
			}
			String contentType = headers.get("Content-Type");
			if (StringUtils.isNotEmpty(contentType) && contentType.startsWith("application/x-www-form-urlencoded;")) {
				// 如果是表单提交
				List<NameValuePair> nvps = new ArrayList<NameValuePair>();
				// 得到类对象
				Class<?> userCla = (Class<?>) req.getClass();
				/*
				 * 得到类中的所有属性集合
				 */
				Field[] fs = userCla.getDeclaredFields();
				try {

					Object val = null;
					for (int i = 0; i < fs.length; i++) {

						Field f = fs[i];
						f.setAccessible(true); // 设置些属性是可以访问的
						if (!Modifier.isStatic(f.getModifiers())) {
							val = f.get(req);
							if (val == null) {
								val = "";
							}
							nvps.add(new BasicNameValuePair(f.getName(), val.toString()));
						}
					}
					httpPost.setEntity(new UrlEncodedFormEntity(nvps, APP_CHARSET));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			} else {
				// json提交
				httpPost.setEntity(new StringEntity(JSON.toJson(req), APP_CHARSET));
			}
			try {
				return httpClient.execute(httpPost);
			} catch (IOException e) {
			}
			return null;
		}
	}

	static class JSON {
		private static final ObjectMapper jacksonMapper = new ObjectMapper();
		static {
			jacksonMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, true);
			jacksonMapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true);
			jacksonMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			jacksonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			jacksonMapper.setSerializationInclusion(Include.NON_NULL);
		}

		@SuppressWarnings("unchecked")
		public static <T> T toBean(String jsonStr, TypeReference<T> typeReference) {
			try {
				return jacksonMapper.readValue(jsonStr, typeReference);
			} catch (IOException e) {
				try {
					ParameterizedType type = (ParameterizedType) typeReference.getType();
					return (T) getClass(type.getRawType()).newInstance();
				} catch (Exception e1) {
					return null;
				}
			}
		}

		private static final String TYPE_NAME_PREFIX = "class ";

		private static String getClassName(Type type) {
			if (type == null) {
				return "";
			}
			String className = type.toString();
			if (className.startsWith(TYPE_NAME_PREFIX)) {
				className = className.substring(TYPE_NAME_PREFIX.length());
			}
			return className;
		}

		private static Class<?> getClass(Type type) throws ClassNotFoundException {
			String className = getClassName(type);
			if (className == null || className.isEmpty()) {
				return null;
			}
			return Class.forName(className);
		}

		public static String toJson(Object obj) {
			try {
				return jacksonMapper.writeValueAsString(obj);
			} catch (JsonProcessingException e) {
			}
			return "";
		}
	}
}
