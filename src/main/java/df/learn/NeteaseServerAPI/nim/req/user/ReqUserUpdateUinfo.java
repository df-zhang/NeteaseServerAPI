package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 更新用户名片<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/updateUinfo.action HTTP/1.1<br>
 * Content-Type: application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 更新用户名片
 */
public class ReqUserUpdateUinfo extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8232430457371664846L;

	@Override
	protected String getUri() {
		return "user/updateUinfo.action";
	}

	/**
	 * accid String 是 用户帐号，最大长度32字符，必须保证一个APP内唯一
	 */
	private String accid;
	/**
	 * name String 否 用户昵称，最大长度64字符
	 */
	private String name;
	/**
	 * icon String 否 用户icon，最大长度1024字符
	 */
	private String icon;
	/**
	 * sign String 否 用户签名，最大长度256字符
	 */
	private String sign;
	/**
	 * email String 否 用户email，最大长度64字符
	 */
	private String email;
	/**
	 * birth String 否 用户生日，最大长度16字符
	 */
	private String birth;
	/**
	 * mobile String 否 用户mobile，最大长度32字符，只支持国内号码
	 */
	private String mobile;
	/**
	 * gender int 否 用户性别，0表示未知，1表示男，2女表示女，其它会报参数错误
	 */
	private int gender;
	/**
	 * ex String 否 用户名片扩展字段，最大长度1024字符，用户可自行扩展，建议封装成JSON字符串
	 */
	private String ex;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @return the ex
	 */
	public String getEx() {
		return ex;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @param sign
	 *            the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param birth
	 *            the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @param ex
	 *            the ex to set
	 */
	public void setEx(String ex) {
		this.ex = ex;
	}

}
