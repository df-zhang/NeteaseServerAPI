package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 云信ID更新<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/update.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 云信ID基本信息更新
 */
public class ReqUserUpdate extends ReqNIM {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3462193032725826272L;

	@Override
	protected String getUri() {
		return "user/update.action";
	}

	/**
	 * accid String 是 云信ID，最大长度32字符，必须保证一个 APP内唯一
	 */
	private String accid;
	/**
	 * props String 否 json属性，第三方可选填，最大长度1024字符
	 */
	private String props;
	/**
	 * token String 否 云信ID可以指定登录token值，最大长度128字符
	 * 
	 */
	private String token;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the props
	 */
	public String getProps() {
		return props;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param props
	 *            the props to set
	 */
	public void setProps(String props) {
		this.props = props;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
}
