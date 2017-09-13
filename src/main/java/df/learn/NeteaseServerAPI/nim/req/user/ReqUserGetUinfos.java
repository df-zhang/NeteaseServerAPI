package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 获取用户名片<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/getUinfos.action HTTP/1.1<br>
 * Content-Type: application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 获取用户名片，可批量
 */
public class ReqUserGetUinfos extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3278679610410312172L;

	@Override
	protected String getUri() {
		return "user/getUinfos.action";
	}

	/**
	 * accids String 是 用户帐号（例如：JSONArray对应的accid串，如：["zhangsan"]，如果解析出错，会报414）（一次查询最多为200）
	 */
	private String accids;

	/**
	 * @return the accids
	 */
	public String getAccids() {
		return accids;
	}

	/**
	 * @param accids
	 *            the accids to set
	 *             用户帐号（例如：JSONArray对应的accid串，如：["zhangsan","sdfsd"]，如果解析出错，会报414）（一次查询最多为200）
	 */
	public void setAccids(String accids) {
		this.accids = accids;
	}

}
