package df.learn.NeteaseServerAPI.nim.res.chat;

public class ResChatroomCreate {

	private long roomid;
	private boolean valid;
	private boolean muted;// 聊天室是否处于全体禁言状态，全体禁言时仅管理员和创建者可以发言
	private String announcement;
	private String name;
	private String broadcasturl;
	private String ext;
	private String creator;
	private int onlineusercount;

	/**
	 * @return the roomid
	 */
	public long getRoomid() {
		return roomid;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @return the muted
	 */
	public boolean isMuted() {
		return muted;
	}

	/**
	 * @return the announcement
	 */
	public String getAnnouncement() {
		return announcement;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the broadcasturl
	 */
	public String getBroadcasturl() {
		return broadcasturl;
	}

	/**
	 * @return the ext
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @return the onlineusercount
	 */
	public int getOnlineusercount() {
		return onlineusercount;
	}

	/**
	 * @param roomid
	 *            the roomid to set
	 */
	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	/**
	 * @param valid
	 *            the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * @param muted
	 *            the muted to set
	 */
	public void setMuted(boolean muted) {
		this.muted = muted;
	}

	/**
	 * @param announcement
	 *            the announcement to set
	 */
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param broadcasturl
	 *            the broadcasturl to set
	 */
	public void setBroadcasturl(String broadcasturl) {
		this.broadcasturl = broadcasturl;
	}

	/**
	 * @param ext
	 *            the ext to set
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}

	/**
	 * @param creator
	 *            the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * @param onlineusercount
	 *            the onlineusercount to set
	 */
	public void setOnlineusercount(int onlineusercount) {
		this.onlineusercount = onlineusercount;
	}

}
