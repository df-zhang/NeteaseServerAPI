package df.learn.NeteaseServerAPI.live;

public class ResLiveRet<T> extends ResLive {
	protected T ret;

	/**
	 * @return the ret
	 */
	public T getRet() {
		return ret;
	}

	/**
	 * @param ret
	 *            the ret to set
	 */
	public void setRet(T ret) {
		this.ret = ret;
	}
}
