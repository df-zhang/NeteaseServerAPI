package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

public class ReqAppVodvideolist extends ReqLive {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8155292528301361710L;

	@Override
	protected String getUri() {
		return "app/vodvideolist";
	}

	private String cid;
	private long beginTime;
	private long endTime;

	public String getCid() {
		return this.cid;
	}

	public long getBeginTime() {
		return this.beginTime;
	}

	public long getEndTime() {
		return this.endTime;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
}