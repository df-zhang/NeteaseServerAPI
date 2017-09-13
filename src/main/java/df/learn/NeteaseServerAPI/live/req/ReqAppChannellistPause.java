package df.learn.NeteaseServerAPI.live.req;

import java.util.List;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 禁用一组用户正在直播的频道。<br>
 * 
 * 2.9.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channellist/pause HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 */
public class ReqAppChannellistPause extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5718352424240007230L;

	@Override
	protected String getUri() {
		return "app/channellist/pause";
	}

	private List<String> cidList;

	public List<String> getCidList() {
		return cidList;
	}

	public void setCidList(List<String> cidList) {
		this.cidList = cidList;
	}

}