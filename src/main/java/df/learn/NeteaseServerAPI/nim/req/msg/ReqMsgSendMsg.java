package df.learn.NeteaseServerAPI.nim.req.msg;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 发送普通消息<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/msg/sendMsg.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 给用户或者群发送普通消息，包括文本，图片，语音，视频和地理位置，具体消息参考下面描述<br>
 * 
 * 参数说明<br>
 * 参数 类型 必须 说明<br>
 * from String 是 发送者accid，用户帐号，最大32字符，<br>
 * 必须保证一个APP内唯一 ope int 是 0：点对点个人消息，1：群消息，其他返回414<br>
 * to String 是 ope==0是表示accid即用户id，ope==1表示tid即群id<br>
 * type int 是 0 表示文本消息,<br>
 * 1 表示图片，<br>
 * 2 表示语音，<br>
 * 3 表示视频，<br>
 * 4 表示地理位置信息，<br>
 * 6 表示文件，<br>
 * 100 自定义消息类型<br>
 * body String 是 请参考下方消息示例说明中对应消息的body字段，<br>
 * 最大长度5000字符，为一个json串<br>
 * antispam String 否 本消息是否需要过自定义反垃圾系统，true或false, 默认false<br>
 * antispamCustom String 否 自定义的反垃圾内容, 长度限制同body字段，不能超过5000字符<br>
 * option String 否 发消息时特殊指定的行为选项,Json格式，可用于指定消息的漫游，存云端历史，发送方多端同步，推送，消息抄送等特殊行为;option中字段不填时表示默认值 option示例:<br>
 * 
 * &emsp;{"push":false,"roam":true,"history":false,"sendersync":true,"route":false,"badge":false,"needPushNick":true}<br>
 * 
 * &emsp;字段说明：<br>
 * &emsp;1. roam: 该消息是否需要漫游，默认true（需要app开通漫游消息功能）； <br>
 * &emsp;2. history: 该消息是否存云端历史，默认true；<br>
 * &emsp;3. sendersync: 该消息是否需要发送方多端同步，默认true；<br>
 * &emsp;4. push: 该消息是否需要APNS推送或安卓系统通知栏推送，默认true；<br>
 * &emsp;5. route: 该消息是否需要抄送第三方；默认true (需要app开通消息抄送功能);<br>
 * &emsp;6. badge:该消息是否需要计入到未读计数中，默认true;<br>
 * &emsp;7. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认true;<br>
 * &emsp;8. persistent: 是否需要存离线消息，不设置该参数时默认true。<br>
 * pushcontent String 否 ios推送内容，不超过150字符，option选项中允许推送（push=true），此字段可以指定推送内容<br>
 * payload String 否 ios 推送对应的payload,必须是JSON,不能超过2k字符<br>
 * ext String 否 开发者扩展字段，长度限制1024字符<br>
 * forcepushlist String 否 发送群消息时的强推（@操作）用户列表，格式为JSONArray，如["accid1","accid2"]。若forcepushall为true，则forcepushlist为除发送者外的所有有效群成员<br>
 * forcepushcontent String 否 发送群消息时，针对强推（@操作）列表forcepushlist中的用户，强制推送的内容<br>
 * forcepushall String 否 发送群消息时，强推（@操作）列表是否为群里除发送者外的所有有效成员，true或false，默认为false<br>
 * curl请求示例<br>
 * 复制curl -X POST -H "AppKey: go9dnk49bkd9jd9vmel1kglw0803mgq3" -H "Nonce: 4tgggergigwow323t23t" -H "CurTime: 1443592222" -H "CheckSum: 9e9db3b6c9abb2e1962cf3e6f7316fcc55583f86" -H "Content-Type: application/x-www-form-urlencoded" -d
 * 'from=zhangsan&ope=0&to=lisi&type=0&body={"msg":"hello"}' 'https://api.netease.im/nimserver/msg/sendMsg.action'<br>
 * 返回说明<br>
 * http 响应:json<br>
 * 
 * 复制"Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * &emsp;"code":200<br>
 * }<br>
 * 主要的返回码<br>
 * 200、403、414、416、431、500<br>
 * 
 * 具体请参考code状态表<br>
 */
public class ReqMsgSendMsg extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1691259518478204458L;

	@Override
	protected String getUri() {
		return "msg/sendMsg.action";
	}

	/**
	 * from String 是 发送者accid，用户帐号，最大32字符， 必须保证一个APP内唯一
	 */
	private String from;
	/**
	 * ope int 是 0：点对点个人消息，1：群消息，其他返回414
	 */
	private int ope;
	/**
	 * to String 是 ope==0是表示accid即用户id，ope==1表示tid即群id
	 */
	private String to;
	/**
	 * type int 是 0 表示文本消息,<br>
	 * 1 表示图片，<br>
	 * 2 表示语音，<br>
	 * 3 表示视频，<br>
	 * 4 表示地理位置信息，<br>
	 * 6 表示文件，<br>
	 * 100 自定义消息类型<br>
	 */
	private int type;
	/**
	 * body String 是 请参考下方消息示例说明中对应消息的body字段， 最大长度5000字符，为一个json串
	 */
	private String body;
	/**
	 * antispam String 否 本消息是否需要过自定义反垃圾系统，true或false, 默认false
	 */
	private String antispam;
	/**
	 * antispamCustom String 否 自定义的反垃圾内容, 长度限制同body字段，不能超过5000字符
	 */
	private String antispamCustom;
	/**
	 * option String 否 发消息时特殊指定的行为选项,Json格式，可用于指定消息的漫游，存云端历史，发送方多端同步，推送，消息抄送等特殊行为;option中字段不填时表示默认值 option示例:<br>
	 * 
	 * {"push":false,"roam":true,"history":false,"sendersync":true,"route":false,"badge":false,"needPushNick":true}<br>
	 * 
	 * 字段说明：<br>
	 * 1. roam: 该消息是否需要漫游，默认true（需要app开通漫游消息功能）； <br>
	 * 2. history: 该消息是否存云端历史，默认true；<br>
	 * 3. sendersync: 该消息是否需要发送方多端同步，默认true；<br>
	 * 4. push: 该消息是否需要APNS推送或安卓系统通知栏推送，默认true；<br>
	 * 5. route: 该消息是否需要抄送第三方；默认true (需要app开通消息抄送功能);<br>
	 * 6. badge:该消息是否需要计入到未读计数中，默认true;<br>
	 * 7. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认true;<br>
	 * 8. persistent: 是否需要存离线消息，不设置该参数时默认true。<br>
	 */
	private String option;
	/**
	 * pushcontent String 否 ios推送内容，不超过150字符，option选项中允许推送（push=true），此字段可以指定推送内容
	 */
	private String pushcontent;
	/**
	 * payload String 否 ios 推送对应的payload,必须是JSON,不能超过2k字符
	 */
	private String payload;
	/**
	 * ext String 否 开发者扩展字段，长度限制1024字符
	 */
	private String ext;
	/**
	 * forcepushlist String 否 发送群消息时的强推（@操作）用户列表，格式为JSONArray，如["accid1","accid2"]。若forcepushall为true，则forcepushlist为除发送者外的所有有效群成员
	 */
	private String forcepushlist;
	/**
	 * forcepushcontent String 否 发送群消息时，针对强推（@操作）列表forcepushlist中的用户，强制推送的内容
	 */
	private String forcepushcontent;
	/**
	 * forcepushall String 否 发送群消息时，强推（@操作）列表是否为群里除发送者外的所有有效成员，true或false，默认为false
	 */
	private String forcepushall;

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @return the ope
	 */
	public int getOpe() {
		return ope;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @return the antispam
	 */
	public String getAntispam() {
		return antispam;
	}

	/**
	 * @return the antispamCustom
	 */
	public String getAntispamCustom() {
		return antispamCustom;
	}

	/**
	 * @return the option
	 */
	public String getOption() {
		return option;
	}

	/**
	 * @return the pushcontent
	 */
	public String getPushcontent() {
		return pushcontent;
	}

	/**
	 * @return the payload
	 */
	public String getPayload() {
		return payload;
	}

	/**
	 * @return the ext
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * @return the forcepushlist
	 */
	public String getForcepushlist() {
		return forcepushlist;
	}

	/**
	 * @return the forcepushcontent
	 */
	public String getForcepushcontent() {
		return forcepushcontent;
	}

	/**
	 * @return the forcepushall
	 */
	public String getForcepushall() {
		return forcepushall;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @param ope the ope to set
	 */
	public void setOpe(int ope) {
		this.ope = ope;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @param antispam the antispam to set
	 */
	public void setAntispam(String antispam) {
		this.antispam = antispam;
	}

	/**
	 * @param antispamCustom the antispamCustom to set
	 */
	public void setAntispamCustom(String antispamCustom) {
		this.antispamCustom = antispamCustom;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(String option) {
		this.option = option;
	}

	/**
	 * @param pushcontent the pushcontent to set
	 */
	public void setPushcontent(String pushcontent) {
		this.pushcontent = pushcontent;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(String payload) {
		this.payload = payload;
	}

	/**
	 * @param ext the ext to set
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}

	/**
	 * @param forcepushlist the forcepushlist to set
	 */
	public void setForcepushlist(String forcepushlist) {
		this.forcepushlist = forcepushlist;
	}

	/**
	 * @param forcepushcontent the forcepushcontent to set
	 */
	public void setForcepushcontent(String forcepushcontent) {
		this.forcepushcontent = forcepushcontent;
	}

	/**
	 * @param forcepushall the forcepushall to set
	 */
	public void setForcepushall(String forcepushall) {
		this.forcepushall = forcepushall;
	}

}
