package df.learn.NeteaseServerAPI.nim.res.chat;
public class ResChatroomSendMsg {private long time;
private String msgid_client;
private String fromAvator;
private String fromClientType;
private String attach;
private long roomId;
private String fromAccount;
private String fromNick;
private int type;
private String ext;
public long getTime(){return this.time;}
public String getMsgid_client(){return this.msgid_client;}
public String getFromAvator(){return this.fromAvator;}
public String getFromClientType(){return this.fromClientType;}
public String getAttach(){return this.attach;}
public long getRoomId(){return this.roomId;}
public String getFromAccount(){return this.fromAccount;}
public String getFromNick(){return this.fromNick;}
public int getType(){return this.type;}
public String getExt(){return this.ext;}
public void setTime(long time){this.time = time;};
public void setMsgid_client(String msgid_client){this.msgid_client = msgid_client;};
public void setFromAvator(String fromAvator){this.fromAvator = fromAvator;};
public void setFromClientType(String fromClientType){this.fromClientType = fromClientType;};
public void setAttach(String attach){this.attach = attach;};
public void setRoomId(long roomId){this.roomId = roomId;};
public void setFromAccount(String fromAccount){this.fromAccount = fromAccount;};
public void setFromNick(String fromNick){this.fromNick = fromNick;};
public void setType(int type){this.type = type;};
public void setExt(String ext){this.ext = ext;};
}
