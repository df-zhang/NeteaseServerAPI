package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 获取用户直播频道列表<br>
 * 
 * 2.5.2 请求说明<br>
 * 复制POST https://vcloud.163.com/app/channellist HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 * 2.5.3 参数说明<br>
 * 参数 类型 说明 必须<br>
 * records int 单页记录数，默认值为10 否<br>
 * pnum int 要取第几页，默认值为1 否<br>
 * ofield String 排序的域，支持的排序域为：ctime（默认） 否<br>
 * sort int 升序还是降序，1升序，0降序，默认为desc 否<br>
 * 2.5.4 curl请求示例<br>
 * 复制curl -X POST -H "Content-Type: application/json" -H "AppKey: 29781bbc4db54742a3ebcxxxxxxxxxxx" -H "Nonce: 12345" -H "CurTime: 1469171950571" -H "CheckSum: 4ba6ca70c685eb900917e423eadaxxxxxxxxxxxxx" -d '{"records":10, "pnum":1, "ofield": "ctime", "sort":
 * 0}' https://vcloud.163.com/app/channellist
 */
public class ReqAppChannellist extends ReqLive {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3357889779069826445L;

	@Override
	protected String getUri() {
		return "app/channellist";
	}

	/**
	 * records int 单页记录数，默认值为10 否
	 */
	private int records;
	/**
	 * pnum int 要取第几页，默认值为1 否
	 */
	private int pnum;
	/**
	 * ofield String 排序的域，支持的排序域为：ctime（默认） 否
	 */
	private String ofield;
	/**
	 * sort int 升序还是降序，1升序，0降序，默认为desc 否
	 */
	private int sort;

	/**
	 * @return the records
	 */
	public int getRecords() {
		return records;
	}

	/**
	 * @return the pnum
	 */
	public int getPnum() {
		return pnum;
	}

	/**
	 * @return the ofield
	 */
	public String getOfield() {
		return ofield;
	}

	/**
	 * @return the sort
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * @param records the records to set
	 */
	public void setRecords(int records) {
		this.records = records;
	}

	/**
	 * @param pnum the pnum to set
	 */
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	/**
	 * @param ofield the ofield to set
	 */
	public void setOfield(String ofield) {
		this.ofield = ofield;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}

}
