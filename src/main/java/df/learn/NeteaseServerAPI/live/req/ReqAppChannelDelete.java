package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 删除一个直播频道<br>
 * 
 * 2.3.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channel/delete HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 * 2.3.3 参数说明<br>
 * 参数 类型 说明 必须<br>
 * cid String 频道ID，32位字符串 是<br>
 * 2.3.4 curl请求示例<br>
 * 复制curl -X POST -H "Content-Type: application/json" -H "AppKey: 29781bbc4db54742a3ebcxxxxxxxxxxx" -H "Nonce: 12345" -H "CurTime: 1469171950571" -H "CheckSum: 4ba6ca70c685eb900917e423eadaxxxxxxxxxxxxx" -d '{"cid":"1452b15e9b6941a384a6a5688d478620"}'
 * https://vcloud.163.com/app/channel/delete
 */
public class ReqAppChannelDelete extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3510505955354391082L;

	@Override
	protected String getUri() {
		return "app/channel/delete";
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
