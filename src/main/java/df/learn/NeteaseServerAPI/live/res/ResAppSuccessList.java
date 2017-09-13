package df.learn.NeteaseServerAPI.live.res;

import java.util.List;

/**
 * http 响应：json<br>
 * 
 * 参数 类型 说明<br>
 * code int 状态码<br>
 * msg String 错误信息<br>
 * successList JsonArray 成功禁用cid列表<br>
 * 复制//返回结果格式<br>
 * "Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * "code" : XXX,<br>
 * "msg" : XXX,<br>
 * "ret" : {<br>
 * "successList" : [<br>
 * XXX,<br>
 * XXX,<br>
 * XXX,<br>
 * ...<br>
 * ]<br>
 * }<br>
 * }<br>
 * <br>
 * //成功结果示例<br>
 * "Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * "ret":{<br>
 * "successList":[<br>
 * "cidxxxxxxxxx",<br>
 * "cidxxxxxxxxx1",<br>
 * "cidxxxxxxxxx2"<br>
 * ]<br>
 * },<br>
 * "code":200<br>
 * }<br>
 */
public class ResAppSuccessList {
	private List<String> successList;

	/**
	 * @return the successList
	 */
	public List<String> getSuccessList() {
		return successList;
	}

	/**
	 * @param successList
	 *            the successList to set
	 */
	public void setSuccessList(List<String> successList) {
		this.successList = successList;
	}

}
