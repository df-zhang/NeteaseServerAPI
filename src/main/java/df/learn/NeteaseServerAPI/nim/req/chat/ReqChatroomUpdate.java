package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomUpdate
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:23:09
 * @Author 854154025@qq.com
 * 
 * @Description 更新聊天室信息
 * 
 * 
 * 参数 类型 必须 说明<br>
 * roomid long 是 聊天室id<br>
 * name String 否 聊天室名称，长度限制128个字符<br>
 * announcement String 否 公告，长度限制4096个字符<br>
 * broadcasturl String 否 直播地址，长度限制1024个字符<br>
 * ext String 否 扩展字段，长度限制4096个字符<br>
 * needNotify String 否 true或false,是否需要发送更新通知事件，默认true<br>
 * notifyExt String 否 通知事件扩展字段，长度限制2048<br>
 * 
 */
public class ReqChatroomUpdate extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8518944443763692961L;

	@Override
	protected String getUri() {
		return "chatroom/update.action";
	}

	private long roomid;
	private String announcement;
	private String needNotify;
	private String notifyExt;
	private String name;
	private String broadcasturl;
	private String ext;

	public long getRoomid() {
		return this.roomid;
	}

	public String getAnnouncement() {
		return this.announcement;
	}

	public String getNeedNotify() {
		return this.needNotify;
	}

	public String getNotifyExt() {
		return this.notifyExt;
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

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}

	public void setNeedNotify(String needNotify) {
		this.needNotify = needNotify;
	}

	public void setNotifyExt(String notifyExt) {
		this.notifyExt = notifyExt;
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
}