package df.learn.NeteaseServerAPI.services;

import java.util.List;

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

/**
 * @ClassName df.learn.NeteaseServerAPI.services.NeteaseNIMUserService
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:30:05
 * @Author 854154025@qq.com
 * 
 * @Description 网易云IM通信ID功能服务器API
 * 
 */
public interface NeteaseNIMUserService {
	/**
	 * @Methods createUser
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 创建网易云通信ID
	 */
	ResNIMInfo<ResUserInfo> createUser(ReqUserCreate req);

	void createUserAsync(ReqUserCreate req);

	void createUserAsync(ReqUserCreate req, ResultHandler<ResNIMInfo<ResUserInfo>> handler);

	/**
	 * @Methods updateUser
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 网易云通信ID更新
	 */
	NeteaseResponse updateUser(ReqUserUpdate req);

	void updateUserAsync(ReqUserUpdate req);

	void updateUserAsync(ReqUserUpdate req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods refreshUserToken
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 更新并获取新token
	 */
	ResNIMInfo<ResUserInfo> refreshUserToken(ReqUserRefreshToken req);

	void refreshUserTokenAsync(ReqUserRefreshToken req);

	void refreshUserTokenAsync(ReqUserRefreshToken req, ResultHandler<ResNIMInfo<ResUserInfo>> handler);

	/**
	 * @Methods blockUser
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 封禁网易云通信ID
	 */
	NeteaseResponse blockUser(ReqUserBlock req);

	void blockUserAsync(ReqUserBlock req);

	void blockUserAsync(ReqUserBlock req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods unblockUser
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 解禁网易云通信ID
	 */
	NeteaseResponse unblockUser(ReqUserUnblock req);

	void unblockUserAsync(ReqUserUnblock req);

	void unblockUserAsync(ReqUserUnblock req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods updateUinfo
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 更新用户名片
	 */
	NeteaseResponse updateUinfo(ReqUserUpdateUinfo req);

	void updateUinfoAsync(ReqUserUpdateUinfo req);

	void updateUinfoAsync(ReqUserUpdateUinfo req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods getUinfos
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 获取用户名片
	 */
	ResNIMUinfos<List<ResUserInfo>> getUinfos(ReqUserGetUinfos req);

	void getUinfosAsync(ReqUserGetUinfos req);

	void getUinfosAsync(ReqUserGetUinfos req, ResultHandler<ResNIMUinfos<List<ResUserInfo>>> handler);

	/**
	 * @Methods setDonnop
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 设置桌面端在线时，移动端是否需要推送
	 * 
	 */
	NeteaseResponse setDonnop(ReqUserSetDonnop req);

	void setDonnopAsync(ReqUserSetDonnop req);

	void setDonnopAsync(ReqUserSetDonnop req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods addFriend
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 加好友
	 */
	NeteaseResponse addFriend(ReqFriendAdd req);

	void addFriendAsync(ReqFriendAdd req);

	void addFriendAsync(ReqFriendAdd req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods setSpecialRelation
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 设置黑名单/静音
	 */
	NeteaseResponse setSpecialRelation(ReqUserSetSpecialRelation req);

	void setSpecialRelationAsync(ReqUserSetSpecialRelation req);

	void setSpecialRelationAsync(ReqUserSetSpecialRelation req, ResultHandler<NeteaseResponse> handler);

	/**
	 * @Methods listBlackAndMuteList
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 查看指定用户的黑名单和静音列表
	 * 
	 */
	ResNIMListBlackAndMuteList listBlackAndMuteList(ReqUserListBlackAndMuteList req);

	void listBlackAndMuteListAsync(ReqUserListBlackAndMuteList req);

	void listBlackAndMuteListAsync(ReqUserListBlackAndMuteList req, ResultHandler<ResNIMListBlackAndMuteList> handler);
}
