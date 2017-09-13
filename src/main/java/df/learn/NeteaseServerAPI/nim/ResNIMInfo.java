package df.learn.NeteaseServerAPI.nim;

import df.learn.NeteaseServerAPI.NeteaseResponse;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.ResNIMInfo  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:49:28 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云IM功能响应结果类
 * 
 * @param <T>
 */
public class ResNIMInfo<T> extends NeteaseResponse {
	private T info;

	/**
	 * @return the info
	 */
	public T getInfo() {
		return info;
	}

	/**
	 * @param info
	 *            the info to set
	 */
	public void setInfo(T info) {
		this.info = info;
	}

}
