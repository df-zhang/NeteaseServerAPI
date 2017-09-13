package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 修改直播频道信息<br>
 * 
 * 2.2.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channel/update HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 * 2.2.3 参数说明<br>
 * 参数 类型 说明 必须<br>
 * name String 频道名（最大长度64个字符） 是<br>
 * cid String 频道ID，32位字符串 是<br>
 * type int 频道类型 ( 0 : rtmp) 是<br>
 * 2.2.4 curl请求示例<br>
 * 复制curl -X POST -H "Content-Type: application/json" -H "AppKey: 29781bbc4db54742a3ebcxxxxxxxxxxx" -H "Nonce: 12345" -H "CurTime: 1469171950571" -H "CheckSum: 4ba6ca70c685eb900917e423eadaxxxxxxxxxxxxx" -d '{"name":"channel_name", "cid":"cidxxxxxxxxx",
 * "type":0}' https://vcloud.163.com/app/channel/update
 */
public class ReqAppChannelUpdate extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = 969859562580184104L;

	@Override
	protected String getUri() {
		return "app/channel/update";
	}

	/**
	 * name String 频道名（最大长度64个字符） 是
	 */
	private String name;
	/**
	 * cid String 频道ID，32位字符串 是
	 */
	private String cid;
	/**
	 * type int 频道类型 ( 0 : rtmp) 是
	 */
	private int type;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cid
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

}
