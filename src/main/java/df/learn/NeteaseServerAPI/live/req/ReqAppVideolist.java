package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

public class ReqAppVideolist extends ReqLive {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2437487830169200231L;

	@Override
	protected String getUri() {
		return "app/videolist";
	}

	private String cid;

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
}