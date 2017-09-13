package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

public class ReqAppCallbackSetSignKey extends ReqLive {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1206645693814065424L;

	@Override
	protected String getUri() {
		return "app/callback/setSignKey";
	}

	private String signKey;

	public String getSignKey() {
		return this.signKey;
	}

	public void setSignKey(String signKey) {
		this.signKey = signKey;
	}
}
