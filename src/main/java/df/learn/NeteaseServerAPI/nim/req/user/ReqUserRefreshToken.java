package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 更新并获取新token<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/refreshToken.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 1.webserver更新云信ID的token，同时返回新的token；<br>
 * 
 * 2.一般用于云信ID修改密码，找回密码或者第三方有需求获取新的token。
 */
public class ReqUserRefreshToken extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -155085271811558414L;

	@Override
	protected String getUri() {
		return "user/refreshToken.action";
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
