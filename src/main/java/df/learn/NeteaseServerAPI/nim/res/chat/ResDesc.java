package df.learn.NeteaseServerAPI.nim.res.chat;

import df.learn.NeteaseServerAPI.NeteaseResponse;

public class ResDesc<T> extends NeteaseResponse {
	private T desc;

	/**
	 * @return the desc
	 */
	public T getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(T desc) {
		this.desc = desc;
	}
}