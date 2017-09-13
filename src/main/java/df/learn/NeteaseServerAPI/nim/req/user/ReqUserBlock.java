package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 封禁云信ID<br>
 * 
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/block.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 1.第三方禁用某个云信ID的IM功能；<br>
 * 
 * 2.封禁云信ID后，此ID将不能登陆云信imserver。<br>
 */
public class ReqUserBlock extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2814869519917725071L;

	@Override
	protected String getUri() {
		return "user/block.action";
	}

	/**
	 * accid String 是 云信ID，最大长度32字符，必须保证一个 APP内唯一
	 */
	private String accid;
	/**
	 * needkick String 否 是否踢掉被禁用户，true或false，默认false
	 * 
	 */
	private String needkick;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @return the needkick
	 */
	public String getNeedkick() {
		return needkick;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}

	/**
	 * @param needkick
	 *            the needkick to set
	 */
	public void setNeedkick(String needkick) {
		this.needkick = needkick;
	}

}
