package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;
import df.learn.NeteaseServerAPI.services.NeteaseChatService;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomRequestAddr
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:16:13
 * @Author 854154025@qq.com
 * 
 * @Description 请求聊天室地址
 * 
 * 参数 类型 必须 说明<br>
 * roomid long 是 聊天室id<br>
 * accid String 是 进入聊天室的账号<br>
 * clienttype int 否 1:weblink; 2:commonlink, 默认1<br>
 * 
 *TODO 接口未在{@link NeteaseChatService}中实现
 */
public class ReqChatroomRequestAddr extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5109645405036081635L;

	@Override
	protected String getUri() {
		return "chatroom/requestAddr.action";
	}

	/**
	 * @Fields roomid : 聊天室id
	 */
	private long roomid;
	/**
	 * @Fields clienttype : 1:weblink; 2:commonlink, 默认1
	 */
	private int clienttype = 1;
	/**
	 * @Fields accid : 进入聊天室的账号
	 */
	private String accid;

	public long getRoomid() {
		return this.roomid;
	}

	public int getClienttype() {
		return this.clienttype;
	}

	public String getAccid() {
		return this.accid;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public void setClienttype(int clienttype) {
		this.clienttype = clienttype;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}
}