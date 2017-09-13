package df.learn.NeteaseServerAPI.nim.req.chat;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomSendMsg
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:17:42
 * @Author 854154025@qq.com
 * 
 * @Description 发送聊天室消息
 * 
 * 参数 类型 必须 说明<br>
 * roomid long 是 聊天室id<br>
 * msgId String 是 客户端消息id，使用uuid等随机串，msgId相同的消息会被客户端去重<br>
 * fromAccid String 是 消息发出者的账号accid<br>
 * msgType int 是 消息类型：<br>
 * 0: 表示文本消息， <br>
 * 1: 表示图片， <br>
 * 2: 表示语音， <br>
 * 3: 表示视频， <br>
 * 4: 表示地理位置信息，<br>
 * 6: 表示文件，<br>
 * 10: 表示Tips消息，<br>
 * 100: 自定义消息类型<br>
 * resendFlag int 否 重发消息标记，0：非重发消息，1：重发消息，如重发消息会按照msgid检查去重逻辑<br>
 * attach String 否 消息内容，格式同消息格式示例中的body字段,长度限制4096字符<br>
 * ext String 否 消息扩展字段，内容可自定义，请使用JSON格式，长度限制4096字符<br>
 * antispam String 否 本消息是否需要过自定义反垃圾系统。true或false, 默认false<br>
 * antispamCustom String 否 自定义的反垃圾内容, JSON格式，长度限制同attach字段，不能超过4096字符，antispamCustom示例：<br>
 * <br>
 * {"type":1,"data":"custom content"}<br>
 * <br>
 * 字段说明：<br>
 * 1. type: 1:文本，2：图片，3视频;<br>
 * 2. data: 文本内容or图片地址or视频地址。<br>
 * skipHistory int 否 是否跳过存储云端历史，0：不跳过，即存历史消息；1：跳过，即不存云端历史；默认0<br>
 */
public class ReqChatroomSendMsg extends ReqNIM {
	public static final int TYPE_TEXT = 0;
	public static final int TYPE_IMAGE = 1;
	public static final int TYPE_AUDIO = 2;
	public static final int TYPE_VIDEO = 3;
	public static final int TYPE_LOCATION = 4;
	public static final int TYPE_FILE = 6;
	public static final int TYPE_TIPS = 10;
	public static final int TYPE_CUSTOM = 100;
	/**
	* 
	*/
	private static final long serialVersionUID = 5856039058786784984L;

	@Override
	protected String getUri() {
		return "chatroom/sendMsg.action";
	}

	private long roomid;
	private String antispamCustom;
	private String fromAccid;
	private String antispam = "false";
	private String attach;
	private int resendFlag;
	private String msgId;
	private int msgType;
	private String ext;
	private int skipHistory;

	public long getRoomid() {
		return this.roomid;
	}

	public String getAntispamCustom() {
		return this.antispamCustom;
	}

	public String getFromAccid() {
		return this.fromAccid;
	}

	public String getAntispam() {
		return this.antispam;
	}

	public String getAttach() {
		return this.attach;
	}

	public int getResendFlag() {
		return this.resendFlag;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public int getMsgType() {
		return this.msgType;
	}

	public String getExt() {
		return this.ext;
	}

	/**
	 * @return skipHistory
	 */
	public int getSkipHistory() {
		return skipHistory;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public void setAntispamCustom(String antispamCustom) {
		this.antispamCustom = antispamCustom;
	}

	public void setFromAccid(String fromAccid) {
		this.fromAccid = fromAccid;
	}

	public void setAntispam(String antispam) {
		this.antispam = antispam;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public void setResendFlag(int resendFlag) {
		this.resendFlag = resendFlag;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	/**
	 * @param skipHistory 属性赋值 skipHistory
	 */
	public void setSkipHistory(int skipHistory) {
		this.skipHistory = skipHistory;
	}
}