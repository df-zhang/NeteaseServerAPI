package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 禁用用户正在直播的频道。<br>
 * 
 * 2.8.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channel/pause HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 */
public class ReqAppChannelPause extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8006153294771793686L;

	@Override
	protected String getUri() {
		return "app/channel/pause";
	}

	/**
	 * cid String 频道ID，32位字符串 是
	 */
	private String cid;

	/**
	 * @return the cid
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}

}
