package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomToggleCloseStat
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:22:35
 * @Author 854154025@qq.com
 * 
 * @Description 修改聊天室开/关闭状态
 * 
 * 
 * 参数 类型 必须 说明<br>
 * roomid long 是 聊天室id<br>
 * operator String 是 操作者账号，必须是创建者才可以操作<br>
 * valid String 是 true或false，false:关闭聊天室；true:打开聊天室<br>
 * 
 * 
 */
public class ReqChatroomToggleCloseStat extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1331378522197052828L;

	@Override
	protected String getUri() {
		return "chatroom/toggleCloseStat.action";
	}

	private long roomid;
	private String valid;
	private String operator;

	public long getRoomid() {
		return this.roomid;
	}

	public String getValid() {
		return this.valid;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}