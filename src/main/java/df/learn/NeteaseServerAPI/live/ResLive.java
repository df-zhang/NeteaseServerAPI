package df.learn.NeteaseServerAPI.live;

import df.learn.NeteaseServerAPI.NeteaseResponse;

/**
 * HTTP状态码 含义<br>
 * 200 操作成功<br>
 * 409 用户登录认证失败<br>
 * 604 频道添加失败<br>
 * 607 用户信息不存在<br>
 * 610 频道名称为空<br>
 * 611 频道名称已经存在<br>
 * 612 频道类型错误<br>
 * 613 CheckSum为空<br>
 * 614 AppKey为空<br>
 * 615 CurTime为空<br>
 * 617 频道信息与当前用户不匹配<br>
 * 618 查询数据信息不存在<br>
 * 631 请求参数错误<br>
 * 635 服务未开通，请联系客服QQ：3310203920申请开通！<br>
 * 723 使用直播录制功能需开通云点播服务<br>
 */
public class ResLive extends NeteaseResponse {
	/**
	 * 
	 */
	protected String msg;

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
