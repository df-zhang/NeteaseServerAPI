package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 解禁云信ID<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/unblock.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 解禁被封禁的云信ID
 */
public class ReqUserUnblock extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6065763767436052094L;

	@Override
	protected String getUri() {
		return "user/unblock.action";
	}

	/**
	 * accid String 是 云信ID，最大长度32字符，必须保证一个 APP内唯一
	 */
	private String accid;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

}
