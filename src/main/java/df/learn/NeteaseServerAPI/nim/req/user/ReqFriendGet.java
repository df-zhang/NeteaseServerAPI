package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 获取好友关系<br>
 * 请求说明<br>
 * POST https://api.netease.im/nimserver/friend/get.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 接口描述<br>
 * 1.查询某时间点起到现在有更新的双向好友<br>
 */
public class ReqFriendGet extends ReqNIM {

	/**
		 * 
		 */
	private static final long serialVersionUID = -3910681955439361674L;

	@Override
	protected String getUri() {
		return "friend/get.action";
	}

	/**
	 * accid String 是 发起者accid
	 * 
	 */
	private String accid;
	/**
	 * createtime String 是 查询的时间点
	 * 
	 */
	private String createtime;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the createtime
	 */
	public String getCreatetime() {
		return createtime;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param createtime
	 *            the createtime to set
	 */
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

}
