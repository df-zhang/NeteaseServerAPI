package df.learn.NeteaseServerAPI;

/**
 * @ClassName df.learn.NeteaseServerAPI.NeteaseResponse  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:45:21 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云基础响应类，包含一个code<br>
 * 参考：http://dev.netease.im/docs/product/IM即时通讯/服务端API文档?#code状态表
 * 
 */
public class NeteaseResponse {
	protected int code;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
}
