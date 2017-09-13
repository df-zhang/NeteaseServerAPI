package df.learn.NeteaseServerAPI.services;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import df.learn.NeteaseServerAPI.APIHelper;
import df.learn.NeteaseServerAPI.NeteaseResponse;
import df.learn.NeteaseServerAPI.ResultHandler;
import df.learn.NeteaseServerAPI.nim.ResNIMInfo;
import df.learn.NeteaseServerAPI.nim.req.user.ReqFriendAdd;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserBlock;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserCreate;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserGetUinfos;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserListBlackAndMuteList;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserRefreshToken;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserSetDonnop;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserSetSpecialRelation;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserUnblock;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserUpdate;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserUpdateUinfo;
import df.learn.NeteaseServerAPI.nim.res.user.ResNIMListBlackAndMuteList;
import df.learn.NeteaseServerAPI.nim.res.user.ResNIMUinfos;
import df.learn.NeteaseServerAPI.nim.res.user.ResUserInfo;

// @Service
public class NeteaseNIMUserServiceImpl implements NeteaseNIMUserService {
	// @Resource
	private APIHelper apiHelper;

	public NeteaseNIMUserServiceImpl(APIHelper apiHelper) {
		this.apiHelper = apiHelper;
	}

	@Override
	public ResNIMInfo<ResUserInfo> createUser(ReqUserCreate req) {
		return apiHelper.api(req, nimInfoAndUserInfoTypeReference);
	}

	@Override
	public void createUserAsync(ReqUserCreate req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void createUserAsync(ReqUserCreate req, ResultHandler<ResNIMInfo<ResUserInfo>> handler) {
		apiHelper.apiAsync(req, handler, nimInfoAndUserInfoTypeReference);
	}

	@Override
	public NeteaseResponse updateUser(ReqUserUpdate req) {
		return apiHelper.api(req, neteaseResponseTypeReference);
	}

	@Override
	public void updateUserAsync(ReqUserUpdate req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void updateUserAsync(ReqUserUpdate req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public ResNIMInfo<ResUserInfo> refreshUserToken(ReqUserRefreshToken req) {
		return apiHelper.api(req, nimInfoAndUserInfoTypeReference);
	}

	@Override
	public void refreshUserTokenAsync(ReqUserRefreshToken req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void refreshUserTokenAsync(ReqUserRefreshToken req, ResultHandler<ResNIMInfo<ResUserInfo>> handler) {
		apiHelper.apiAsync(req, handler, nimInfoAndUserInfoTypeReference);
	}

	@Override
	public NeteaseResponse blockUser(ReqUserBlock req) {
		return apiHelper.api(req, neteaseResponseTypeReference);
	}

	@Override
	public void blockUserAsync(ReqUserBlock req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void blockUserAsync(ReqUserBlock req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public NeteaseResponse unblockUser(ReqUserUnblock req) {
		return apiHelper.api(req, new TypeReference<NeteaseResponse>() {
		});
	}

	@Override
	public void unblockUserAsync(ReqUserUnblock req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void unblockUserAsync(ReqUserUnblock req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public NeteaseResponse updateUinfo(ReqUserUpdateUinfo req) {
		return apiHelper.api(req, new TypeReference<NeteaseResponse>() {
		});
	}

	@Override
	public void updateUinfoAsync(ReqUserUpdateUinfo req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void updateUinfoAsync(ReqUserUpdateUinfo req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public ResNIMUinfos<List<ResUserInfo>> getUinfos(ReqUserGetUinfos req) {
		return apiHelper.api(req, nimUinfosAndUserInfoTypeReference);
	}

	@Override
	public void getUinfosAsync(ReqUserGetUinfos req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void getUinfosAsync(ReqUserGetUinfos req, ResultHandler<ResNIMUinfos<List<ResUserInfo>>> handler) {
		apiHelper.apiAsync(req, handler, nimUinfosAndUserInfoTypeReference);
	}

	@Override
	public NeteaseResponse setDonnop(ReqUserSetDonnop req) {
		return apiHelper.api(req, neteaseResponseTypeReference);
	}

	@Override
	public void setDonnopAsync(ReqUserSetDonnop req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void setDonnopAsync(ReqUserSetDonnop req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public NeteaseResponse addFriend(ReqFriendAdd req) {
		return apiHelper.api(req, new TypeReference<NeteaseResponse>() {
		});
	}

	@Override
	public void addFriendAsync(ReqFriendAdd req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void addFriendAsync(ReqFriendAdd req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public NeteaseResponse setSpecialRelation(ReqUserSetSpecialRelation req) {
		return apiHelper.api(req, neteaseResponseTypeReference);
	}

	@Override
	public void setSpecialRelationAsync(ReqUserSetSpecialRelation req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void setSpecialRelationAsync(ReqUserSetSpecialRelation req, ResultHandler<NeteaseResponse> handler) {
		apiHelper.apiAsync(req, handler, neteaseResponseTypeReference);
	}

	@Override
	public ResNIMListBlackAndMuteList listBlackAndMuteList(ReqUserListBlackAndMuteList req) {
		return apiHelper.api(req, listBlackAndMuteListTypeReference);
	}

	@Override
	public void listBlackAndMuteListAsync(ReqUserListBlackAndMuteList req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void listBlackAndMuteListAsync(ReqUserListBlackAndMuteList req, ResultHandler<ResNIMListBlackAndMuteList> handler) {
		apiHelper.apiAsync(req, handler, listBlackAndMuteListTypeReference);
	}

	private TypeReference<ResNIMInfo<ResUserInfo>> nimInfoAndUserInfoTypeReference = new TypeReference<ResNIMInfo<ResUserInfo>>() {
	};
	private TypeReference<NeteaseResponse> neteaseResponseTypeReference = new TypeReference<NeteaseResponse>() {
	};
	private TypeReference<ResNIMUinfos<List<ResUserInfo>>> nimUinfosAndUserInfoTypeReference = new TypeReference<ResNIMUinfos<List<ResUserInfo>>>() {
	};
	private TypeReference<ResNIMListBlackAndMuteList> listBlackAndMuteListTypeReference = new TypeReference<ResNIMListBlackAndMuteList>() {
	};
}
