package df.learn.NeteaseServerAPI.live.req;

import java.util.List;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * <b>2.16 录制文件合并</b><br>
 * 
 * <b>2.16.1 接口说明</b><br>
 * 对于同一次录制产生的切片文件，合并成一个文件，通过查询录制文件列表接口可获取。仅支持MP4格式的文件，且同时在合并的任务数不能超过3个, 待合并视频总时长不得超过4小时，1分钟接口调用不能超过10次。如果用户设置了回调地址，也会将合并好的视频回调给用户（回调内容不包含beginTime，endTime），参看接口2.14 （设置视频录制回调地址）。<br>
 * <br>
 * <b>2.16.2 请求说明</b><br>
 * 复制POST https://vcloud.163.com/app/video/merge HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8<br>
 * <b>2.16.3 参数说明</b><br>
 * 参数 类型 说明 必须<br>
 * outputName String 合并文件的名称(不能含有空格) 是<br>
 * vidList JsonArray 待合并的视频文件的ID列表(文件ID类型为long) 是<br>
 * <b>2.16.4 curl请求示例</b><br>
 * 复制curl -X POST -H "Content-Type: application/json" -H "AppKey: 29781bbc4db54742a3ebcxxxxxxxxxxx" -H "Nonce: 12345" -H "CurTime: 1469171950571" -H "CheckSum: 4ba6ca70c685eb900917e423eadaxxxxxxxxxxxxx" -d '{"outputName":"xxxxxxxxx", "vidList": [vidxxxxxxxxx0,
 * vidxxxxxxxxx1, vidxxxxxxxxx2]}' https://vcloud.163.com/app/video/merge<br>
 * <b>2.16.5 返回说明</b><br>
 * http 响应：<b>json</b><br>
 * <br>
 * <b>参数 类型 说明</b><br>
 * code int 状态码<br>
 * result boolean 请求是否成功<br>
 * 复制//返回结果格式<br>
 * "Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * &emsp;"code" : XXX,<br>
 * &emsp;"ret" : {<br>
 * &emsp;&emsp;result : XXX<br>
 * &emsp;}<br>
 * }<br>
 * <br>
 * //成功结果示例<br>
 * "Content-Type": "application/json; charset=utf-8"<br>
 * {<br>
 * &emsp;"ret":{<br>
 * &emsp;&emsp;"result":true<br>
 * &emsp;&emsp;},<br>
 * &emsp;"code":200<br>
 * }<br>
 * <b>2.16.6 响应状态码</b><br>
 * <b>HTTP状态码 含义</b><br>
 * 200 操作成功<br>
 * 409 用户登录认证失败<br>
 * 501 内部错误<br>
 * 613 CheckSum为空<br>
 * 614 AppKey为空<br>
 * 615 CurTime为空<br>
 * 618 频道信息不存在<br>
 * 631 请求参数错误<br>
 * 638 访问频率超限<br>
 * 639 任务数量已达上限<br>
 */
public class ReqAppVideoMerge extends ReqLive {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2915492429167223872L;

	@Override
	protected String getUri() {
		return "app/video/merge";
	}

	private String outputName;
	private List<Long> vidList;

	public String getOutputName() {
		return this.outputName;
	}

	public List<Long> getVidList() {
		return this.vidList;
	}

	public void setOutputName(String outputName) {
		this.outputName = outputName;
	}

	public void setVidList(List<Long> vidList) {
		this.vidList = vidList;
	}
}