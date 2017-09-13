package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 获取一个直播频道的信息<br>
 * 
 * 2.4.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channelstats HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 * 2.4.3 参数说明<br>
 * 参数 类型 说明 必须<br>
 * cid String 频道ID，32位字符串 是<br>
 * 2.4.4 curl请求示例<br>
 * 复制curl -X POST -H "Content-Type: application/json" -H "AppKey: 29781bbc4db54742a3ebcxxxxxxxxxxx" -H "Nonce: 12345" -H "CurTime: 1469171950571" -H "CheckSum: 4ba6ca70c685eb900917e423eadaxxxxxxxxxxxxx" -d '{"cid":"cidxxxxxxxxx"}'
 * https://vcloud.163.com/app/channelstats
 */
public class ReqAppChannelstats extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5798092887029872498L;

	@Override
	protected String getUri() {
		return "app/channelstats";
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
