package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 删除好友<br>
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/friend/delete.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 1.删除好友关系
 */
public class ReqFriendDelete extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3776798583584116691L;

	@Override
	protected String getUri() {
		return "friend/delete.action";
	}

	/**
	 * accid String 是 发起者accid
	 */
	private String accid;
	/**
	 * faccid String 是 要删除朋友的accid
	 */
	private String faccid;

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

}
