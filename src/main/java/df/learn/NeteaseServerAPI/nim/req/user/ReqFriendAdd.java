package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 好友关系<br>
 * 
 * 加好友<br>
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/friend/add.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 接口描述<br>
 * 1.两人保持好友关系
 */
public class ReqFriendAdd extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5982002332836604095L;

	@Override
	protected String getUri() {
		return "friend/add.action";
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
	 * type int 是 1直接加好友，2请求加好友，3同意加好友，4拒绝加好友
	 */
	private int type;
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
	 * @return the type
	 */
	public int getType() {
		return type;
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
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
