package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 创建一个直播频道 <br>
 * 
 * 2.1.2 请求说明 <br>
 * 复制POST https://vcloud.163.com/app/channel/create HTTP/1.1 <br>
 * Content-Type: application/json;charset=utf-8 <br>
 * 2.1.3 参数说明 <br>
 * 参数 类型 说明 必须 <br>
 * name String 频道名称（最大长度64个字符，只支持中文、字母、数字和下划线） 是 <br>
 * type int 频道类型（0:rtmp） 是 <br>
 * 2.1.4 示例 <br>
 * curl -X POST -H "Content-Type: application/json" -H "AppKey: 29781bbc4db54742a3ebcxxxxxxxxxxx" -H "Nonce: 12345" -H "CurTime: 1469171950571" -H "CheckSum: 4ba6ca70c685eb900917e423eadaxxxxxxxxxxxxx" -d '{"name":"channel_name", "type":0}'
 * https://vcloud.163.com/app/channel/create <br>
 * 2.1.6 返回说明 <br>
 * http 响应：json <br>
 * <br>
 * 参数 类型 说明 <br>
 * code int 状态码 <br>
 * cid String 频道ID，32位字符串 <br>
 * ctime Long 创建频道的时间戳 <br>
 * name String 频道名称 <br>
 * pushUrl String 推流地址 <br>
 * httpPullUrl String http拉流地址 <br>
 * hlsPullUrl String hls拉流地址 <br>
 * rtmpPullUrl String rtmp拉流地址 <br>
 * msg String 错误信息 <br>
 * 2.1.7 响应状态码 <br>
 * HTTP状态码 含义 <br>
 * 200 操作成功 <br>
 * 409 用户登录认证失败 <br>
 * 604 频道添加失败 <br>
 * 607 用户信息不存在 <br>
 * 610 频道名称为空 <br>
 * 611 频道名称已经存在 <br>
 * 612 频道类型错误 <br>
 * 613 CheckSum为空 <br>
 * 614 AppKey为空 <br>
 * 615 CurTime为空 <br>
 * 635 服务未开通，请联系客服QQ：3310203920申请开通！ <br>
 */
public class ReqAppChannelCreate extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4544643458805232351L;

	@Override
	protected String getUri() {
		return "app/channel/create";
	}

	/**
	 * name String 频道名称（最大长度64个字符，只支持中文、字母、数字和下划线） 是
	 */
	private String name;
	/**
	 * type int 频道类型（0:rtmp） 是
	 */
	private int type;

	/**
	 * name String 频道名称（最大长度64个字符，只支持中文、字母、数字和下划线） 是
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * type int 频道类型（0:rtmp） 是
	 * 
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * name String 频道名称（最大长度64个字符，只支持中文、字母、数字和下划线） 是
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * type int 频道类型（0:rtmp） 是
	 * 
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

}
