package df.learn.NeteaseServerAPI.live.req;

import df.learn.NeteaseServerAPI.live.ReqLive;

/**
 * 设置视频录制回调地址<br>
 * 
 * 2.14.1 接口说明 用户录制文件生成后，会将生成文件信息推送到该地址, 目前支持HTTP POST方式。<br>
 * 
 * 2.14.2 请求说明 复制POST https://vcloud.163.com/app/record/setcallback HTTP/1.1<br>
 * Content-Type: application/json;charset=utf-8 2.14.3<br>
 * 参数说明 参数 类型 说明 必须<br>
 * recordClk String 录制文件生成回调地址(http开头) 是
 * 
 * <br>
 * <br>
 * <br>
 * 回调内容示例<br>
 * 复制{"vid":"7563","orig_video_key":"8bfe052367414ef1bf8baa5b118111_1480499359291_1480499570111_2541778-00002.flv","video_name":"创建频道1_20161130-174919_20161130-175250","uid":"10000","nId":"nId1144","beginTime":"1480499359291","endTime":"1480499570111","cid":
 * "1234XXX"}<br>
 * 参数 说明<br>
 * video_name 录制后文件名，格式为filename_YYYYMMDD-HHmmssYYYYMMDD-HHmmss, 文件名录制起始时间（年月日时分秒) -录制结束时间（年月日时分秒)<br>
 * orig_video_key 视频文件在点播桶中的存储路径<br>
 * uid 用户ID<br>
 * vid 视频文件ID<br>
 * cid 频道ID<br>
 * beginTime 录制文件起始时间戳(毫秒)<br>
 * endTime 录制文件结束时间戳(毫秒)<br>
 * nId 消息ID，同一条消息nId全局唯一，网络超时或接收方返回非200状态码时根据业务规则进行重发，接收方接到多条通知情况下可用于进行消息去重<br>
 * sign(http请求头) 对回调body内容按指定格式转换后进行MD5加密生成的签名，sign字段为http请求头内容。签名规则：将body所有字段按key进行字典排序(升序)组成待签名字符串content，对字符串content+signKey进行MD5签名 如：<br>
 * beginTime=1483406830579&cid=6355099987a648bfb8fb265847&endTime=1483406857109&nId=nId1000&orig<br>
 * _video_key=6355099987a648bfbec0c53.mp4&uid=100&vid=1000&video_name=092710_20170103signKey进行MD5签名<br>
 */
public class ReqAppRecordSetcallback extends ReqLive {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3607656356295303019L;

	@Override
	protected String getUri() {
		return "app/record/setcallback";
	}

	/**
	 * recordClk String 录制文件生成回调地址(http开头) 是
	 */
	private String recordClk;

	/**
	 * recordClk String 录制文件生成回调地址(http开头) 是
	 */
	public String getRecordClk() {
		return this.recordClk;
	}

	/**
	 * recordClk String 录制文件生成回调地址(http开头) 是
	 */
	public void setRecordClk(String recordClk) {
		this.recordClk = recordClk;
	};
}
