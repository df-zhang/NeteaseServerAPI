package df.learn.NeteaseServerAPI.live.res;

/**
 * http 响应：json<br>
 * 
 * 参数 类型 说明<br>
 * ctime Long 创建频道的时间戳<br>
 * cid String 频道ID，32位字符串<br>
 * name String 频道名称<br>
 * status int 频道状态（0：空闲； 1：直播； 2：禁用； 3：直播录制）<br>
 * type int 频道类型 ( 0 : rtmp, 1 : hls, 2 : http)<br>
 * uid Long 用户ID<br>
 * needRecord int 1-开启录制； 0-关闭录制<br>
 * format int 1-flv； 0-mp4<br>
 * duration int 录制切片时长(分钟)，默认120分钟<br>
 * filename String 录制后文件名<br>
 * msg String 错误信息
 */
public class ResAppChannelstats {
	/**
	 * ctime Long 创建频道的时间戳
	 */
	private long ctime;
	/**
	 * cid String 频道ID，32位字符串
	 */
	private String cid;
	/**
	 * name String 频道名称
	 */
	private String name;
	/**
	 * status int 频道状态（0：空闲； 1：直播； 2：禁用； 3：直播录制）
	 */
	private int status;
	/**
	 * type int 频道类型 ( 0 : rtmp, 1 : hls, 2 : http)
	 */
	private int type;
	/**
	 * uid Long 用户ID
	 */
	private long uid;
	/**
	 * needRecord int 1-开启录制； 0-关闭录制
	 */
	private int needRecord;
	/**
	 * format int 1-flv； 0-mp4
	 */
	private int format;
	/**
	 * duration int 录制切片时长(分钟)，默认120分钟
	 */
	private int duration;
	/**
	 * filename String 录制后文件名
	 */
	private String filename;

	/**
	 * @return the ctime
	 */
	public long getCtime() {
		return ctime;
	}

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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the uid
	 */
	public long getUid() {
		return uid;
	}

	/**
	 * @return the needRecord
	 */
	public int getNeedRecord() {
		return needRecord;
	}

	/**
	 * @return the format
	 */
	public int getFormat() {
		return format;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param ctime
	 *            the ctime to set
	 */
	public void setCtime(long ctime) {
		this.ctime = ctime;
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
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(long uid) {
		this.uid = uid;
	}

	/**
	 * @param needRecord
	 *            the needRecord to set
	 */
	public void setNeedRecord(int needRecord) {
		this.needRecord = needRecord;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(int format) {
		this.format = format;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

}
