package df.learn.NeteaseServerAPI.nim.req.user;

import df.learn.NeteaseServerAPI.nim.ReqNIM;

/**
 * 查看指定用户的黑名单和静音列表<br>
 * 请求说明<br>
 * 复制POST https://api.netease.im/nimserver/user/listBlackAndMuteList.action HTTP/1.1<br>
 * Content-Type:application/x-www-form-urlencoded;charset=utf-8<br>
 * 请求中Headers的设置请参考接口概述<br>
 * 
 * 接口描述<br>
 * 查看用户的黑名单和静音列表<br>
 * 
 * 参数说明<br>
 * 参数 类型 必须 说明<br>
 * accid String 是 用户帐号，最大长度32字符，必须保证一个 APP内唯一<br>
 * curl请求示例<br>
 * 复制curl -X POST -H "AppKey: go9dnk49bkd9jd9vmel1kglw0803mgq3" -H "Nonce: 4tgggergigwow323t23t" -H "CurTime: 1443592222" -H "CheckSum: 9e9db3b6c9abb2e1962cf3e6f7316fcc55583f86" -H "Content-Type: application/x-www-form-urlencoded" -d 'accid=zhangsan'
 * 'https://api.netease.im/nimserver/user/listBlackAndMuteList.action'<br>
 * 返回说明<br>
 * http 响应:json<br>
 * 
 * 复制"Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * &emsp;"mutelist": [ &emsp;//被静音的帐号列表<br>
 * &emsp;&emsp;"abc",<br>
 * &emsp;&emsp;"cde"<br>
 * &emsp;],<br>
 * &emsp;"blacklist": [ &emsp;//加黑的帐号列表<br>
 * &emsp;&emsp;"abc"<br>
 * &emsp;],<br>
 * &emsp;"code": 200<br>
 * }<br>
 * <b>主要的返回码</b><br>
 * 200、403、414、416、431、500<br>
 * 
 * 具体请参考code状态表<br>
 */
public class ReqUserListBlackAndMuteList extends ReqNIM {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4499293632204681155L;

	@Override
	protected String getUri() {
		return "user/listBlackAndMuteList.action";
	}

	/**
	 * accid String 是 用户帐号，最大长度32字符，必须保证一个 APP内唯一
	 */
	private String accid;

	/**
	 * @return the accid
	 */
	public String getAccid() {
		return accid;
	}

	/**
	 * @param accid
	 *            the accid to set
	 */
	public void setAccid(String accid) {
		this.accid = accid;
	}
}
