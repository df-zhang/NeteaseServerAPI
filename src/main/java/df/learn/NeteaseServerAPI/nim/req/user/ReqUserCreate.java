package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 创建云信ID<br>
 * 
 * 请求说明 复制POST https://api.netease.im/nimserver/user/create.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述 <br>
 * 1.第三方帐号导入到云信平台；<br>
 * 
 * 2.注意accid，name长度以及考虑管理token。
 */
public class ReqUserCreate extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5158189425085895577L;

	@Override
	protected String getUri() {
		return "user/create.action";
	}

	/**
	 * accid String 是 云信ID，最大长度32字符，必须保证一个 APP内唯一（只允许字母、数字、半角下划线_、 @、半角点以及半角-组成，不区分大小写， 会统一小写处理，请注意以此接口返回结果中的accid为准）。
	 */
	private String accid;

	/**
	 * name String 否 云信ID昵称，最大长度64字符，用来PUSH推送 时显示的昵称
	 */
	private String name;
	/**
	 * props String 否 json属性，第三方可选填，最大长度1024字符
	 * 
	 */
	private String props;
	/**
	 * icon String 否 云信ID头像URL，第三方可选填，最大长度1024
	 * 
	 */
	private String icon;

	/**
	 * token String 否 云信ID可以指定登录token值，最大长度128字符， 并更新，如果未指定，会自动生成token，并在 创建成功后返回
	 */
	private String token;

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
	 * @return the props
	 */
	public String getProps() {
		return props;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param accid the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(String props) {
		this.props = props;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
