package df.learn.NeteaseServerAPI.live.req;

import java.util.List;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 恢复一组用户正在直播的频道。
 * 
 * 2.11.2 请求说明 复制POST https://vcloud.163.com/app/channellist/resume HTTP/1.1 Content-Type: application/json;charset=utf-8
 */
public class ReqAppChannellistResume extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6487080904977875562L;

	@Override
	protected String getUri() {
		return "app/channellist/resume";
	}

	/**
	 * cidList JsonArray 频道ID列表 是
	 */
	private List<String> cidList;

	/**
	 * cidList JsonArray 频道ID列表 是
	 * 
	 * @return
	 */
	public List<String> getCidList() {
		return cidList;
	}

	/**
	 * cidList JsonArray 频道ID列表 是
	 * 
	 * @param cidList
	 */
	public void setCidList(List<String> cidList) {
		this.cidList = cidList;
	}

}