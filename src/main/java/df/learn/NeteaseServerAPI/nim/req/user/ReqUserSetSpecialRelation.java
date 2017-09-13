package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 黑名单/静音<br>
 * 
 * 设置黑名单/静音<br>
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/setSpecialRelation.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 拉黑/取消拉黑；设置静音/取消静音<br>
 * 参数说明<br>
 * 参数 类型 必须 说明<br>
 * accid String 是 用户帐号，最大长度32字符，必须保证一个 APP内唯一<br>
 * targetAcc String 是 被加黑或加静音的帐号<br>
 * relationType int 是 本次操作的关系类型,1:黑名单操作，2:静音列表操作<br>
 * value int 是 操作值，0:取消黑名单或静音，1:加入黑名单或静音<br>
 * curl请求示例<br>
 * 复制curl -X POST -H "AppKey: go9dnk49bkd9jd9vmel1kglw0803mgq3" -H "Nonce: 4tgggergigwow323t23t" -H "CurTime: 1443592222" -H "CheckSum: 9e9db3b6c9abb2e1962cf3e6f7316fcc55583f86" -H "Content-Type: application/x-www-form-urlencoded" -d
 * 'accid=zhangsan&targetAcc=lisi&relationType=1&value=0' 'https://api.netease.im/nimserver/user/setSpecialRelation.action'<br>
 * 返回说明<br>
 * http 响应:json<br>
 * 
 * 复制"Content-Type": "application/json; charset=utf-8"<br>
 * { "code":200 }<br>
 * 主要的返回码<br>
 * 200、403、414、416、431、500<br>
 * 
 * 具体请参考code状态表<br>
 */
public class ReqUserSetSpecialRelation extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3230789975980323117L;

	@Override
	protected String getUri() {
		return "user/setSpecialRelation.action";
	}

	/**
	 * accid String 是 用户帐号，最大长度32字符，必须保证一个 APP内唯一
	 */
	private String accid;
	/**
	 * targetAcc String 是 被加黑或加静音的帐号
	 * 
	 */
	private String targetAcc;
	/**
	 * relationType int 是 本次操作的关系类型,1:黑名单操作，2:静音列表操作
	 * 
	 */
	private int relationType;
	/**
	 * value int 是 操作值，0:取消黑名单或静音，1:加入黑名单或静音
	 * 
	 */
	private int value;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the targetAcc
	 */
	public String getTargetAcc() {
		return targetAcc;
	}

	/**
	 * @return the relationType
	 */
	public int getRelationType() {
		return relationType;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param targetAcc
	 *            the targetAcc to set
	 */
	public void setTargetAcc(String targetAcc) {
		this.targetAcc = targetAcc;
	}

	/**
	 * @param relationType
	 *            the relationType to set
	 */
	public void setRelationType(int relationType) {
		this.relationType = relationType;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
