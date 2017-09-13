package df.learn.NeteaseServerAPI.nim.req.msg;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * <b>批量发送点对点普通消息</b><br>
 * 
 * <b>请求说明</b><br>
 * <b>POST</b> https://api.netease.im/nimserver/msg/sendBatchMsg.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * <b>接口描述</b><br>
 * &emsp;1.给用户发送点对点普通消息，包括文本，图片，语音，视频，地理位置和自定义消息。<br>
 * &emsp;2.最大限500人，只能针对个人,如果批量提供的帐号中有未注册的帐号，会提示并返回给用户。<br>
 * &emsp;3.此接口受频率控制，一个应用一分钟最多调用120次，超过会返回416状态码，并且被屏蔽一段时间；<br>
 * 具体消息参考下面描述。<br>
 * 
 * 参数说明<br>
 * 参数 类型 必须 说明<br>
 * fromAccid String 是 发送者accid，用户帐号，最大32字符，<br>
 * 必须保证一个APP内唯一<br>
 * toAccids String 是 ["aaa","bbb"]（JSONArray对应的accid，如果解析出错，会报414错误），限500人<br>
 * type int 是 0 表示文本消息,<br>
 * &emsp;1 表示图片，<br>
 * &emsp;2 表示语音，<br>
 * &emsp;3 表示视频，<br>
 * &emsp;4 表示地理位置信息，<br>
 * &emsp;6 表示文件，<br>
 * &emsp;100 自定义消息类型<br>
 * body String 是 请参考下方消息示例说明中对应消息的body字段，<br>
 * 最大长度5000字符，为一个json串<br>
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
 * 7. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认true;<br>
 * pushcontent String 否 ios推送内容，不超过150字符，option选项中允许推送（push=true），此字段可以指定推送内容<br>
 * payload String 否 ios 推送对应的payload,必须是JSON,不能超过2k字符<br>
 * ext String 否 开发者扩展字段，长度限制1024字符<br>
 * curl请求示例<br>
 * 复制curl -X POST -H "AppKey: go9dnk49bkd9jd9vmel1kglw0803mgq3" -H "Nonce: 4tgggergigwow323t23t" -H "CurTime: 1443592222" -H "CheckSum: 9e9db3b6c9abb2e1962cf3e6f7316fcc55583f86" -H "Content-Type: application/x-www-form-urlencoded" -d
 * 'fromAccid=zhangsan&toAccids=["aaa","bbb"]&type=0&body={"msg":"hello"}' 'https://api.netease.im/nimserver/msg/sendBatchMsg.action'<br>
 * 返回说明<br>
 * http 响应:json<br>
 * 
 * 复制"Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * &emsp;"code":200,<br>
 * &emsp;"unregister":"["a","b"...]" //未注册的帐号<br>
 * }<br>
 * 主要的返回码<br>
 * 200、403、414、416、431、500<br>
 * 
 * 具体请参考code状态表<br>
 * 
 * 消息格式示例:<br>
 * 1.文本消息<br>
 * 
 * 复制{<br>
 * &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":0,//文本消息类型<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"msg":"哈哈哈"//消息内容<br>
 * &emsp;}<br>
 * }<br>
 * 2 图片消息<br>
 * 
 * 复制{<br>
 * &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":1 //图片类型消息<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"name":"图片发送于2015-05-07 13:59", //图片name<br>
 * &emsp;&emsp;"md5":"9894907e4ad9de4678091277509361f7", //md5<br>
 * &emsp;&emsp;"url":"http://nimtest.nos.netease.com/cbc500e8-e19c-4b0f-834b-c32d4dc1075e", //生成的url<br>
 * "ext":"jpg", //图片后缀<br>
 * &emsp;&emsp;"w":6814, //宽<br>
 * &emsp;&emsp;"h":2332, //高<br>
 * &emsp;&emsp;"size":388245 //图片大小<br>
 * &emsp;}<br>
 * }<br>
 * 3 语音消息<br>
 * 
 * 复制{<br>
 * &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":2 //语音类型消息<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"dur":4551, //语音持续时长ms<br>
 * &emsp;&emsp;"md5":"87b94a090dec5c58f242b7132a530a01", //md5<br>
 * &emsp;&emsp;"url":"http://nimtest.nos.netease.com/a2583322-413d-4653-9a70-9cabdfc7f5f9", //生成的url<br>
 * &emsp;&emsp;"ext":"aac", //语音消息格式，只能是aac格式<br>
 * &emsp;&emsp;"size":16420 //语音文件大小<br>
 * &emsp;}<br>
 * }<br>
 * 4 视频消息<br>
 * 
 * 复制{<br>
 * &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":3 //视频类型消息<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"dur":8003, //视频持续时长ms<br>
 * &emsp;&emsp;"md5":"da2cef3e5663ee9c3547ef5d127f7e3e", //md5<br>
 * &emsp;&emsp;"url":"http://nimtest.nos.netease.com/21f34447-e9ac-4871-91ad-d9f03af20412", //生成的url<br>
 * &emsp;&emsp;"w":360, //宽<br>
 * &emsp;&emsp;"h":480, //高<br>
 * &emsp;&emsp;"ext":"mp4", //视频格式<br>
 * &emsp;&emsp;"size":16420 //视频文件大小<br>
 * &emsp;}<br>
 * }<br>
 * 5 发送地理位置消息<br>
 * 
 * 复制{ &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":4 //地理位置类型消息<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"title":"中国 浙江省 杭州市 网商路 599号", //地理位置title<br>
 * &emsp;&emsp;"lng":120.1908686708565, // 经度<br>
 * &emsp;&emsp;"lat":30.18704515647036 // 纬度<br>
 * &emsp;}<br>
 * }<br>
 * 6 发送文件消息<br>
 * 
 * 复制{<br>
 * &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":6 //文件消息<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"name":"BlizzardReg.ttf", //文件名<br>
 * &emsp;&emsp;"md5":"79d62a35fa3d34c367b20c66afc2a500", //文件MD5<br>
 * &emsp;&emsp;"url":"http://nimtest.nos.netease.com/08c9859d-183f-4daa-9904-d6cacb51c95b", //文件URL<br>
 * &emsp;&emsp;"ext":"ttf", //文件后缀类型<br>
 * &emsp;&emsp;"size":91680 //大小<br>
 * &emsp;}<br>
 * } 7 发送第三方自定义消息<br>
 * 
 * 复制{<br>
 * &emsp;"from":"test1",<br>
 * &emsp;"ope":0,<br>
 * &emsp;"to":"test2",<br>
 * &emsp;"type":100 //第三方自定义消息<br>
 * //第三方定义的body体，json串<br>
 * &emsp;"body":{<br>
 * &emsp;&emsp;"myKey":myValue <br>
 * &emsp;}<br>
 * }<br>
 * 
 */
public class ReqMsgSendBatchMsg extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8362291954309834304L;

	@Override
	protected String getUri() {
		return "msg/sendBatchMsg.action";
	}

	/**
	 * fromAccid String 是 发送者accid，用户帐号，最大32字符， 必须保证一个APP内唯一
	 */
	private String fromAccid;
	/**
	 * toAccids String 是 ["aaa","bbb"]（JSONArray对应的accid，如果解析出错，会报414错误），限500人
	 */
	private String toAccids;
	/**
	 * type int 是 0 表示文本消息, 1 表示图片， 2 表示语音， 3 表示视频， 4 表示地理位置信息， 6 表示文件， 100 自定义消息类型
	 */
	private int type;
	/**
	 * body String 是 请参考下方消息示例说明中对应消息的body字段， 最大长度5000字符，为一个json串
	 */
	private String body;
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
	 * @return the fromAccid
	 */
	public String getFromAccid() {
		return fromAccid;
	}

	/**
	 * @return the toAccids
	 */
	public String getToAccids() {
		return toAccids;
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
	 * @param fromAccid
	 *            the fromAccid to set
	 */
	public void setFromAccid(String fromAccid) {
		this.fromAccid = fromAccid;
	}

	/**
	 * @param toAccids
	 *            the toAccids to set
	 */
	public void setToAccids(String toAccids) {
		this.toAccids = toAccids;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @param option
	 *            the option to set
	 */
	public void setOption(String option) {
		this.option = option;
	}

	/**
	 * @param pushcontent
	 *            the pushcontent to set
	 */
	public void setPushcontent(String pushcontent) {
		this.pushcontent = pushcontent;
	}

	/**
	 * @param payload
	 *            the payload to set
	 */
	public void setPayload(String payload) {
		this.payload = payload;
	}

	/**
	 * @param ext
	 *            the ext to set
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}

}
