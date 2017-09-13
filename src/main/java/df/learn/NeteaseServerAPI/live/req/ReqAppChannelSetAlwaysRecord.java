package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 设置频道为录制状态，用户推流时，即可录制为视频文件。<br>
 * 
 * 2.7.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channel/setAlwaysRecord HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 */
public class ReqAppChannelSetAlwaysRecord extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7542415091607999927L;

	@Override
	protected String getUri() {
		return "app/channel/setAlwaysRecord";
	}

	/**
	 * 
	 * cid String 频道ID，32位字符串 是
	 */
	private String cid;
	/**
	 * needRecord int 1-开启录制； 0-关闭录制 是
	 */
	private int needRecord;
	/**
	 * format int 1-flv； 0-mp4 是
	 */
	private int format;
	/**
	 * duration int 录制切片时长(分钟)，5~120分钟 是
	 */
	private int duration;
	/**
	 * filename String 录制后文件名（只支持中文、字母和数字），格式为filename_YYYYMMDD-HHmmssYYYYMMDD-HHmmss, 文件名录制起始时间（年月日时分秒) -录制结束时间（年月日时分秒) 否
	 */
	private String filename;

	/**
	 * @return the cid
	 */
	public String getCid() {
		return cid;
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
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(String cid) {
		this.cid = cid;
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
