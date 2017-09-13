package df.learn.NeteaseServerAPI.services;

import javax.annotation.Resource;

import com.fasterxml.jackson.core.type.TypeReference;

import df.learn.NeteaseServerAPI.APIHelper;
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

// @Service
public class NeteaseLiveServiceImpl implements NeteaseLiveService {

	// @Resource
	private APIHelper apiHelper;

	public NeteaseLiveServiceImpl(APIHelper apiHelper) {
		this.apiHelper = apiHelper;
	}

	@Override
	public ResLiveRet<ResAppChannelCreate> createChannel(ReqAppChannelCreate req) {
		return apiHelper.api(req, liveRetAndChannelCreateTypeReference);
	}

	@Override
	public void createChannelAsync(ReqAppChannelCreate req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void createChannelAsync(ReqAppChannelCreate req, ResultHandler<ResLiveRet<ResAppChannelCreate>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndChannelCreateTypeReference);
	}

	@Override
	public ResLive updateChannel(ReqAppChannelDelete req) {
		return apiHelper.api(req, liveTypeReference);
	}

	@Override
	public void updateChannelAsync(ReqAppChannelDelete req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void updateChannelAsync(ReqAppChannelDelete req, ResultHandler<ResLive> handler) {
		apiHelper.apiAsync(req, handler, liveTypeReference);
	}

	@Override
	public ResLive deleteChannel(ReqAppChannelDelete req) {
		return apiHelper.api(req, liveTypeReference);
	}

	@Override
	public void deleteChannelAsync(ReqAppChannelDelete req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void deleteChannelAsync(ReqAppChannelDelete req, ResultHandler<ResLive> handler) {
		apiHelper.apiAsync(req, handler, liveTypeReference);
	}

	@Override
	public ResLiveRet<ResAppChannelstats> getChannelStats(ReqAppChannelstats req) {
		return apiHelper.api(req, liveRetAndChannelstatsTypeReference);
	}

	@Override
	public void getChannelStatsAsync(ReqAppChannelstats req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void getChannelStatsAsync(ReqAppChannelstats req, ResultHandler<ResLiveRet<ResAppChannelstats>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndChannelstatsTypeReference);
	}

	@Override
	public ResLiveRet<ResAppChannellist> listChannel(ReqAppChannellist req) {

		return apiHelper.api(req, liveRetAndListChannelstatsTypeReference);
	}

	@Override
	public void listChannelAsync(ReqAppChannellist req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void listChannelAsync(ReqAppChannellist req, ResultHandler<ResLiveRet<ResAppChannellist>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndListChannelstatsTypeReference);
	}

	@Override
	public ResLiveRet<ResAppChannelCreate> resetAddress(ReqAppAddress req) {
		return apiHelper.api(req, liveRetAndChannelCreateTypeReference);
	}

	@Override
	public void resetAddressAsync(ReqAppAddress req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void resetAddressAsync(ReqAppAddress req, ResultHandler<ResLiveRet<ResAppChannelCreate>> handler) {

		apiHelper.apiAsync(req, handler, liveRetAndChannelCreateTypeReference);
	}

	@Override
	public ResLive setChannelAlwaysRecord(ReqAppChannelSetAlwaysRecord req) {
		return apiHelper.api(req, liveTypeReference);
	}

	@Override
	public void setChannelAlwaysRecordAsync(ReqAppChannelSetAlwaysRecord req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void setChannelAlwaysRecordAsync(ReqAppChannelSetAlwaysRecord req, ResultHandler<ResLive> handler) {
		apiHelper.apiAsync(req, handler, liveTypeReference);
	}

	@Override
	public ResLive pauseChannel(ReqAppChannelPause req) {
		return apiHelper.api(req, liveTypeReference);
	}

	@Override
	public void pauseChannelAsync(ReqAppChannelPause req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void pauseChannelAsync(ReqAppChannelPause req, ResultHandler<ResLive> handler) {
		apiHelper.apiAsync(req, handler, liveTypeReference);
	}

	@Override
	public ResLiveRet<ResAppSuccessList> pauseChannellist(ReqAppChannellistPause req) {

		return apiHelper.api(req, liveRetAndSuccessListTypeReference);
	}

	@Override
	public void pauseChannellistAsync(ReqAppChannellistPause req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void pauseChannellistAsync(ReqAppChannellistPause req, ResultHandler<ResLiveRet<ResAppSuccessList>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndSuccessListTypeReference);

	}

	@Override
	public ResLive resumeChannel(ReqAppChannelResume req) {
		return apiHelper.api(req, liveTypeReference);
	}

	@Override
	public void resumeChannelAsync(ReqAppChannelResume req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void resumeChannelAsync(ReqAppChannelResume req, ResultHandler<ResLive> handler) {
		apiHelper.apiAsync(req, handler, liveTypeReference);
	}

	@Override
	public ResLiveRet<ResAppSuccessList> resumeChannellist(ReqAppChannellistResume req) {
		return apiHelper.api(req, liveRetAndSuccessListTypeReference);
	}

	@Override
	public void resumeChannellistAsync(ReqAppChannellistResume req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void resumeChannellistAsync(ReqAppChannellistResume req, ResultHandler<ResLiveRet<ResAppSuccessList>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndSuccessListTypeReference);
	}

	@Override
	public ResLiveRet<ResAppVideolist<ResAppVideo>> listVideo(ReqAppVideolist req) {
		return apiHelper.api(req, liveRetAndVideoListAndVideoTypeReference);
	}

	@Override
	public void listVideoAsync(ReqAppVideolist req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void listVideoAsync(ReqAppVideolist req, ResultHandler<ResLiveRet<ResAppVideolist<ResAppVideo>>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndVideoListAndVideoTypeReference);
	}

	@Override
	public ResLiveRet<ResAppVideolist<ResAppVodvideo>> listVodvideo(ReqAppVodvideolist req) {
		return apiHelper.api(req, liveRetAndVideoListAndVodvideoTypeReference);
	}

	@Override
	public void listVodvideoAsync(ReqAppVodvideolist req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void listVodvideoAsync(ReqAppVodvideolist req, ResultHandler<ResLiveRet<ResAppVideolist<ResAppVodvideo>>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndVideoListAndVodvideoTypeReference);
	}

	@Override
	public ResLiveRet<Boolean> setRecordCallback(ReqAppRecordSetcallback req) {
		return apiHelper.api(req, liveRetAndBooleanTypeReference);
	}

	@Override
	public void setRecordCallbackAsync(ReqAppRecordSetcallback req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void setRecordCallbackAsync(ReqAppRecordSetcallback req, ResultHandler<ResLiveRet<Boolean>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndBooleanTypeReference);
	}

	@Override
	public ResLiveRet<Boolean> setCallbackSignKey(ReqAppCallbackSetSignKey req) {
		return apiHelper.api(req, liveRetAndBooleanTypeReference);
	}

	@Override
	public void setCallbackSignKeyAsync(ReqAppCallbackSetSignKey req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void setCallbackSignKeyAsync(ReqAppCallbackSetSignKey req, ResultHandler<ResLiveRet<Boolean>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndBooleanTypeReference);
	}

	@Override
	public ResLiveRet<Boolean> mergeVideo(ReqAppVideoMerge req) {
		return apiHelper.api(req, liveRetAndBooleanTypeReference);
	}

	@Override
	public void mergeVideoAsync(ReqAppVideoMerge req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void mergeVideoAsync(ReqAppVideoMerge req, ResultHandler<ResLiveRet<Boolean>> handler) {
		apiHelper.apiAsync(req, handler, liveRetAndBooleanTypeReference);
	}

	private TypeReference<ResLiveRet<Boolean>> liveRetAndBooleanTypeReference = new TypeReference<ResLiveRet<Boolean>>() {
	};
	private TypeReference<ResLiveRet<ResAppChannelCreate>> liveRetAndChannelCreateTypeReference = new TypeReference<ResLiveRet<ResAppChannelCreate>>() {
	};
	private TypeReference<ResLiveRet<ResAppChannelstats>> liveRetAndChannelstatsTypeReference = new TypeReference<ResLiveRet<ResAppChannelstats>>() {
	};
	private TypeReference<ResLiveRet<ResAppChannellist>> liveRetAndListChannelstatsTypeReference = new TypeReference<ResLiveRet<ResAppChannellist>>() {
	};
	private TypeReference<ResLiveRet<ResAppSuccessList>> liveRetAndSuccessListTypeReference = new TypeReference<ResLiveRet<ResAppSuccessList>>() {
	};

	private TypeReference<ResLiveRet<ResAppVideolist<ResAppVideo>>> liveRetAndVideoListAndVideoTypeReference = new TypeReference<ResLiveRet<ResAppVideolist<ResAppVideo>>>() {
	};
	private TypeReference<ResLiveRet<ResAppVideolist<ResAppVodvideo>>> liveRetAndVideoListAndVodvideoTypeReference = new TypeReference<ResLiveRet<ResAppVideolist<ResAppVodvideo>>>() {
	};

	private TypeReference<ResLive> liveTypeReference = new TypeReference<ResLive>() {
	};
}
