package df.learn.NeteaseServerAPI;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @ClassName df.learn.NeteaseServerAPI.NeteaseRequest  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:45:55 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云基础请求累，包含URL、HTTP请求方法类型和HTTP请求头
 * 
 */
public interface NeteaseRequest {
	@JsonIgnore
	String getURL();

	/**
	 * 获取请求方法，目前网易云全部为POST，即默认为POST
	 * 
	 * @return POST
	 */
	@JsonIgnore
	String getMethod();

	@JsonIgnore
	Map<String, String> getHeaders();
}
