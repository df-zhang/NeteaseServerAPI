package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomSetMemberRole
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:20:34
 * @Author 854154025@qq.com
 * 
 * @Description 设置聊天室内用户角色
 * 
 * 参数 类型 必须 说明<br>
 * roomid long 是 聊天室id<br>
 * operator String 是 操作者账号accid<br>
 * target String 是 被操作者账号accid<br>
 * opt int 是 操作：<br>
 * 1: 设置为管理员，operator必须是创建者 <br>
 * 2:设置普通等级用户，operator必须是创建者或管理员 <br>
 * -1:设为黑名单用户，operator必须是创建者或管理员 <br>
 * -2:设为禁言用户，operator必须是创建者或管理员<br>
 * optvalue String 是 true或false，true:设置；false:取消设置<br>
 * notifyExt String 否 通知扩展字段，长度限制2048，请使用json格式<br>
 * 
 */
public class ReqChatroomSetMemberRole extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1931465480568939454L;

	@Override
	protected String getUri() {
		return "chatroom/setMemberRole.action";
	}

	private long roomid;
	private String notifyExt;
	private String target;
	private String optvalue;
	private int opt;
	private String operator;

	public long getRoomid() {
		return this.roomid;
	}

	public String getNotifyExt() {
		return this.notifyExt;
	}

	public String getTarget() {
		return this.target;
	}

	public String getOptvalue() {
		return this.optvalue;
	}

	public int getOpt() {
		return this.opt;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	};

	public void setNotifyExt(String notifyExt) {
		this.notifyExt = notifyExt;
	};

	public void setTarget(String target) {
		this.target = target;
	};

	public void setOptvalue(String optvalue) {
		this.optvalue = optvalue;
	};

	public void setOpt(int opt) {
		this.opt = opt;
	};

	public void setOperator(String operator) {
		this.operator = operator;
	};
}