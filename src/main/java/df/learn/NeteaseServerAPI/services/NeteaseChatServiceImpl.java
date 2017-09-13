package df.learn.NeteaseServerAPI.services;

import com.fasterxml.jackson.core.type.TypeReference;

import df.learn.NeteaseServerAPI.APIHelper;
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

// @Service
public class NeteaseChatServiceImpl implements NeteaseChatService {
	// @Resource
	private APIHelper apiHelper;

	// public NeteaseChatServiceImpl(){}
	public NeteaseChatServiceImpl(APIHelper apiHelper) {
		this.apiHelper = apiHelper;
	}

	@Override
	public ResChatroom createChatroom(ReqChatroomCreate req) {
		return apiHelper.api(req, chatroomTypeReference);
	}

	@Override
	public void createChatroomAsync(ReqChatroomCreate req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void createChatroomAsync(ReqChatroomCreate req, ResultHandler<ResChatroom> handler) {
		apiHelper.apiAsync(req, handler, chatroomTypeReference);
	}

	@Override
	public ResChatroom getChatroom(ReqChatroomGet req) {
		return apiHelper.api(req, chatroomTypeReference);
	}

	@Override
	public void getChatroomAsync(ReqChatroomGet req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void getChatroomAsync(ReqChatroomGet req, ResultHandler<ResChatroom> handler) {
		apiHelper.apiAsync(req, handler, chatroomTypeReference);
	}

	@Override
	public ResChatroom updateChatroom(ReqChatroomUpdate req) {
		return apiHelper.api(req, chatroomTypeReference);
	}

	@Override
	public void updateChatroomAsync(ReqChatroomUpdate req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void updateChatroomAsync(ReqChatroomUpdate req, ResultHandler<ResChatroom> handler) {
		apiHelper.apiAsync(req, handler, chatroomTypeReference);
	}

	@Override
	public ResDesc<ResChatroomCreate> toggleChatroomCloseStat(ReqChatroomToggleCloseStat req) {
		return apiHelper.api(req, descChatroomCreateTypeReference);
	}

	@Override
	public void toggleChatroomCloseStatAsync(ReqChatroomToggleCloseStat req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void toggleChatroomCloseStatAsync(ReqChatroomToggleCloseStat req, ResultHandler<ResDesc<ResChatroomCreate>> handler) {
		apiHelper.apiAsync(req, handler, descChatroomCreateTypeReference);
	}

	@Override
	public ResDesc<ResChatroomSetMemberRole> setMemberRole(ReqChatroomSetMemberRole req) {
		return apiHelper.api(req, descSetMemberRoleTypeReference);
	}

	@Override
	public void setMemberRoleAsync(ReqChatroomSetMemberRole req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void setMemberRoleAsync(ReqChatroomSetMemberRole req, ResultHandler<ResDesc<ResChatroomSetMemberRole>> handler) {
		apiHelper.apiAsync(req, handler, descSetMemberRoleTypeReference);
	}

	@Override
	public ResDesc<ResChatroomSendMsg> sendMsg(ReqChatroomSendMsg req) {
		return apiHelper.api(req, descSendMsgTypeReference);
	}

	@Override
	public void sendMsgAsync(ReqChatroomSendMsg req) {
		apiHelper.apiAsync(req, null, null);
	}

	@Override
	public void sendMsgAsync(ReqChatroomSendMsg req, ResultHandler<ResDesc<ResChatroomSendMsg>> handler) {
		apiHelper.apiAsync(req, handler, descSendMsgTypeReference);
	}

	private TypeReference<ResChatroom> chatroomTypeReference = new TypeReference<ResChatroom>() {
	};
	private TypeReference<ResDesc<ResChatroomCreate>> descChatroomCreateTypeReference = new TypeReference<ResDesc<ResChatroomCreate>>() {
	};
	private TypeReference<ResDesc<ResChatroomSetMemberRole>> descSetMemberRoleTypeReference = new TypeReference<ResDesc<ResChatroomSetMemberRole>>() {
	};
	private TypeReference<ResDesc<ResChatroomSendMsg>> descSendMsgTypeReference = new TypeReference<ResDesc<ResChatroomSendMsg>>() {
	};
}
