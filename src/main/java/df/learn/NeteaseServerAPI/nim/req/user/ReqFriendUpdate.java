package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 更新好友相关信息<br>
 * 请求说明<br>
 * POST https://api.netease.im/nimserver/friend/update.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 接口描述<br>
 * 1.更新好友相关信息，如加备注名，必须是好友才可以<br>
 */
public class ReqFriendUpdate extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7516240674630481095L;

	@Override
	protected String getUri() {
		return "friend/update.action";
	}

	/**
	 * accid String 是 加好友发起者accid
	 */
	private String accid;
	/**
	 * faccid String 是 加好友接收者accid
	 */
	private String faccid;
	/**
	 * alias String 否 给好友增加备注名，限制长度128
	 */
	private String alias;
	/**
	 * msg String 否 加好友对应的请求消息，第三方组装，最长256字符
	 */
	private String msg;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the faccid
	 */
	public String getFaccid() {
		return faccid;
	}

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param faccid
	 *            the faccid to set
	 */
	public void setFaccid(String faccid) {
		this.faccid = faccid;
	}

	/**
	 * @param alias
	 *            the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
