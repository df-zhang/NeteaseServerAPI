package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 设置桌面端在线时，移动端是否需要推送<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/setDonnop.action HTTP/1.1<br>
 * Content-Type: application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 设置桌面端在线时，移动端是否需要推送<br>
 */
public class ReqUserSetDonnop extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8138506895434672550L;

	@Override
	protected String getUri() {
		return "user/setDonnop.action";
	}

	/**
	 * accid String 是 用户帐号
	 */
	private String accid;
	/**
	 * donnopOpen String 是 桌面端在线时，移动端是否不推送： true:移动端不需要推送，false:移动端需要推送
	 * 
	 */
	private String donnopOpen;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the donnopOpen
	 */
	public String getDonnopOpen() {
		return donnopOpen;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param donnopOpen
	 *            the donnopOpen to set
	 */
	public void setDonnopOpen(String donnopOpen) {
		this.donnopOpen = donnopOpen;
	}

}
