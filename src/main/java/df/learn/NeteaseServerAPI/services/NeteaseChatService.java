package df.learn.NeteaseServerAPI.services;

import df.learn.NeteaseServerAPI.ResultHandler;
import df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomCreate;
import df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomGet;
import df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomSendMsg;
import df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomSetMemberRole;
import df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomToggleCloseStat;
import df.learn.NeteaseServerAPI.nim.req.chat.ReqChatroomUpdate;
import df.learn.NeteaseServerAPI.nim.res.chat.ResChatroom;
import df.learn.NeteaseServerAPI.nim.res.chat.ResChatroomCreate;
import df.learn.NeteaseServerAPI.nim.res.chat.ResChatroomSendMsg;
import df.learn.NeteaseServerAPI.nim.res.chat.ResChatroomSetMemberRole;
import df.learn.NeteaseServerAPI.nim.res.chat.ResDesc;

/**
 * @ClassName df.learn.NeteaseServerAPI.services.NeteaseChatService
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:07:56
 * @Author 854154025@qq.com
 * 
 * @Description 网易云IM聊天室功能服务器API接口<br>
 * 参考文档：http://dev.netease.im/docs/product/IM即时通讯/服务端API文档?#聊天室
 * 
 */
public interface NeteaseChatService {
	/**
	 * @Methods createChatroom
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 创建聊天室
	 */
	ResChatroom createChatroom(ReqChatroomCreate req);

	void createChatroomAsync(ReqChatroomCreate req);

	void createChatroomAsync(ReqChatroomCreate req, ResultHandler<ResChatroom> handler);

	/**
	 * @Methods getChatroom
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 查询聊天室信息
	 */
	ResChatroom getChatroom(ReqChatroomGet req);

	void getChatroomAsync(ReqChatroomGet req);

	void getChatroomAsync(ReqChatroomGet req, ResultHandler<ResChatroom> handler);

	/**
	 * @Methods updateChatroom
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 更新聊天室信息
	 */
	ResChatroom updateChatroom(ReqChatroomUpdate req);

	void updateChatroomAsync(ReqChatroomUpdate req);

	void updateChatroomAsync(ReqChatroomUpdate req, ResultHandler<ResChatroom> handler);

	/**
	 * @Methods toggleChatroomCloseStat
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 修改聊天室开/关闭状态
	 */
	ResDesc<ResChatroomCreate> toggleChatroomCloseStat(ReqChatroomToggleCloseStat req);

	void toggleChatroomCloseStatAsync(ReqChatroomToggleCloseStat req);

	void toggleChatroomCloseStatAsync(ReqChatroomToggleCloseStat req, ResultHandler<ResDesc<ResChatroomCreate>> handler);

	/**
	 * @Methods setMemberRole
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 设置聊天室内用户角色
	 */
	ResDesc<ResChatroomSetMemberRole> setMemberRole(ReqChatroomSetMemberRole req);

	void setMemberRoleAsync(ReqChatroomSetMemberRole req);

	void setMemberRoleAsync(ReqChatroomSetMemberRole req, ResultHandler<ResDesc<ResChatroomSetMemberRole>> handler);

	// TODO 缺少请求聊天室地址
	/**
	 * @Methods sendMsg
	 * 
	 * @param req
	 * @return
	 * 
	 * @Description 发送聊天室消息
	 */
	ResDesc<ResChatroomSendMsg> sendMsg(ReqChatroomSendMsg req);

	void sendMsgAsync(ReqChatroomSendMsg req);

	void sendMsgAsync(ReqChatroomSendMsg req, ResultHandler<ResDesc<ResChatroomSendMsg>> handler);
	// TODO 缺少其它
}
