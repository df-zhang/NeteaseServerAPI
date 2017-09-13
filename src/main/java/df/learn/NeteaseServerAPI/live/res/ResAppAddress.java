package df.learn.NeteaseServerAPI.live.res;

/**
 * http 响应：json<br>
 * 
 * 参数 类型 说明<br>
 * code int 状态码<br>
 * pushUrl String 推流地址<br>
 * httpPullUrl String http拉流地址<br>
 * hlsPullUrl String hls拉流地址<br>
 * rtmpPullUrl String rtmp拉流地址<br>
 * msg String 错误信息<br>
 */
public class ResAppAddress {
	/**
	 * cid String 频道ID，32位字符串
	 */
	private String cid;

	/**
	 * name String 频道名称
	 */
	private String name;

	/**
	 * pushUrl String 推流地址
	 */
	private String pushUrl;

	/**
	 * httpPullUrl String http拉流地址
	 */
	private String httpPullUrl;

	/**
	 * hlsPullUrl String hls拉流地址
	 */
	private String hlsPullUrl;

	/**
	 * rtmpPullUrl String rtmp拉流地址
	 */
	private String rtmpPullUrl;

	/**
	 * @return the cid
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the pushUrl
	 */
	public String getPushUrl() {
		return pushUrl;
	}

	/**
	 * @return the httpPullUrl
	 */
	public String getHttpPullUrl() {
		return httpPullUrl;
	}

	/**
	 * @return the hlsPullUrl
	 */
	public String getHlsPullUrl() {
		return hlsPullUrl;
	}

	/**
	 * @return the rtmpPullUrl
	 */
	public String getRtmpPullUrl() {
		return rtmpPullUrl;
	}

	/**
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param pushUrl
	 *            the pushUrl to set
	 */
	public void setPushUrl(String pushUrl) {
		this.pushUrl = pushUrl;
	}

	/**
	 * @param httpPullUrl
	 *            the httpPullUrl to set
	 */
	public void setHttpPullUrl(String httpPullUrl) {
		this.httpPullUrl = httpPullUrl;
	}

	/**
	 * @param hlsPullUrl
	 *            the hlsPullUrl to set
	 */
	public void setHlsPullUrl(String hlsPullUrl) {
		this.hlsPullUrl = hlsPullUrl;
	}

	/**
	 * @param rtmpPullUrl
	 *            the rtmpPullUrl to set
	 */
	public void setRtmpPullUrl(String rtmpPullUrl) {
		this.rtmpPullUrl = rtmpPullUrl;
	}
}
