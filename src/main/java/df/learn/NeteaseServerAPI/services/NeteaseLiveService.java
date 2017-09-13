package df.learn.NeteaseServerAPI.services;

import df.learn.NeteaseServerAPI.ResultHandler;
import df.learn.NeteaseServerAPI.live.ResLive;
import df.learn.NeteaseServerAPI.live.ResLiveRet;
import df.learn.NeteaseServerAPI.live.req.ReqAppAddress;
import df.learn.NeteaseServerAPI.live.req.ReqAppCallbackSetSignKey;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannelCreate;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannelDelete;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannelPause;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannelResume;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannelSetAlwaysRecord;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannellist;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannellistPause;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannellistResume;
import df.learn.NeteaseServerAPI.live.req.ReqAppChannelstats;
import df.learn.NeteaseServerAPI.live.req.ReqAppRecordSetcallback;
import df.learn.NeteaseServerAPI.live.req.ReqAppVideoMerge;
import df.learn.NeteaseServerAPI.live.req.ReqAppVideolist;
import df.learn.NeteaseServerAPI.live.req.ReqAppVodvideolist;
import df.learn.NeteaseServerAPI.live.res.ResAppChannelCreate;
import df.learn.NeteaseServerAPI.live.res.ResAppChannellist;
import df.learn.NeteaseServerAPI.live.res.ResAppChannelstats;
import df.learn.NeteaseServerAPI.live.res.ResAppSuccessList;
import df.learn.NeteaseServerAPI.live.res.ResAppVideo;
import df.learn.NeteaseServerAPI.live.res.ResAppVideolist;
import df.learn.NeteaseServerAPI.live.res.ResAppVodvideo;

/**
 * @ClassName df.learn.NeteaseServerAPI.services.NeteaseLiveService  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:26:19 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云直播功能服务器API
 * 
 */
public interface NeteaseLiveService {

	/**  
	 * @Methods createChannel  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 创建一个直播频道


	 */
	ResLiveRet<ResAppChannelCreate> createChannel(ReqAppChannelCreate req);

	void createChannelAsync(ReqAppChannelCreate req);

	void createChannelAsync(ReqAppChannelCreate req, ResultHandler<ResLiveRet<ResAppChannelCreate>> handler);

	/**  
	 * @Methods updateChannel  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 修改频道
	 */
	ResLive updateChannel(ReqAppChannelDelete req);

	void updateChannelAsync(ReqAppChannelDelete req);

	void updateChannelAsync(ReqAppChannelDelete req, ResultHandler<ResLive> handler);

	/**  
	 * @Methods deleteChannel  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 删除频道
	 */
	ResLive deleteChannel(ReqAppChannelDelete req);

	void deleteChannelAsync(ReqAppChannelDelete req);

	void deleteChannelAsync(ReqAppChannelDelete req, ResultHandler<ResLive> handler);

	/**  
	 * @Methods getChannelStats  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 获取频道状态
	 */
	ResLiveRet<ResAppChannelstats> getChannelStats(ReqAppChannelstats req);

	void getChannelStatsAsync(ReqAppChannelstats req);

	void getChannelStatsAsync(ReqAppChannelstats req, ResultHandler<ResLiveRet<ResAppChannelstats>> handler);

	/**  
	 * @Methods listChannel  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 获取频道列表
	 */
	ResLiveRet<ResAppChannellist> listChannel(ReqAppChannellist req);

	void listChannelAsync(ReqAppChannellist req);

	void listChannelAsync(ReqAppChannellist req, ResultHandler<ResLiveRet<ResAppChannellist>> handler);

	/**  
	 * @Methods resetAddress  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 重新获取推流地址
	 */
	ResLiveRet<ResAppChannelCreate> resetAddress(ReqAppAddress req);

	void resetAddressAsync(ReqAppAddress req);

	void resetAddressAsync(ReqAppAddress req, ResultHandler<ResLiveRet<ResAppChannelCreate>> handler);

	/**  
	 * @Methods setChannelAlwaysRecord  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 设置频道为录制状态
	 */
	ResLive setChannelAlwaysRecord(ReqAppChannelSetAlwaysRecord req);

	void setChannelAlwaysRecordAsync(ReqAppChannelSetAlwaysRecord req);

	void setChannelAlwaysRecordAsync(ReqAppChannelSetAlwaysRecord req, ResultHandler<ResLive> handler);

	/**  
	 * @Methods pauseChannel  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 禁用频道
	 */
	ResLive pauseChannel(ReqAppChannelPause req);

	void pauseChannelAsync(ReqAppChannelPause req);

	void pauseChannelAsync(ReqAppChannelPause req, ResultHandler<ResLive> handler);

	/**  
	 * @Methods pauseChannellist  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 批量禁用频道
	 */
	ResLiveRet<ResAppSuccessList> pauseChannellist(ReqAppChannellistPause req);

	void pauseChannellistAsync(ReqAppChannellistPause req);

	void pauseChannellistAsync(ReqAppChannellistPause req, ResultHandler<ResLiveRet<ResAppSuccessList>> handler);

	/**  
	 * @Methods resumeChannel  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 恢复频道
	 */
	ResLive resumeChannel(ReqAppChannelResume req);

	void resumeChannelAsync(ReqAppChannelResume req);

	void resumeChannelAsync(ReqAppChannelResume req, ResultHandler<ResLive> handler);

	/**  
	 * @Methods resumeChannellist  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 批量恢复频道
	 */
	ResLiveRet<ResAppSuccessList> resumeChannellist(ReqAppChannellistResume req);

	void resumeChannellistAsync(ReqAppChannellistResume req);

	void resumeChannellistAsync(ReqAppChannellistResume req, ResultHandler<ResLiveRet<ResAppSuccessList>> handler);

	/**  
	 * @Methods listVideo  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 获取录制视频文件列表
	 */
	ResLiveRet<ResAppVideolist<ResAppVideo>> listVideo(ReqAppVideolist req);

	void listVideoAsync(ReqAppVideolist req);

	void listVideoAsync(ReqAppVideolist req, ResultHandler<ResLiveRet<ResAppVideolist<ResAppVideo>>> handler);

	/**  
	 * @Methods listVodvideo  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 获取某一时间范围的录制视频文件列表
	 */
	ResLiveRet<ResAppVideolist<ResAppVodvideo>> listVodvideo(ReqAppVodvideolist req);

	void listVodvideoAsync(ReqAppVodvideolist req);

	void listVodvideoAsync(ReqAppVodvideolist req, ResultHandler<ResLiveRet<ResAppVideolist<ResAppVodvideo>>> handler);

	/**  
	 * @Methods setRecordCallback  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 设置视频录制回调地址
	 */
	ResLiveRet<Boolean> setRecordCallback(ReqAppRecordSetcallback req);

	void setRecordCallbackAsync(ReqAppRecordSetcallback req);

	void setRecordCallbackAsync(ReqAppRecordSetcallback req, ResultHandler<ResLiveRet<Boolean>> handler);

	/**  
	 * @Methods setCallbackSignKey  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 设置回调的加签秘钥
	 */
	ResLiveRet<Boolean> setCallbackSignKey(ReqAppCallbackSetSignKey req);

	void setCallbackSignKeyAsync(ReqAppCallbackSetSignKey req);

	void setCallbackSignKeyAsync(ReqAppCallbackSetSignKey req, ResultHandler<ResLiveRet<Boolean>> handler);

	/**  
	 * @Methods mergeVideo  
	 * 
	 * @param req
	 * @return 
	 * 
	 * @Description 录制文件合并
	 */
	ResLiveRet<Boolean> mergeVideo(ReqAppVideoMerge req);

	void mergeVideoAsync(ReqAppVideoMerge req);

	void mergeVideoAsync(ReqAppVideoMerge req, ResultHandler<ResLiveRet<Boolean>> handler);
}
