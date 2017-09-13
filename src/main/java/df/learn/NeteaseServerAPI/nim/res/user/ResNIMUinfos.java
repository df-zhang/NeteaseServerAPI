package df.learn.NeteaseServerAPI.nim.res.user;

import df.learn.NeteaseServerAPI.NeteaseResponse;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.ResNIMUinfos  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:51:52 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云IM功能用户模块——获取用户名片

 * 
 * @param <T>
 */
public class ResNIMUinfos<T> extends NeteaseResponse {
	private T uinfos;

	/**
	 * @return the uinfos
	 */
	public T getUinfos() {
		return uinfos;
	}

	/**
	 * @param uinfos
	 *            the uinfos to set
	 */
	public void setUinfos(T uinfos) {
		this.uinfos = uinfos;
	}

}
