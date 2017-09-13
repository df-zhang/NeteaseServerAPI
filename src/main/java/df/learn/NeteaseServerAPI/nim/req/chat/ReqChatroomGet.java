package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomGet
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:14:54
 * @Author 854154025@qq.com
 * 
 * @Description 查询聊天室信息 参数 类型 必须 说明<br>
 * roomid long 是 聊天室id<br>
 * needOnlineUserCount String 否 是否需要返回在线人数，true或false，默认false<br>
 */
public class ReqChatroomGet extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8416532039755127262L;

	@Override
	protected String getUri() {
		return "chatroom/get.action";
	}

	/**
	 * @Fields roomid : 聊天室id
	 */
	private long roomid;
	/**
	 * @Fields needOnlineUserCount : 是否需要返回在线人数，true或false，默认false
	 */
	private String needOnlineUserCount = "false";

	public long getRoomid() {
		return this.roomid;
	}

	public String getNeedOnlineUserCount() {
		return this.needOnlineUserCount;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public void setNeedOnlineUserCount(String needOnlineUserCount) {
		this.needOnlineUserCount = needOnlineUserCount;
	}
}