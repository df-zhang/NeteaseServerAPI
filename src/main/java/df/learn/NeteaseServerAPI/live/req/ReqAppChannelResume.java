package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 恢复用户被禁用的频道。<br>
 * 
 * 2.10.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channel/resume HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 */
public class ReqAppChannelResume extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5795704695868460796L;

	@Override
	protected String getUri() {
		return "app/channel/resume";
	}

	private String cid;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}