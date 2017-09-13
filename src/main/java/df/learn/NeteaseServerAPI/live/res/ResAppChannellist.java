package df.learn.NeteaseServerAPI.live.res;

import java.util.List;

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
public class ResAppChannellist {

	private int pnum;
	private int totalPnum;
	private int records;
	private long totalRecords;

	private List<ResAppChannelstats> list;

	/**
	 * @return the pnum
	 */
	public int getPnum() {
		return pnum;
	}

	/**
	 * @return the totalPnum
	 */
	public int getTotalPnum() {
		return totalPnum;
	}

	/**
	 * @return the records
	 */
	public int getRecords() {
		return records;
	}

	/**
	 * @return the totalRecords
	 */
	public long getTotalRecords() {
		return totalRecords;
	}

	/**
	 * @return the list
	 */
	public List<ResAppChannelstats> getList() {
		return list;
	}

	/**
	 * @param pnum the pnum to set
	 */
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	/**
	 * @param totalPnum the totalPnum to set
	 */
	public void setTotalPnum(int totalPnum) {
		this.totalPnum = totalPnum;
	}

	/**
	 * @param records the records to set
	 */
	public void setRecords(int records) {
		this.records = records;
	}

	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<ResAppChannelstats> list) {
		this.list = list;
	}

}
