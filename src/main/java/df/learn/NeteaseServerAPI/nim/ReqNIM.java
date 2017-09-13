package df.learn.NeteaseServerAPI.nim;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import df.learn.NeteaseServerAPI.NeteaseRequest;


/**
 * @ClassName df.learn.NeteaseServerAPI.nim.ReqNIM  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:48:42 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云IM功能基础请求类，所有请求均指向nimserver
 * 
 */
@SuppressWarnings("serial")
public abstract class ReqNIM implements NeteaseRequest, Serializable {
	public static final String NIM_DOMAIN = "https://api.netease.im/nimserver/";
	private Map<String, String> headers = new HashMap<String, String>(5);

	public ReqNIM() {
		headers.put("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
	}

	@Override
	public String getURL() {
		return NIM_DOMAIN + getUri();
	}

	@Override
	public String getMethod() {
		return "POST";
	}

	@Override
	public Map<String, String> getHeaders() {
		return headers;
	}

	protected abstract String getUri();
}
