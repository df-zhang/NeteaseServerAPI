package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomCreate
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:13:16
 * @Author 854154025@qq.com
 * 
 * @Description 创建聊天室
 * 
 * 参数 类型 必须 说明<br>
 * creator String 是 聊天室属主的账号accid<br>
 * name String 是 聊天室名称，长度限制128个字符<br>
 * announcement String 否 公告，长度限制4096个字符<br>
 * broadcasturl String 否 直播地址，长度限制1024个字符<br>
 * ext String 否 扩展字段，最长4096字符<br>
 */
public class ReqChatroomCreate extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8367970445974062419L;

	@Override
	protected String getUri() {
		return "chatroom/create.action";
	}

	/**
	 * @Fields announcement : 公告，长度限制4096个字符
	 */
	private String announcement;
	/**
	 * @Fields name : 聊天室名称，长度限制128个字符
	 */
	private String name;
	/**
	 * @Fields broadcasturl : 直播地址，长度限制1024个字符
	 */
	private String broadcasturl;
	/**
	 * @Fields ext : 扩展字段，最长4096字符
	 */
	private String ext;
	/**
	 * @Fields creator : 聊天室属主的账号accid
	 */
	private String creator;

	public String getAnnouncement() {
		return this.announcement;
	}

	public String getName() {
		return this.name;
	}

	public String getBroadcasturl() {
		return this.broadcasturl;
	}

	public String getExt() {
		return this.ext;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBroadcasturl(String broadcasturl) {
		this.broadcasturl = broadcasturl;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
}