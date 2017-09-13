package df.learn.NeteaseServerAPI.nim.res.chat;

import df.learn.NeteaseServerAPI.NeteaseResponse;

public class ResChatroom  extends NeteaseResponse{
	private ResChatroomCreate chatroom;

	public ResChatroomCreate getChatroom() {
		return this.chatroom;
	}

	public void setChatroom(ResChatroomCreate chatroom) {
		this.chatroom = chatroom;
	};
}