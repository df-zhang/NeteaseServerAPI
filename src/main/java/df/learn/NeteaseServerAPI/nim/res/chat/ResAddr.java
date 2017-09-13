package df.learn.NeteaseServerAPI.nim.res.chat;

import java.util.List;

import df.learn.NeteaseServerAPI.NeteaseResponse;

public class ResAddr extends NeteaseResponse{
	private List<String> addr;

	public List<String> getAddr() {
		return this.addr;
	}

	public void setAddr(List<String> addr) {
		this.addr = addr;
	};
}