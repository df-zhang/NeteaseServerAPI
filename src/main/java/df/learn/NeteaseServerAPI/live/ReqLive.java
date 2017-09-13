package df.learn.NeteaseServerAPI.live;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import df.learn.NeteaseServerAPI.NeteaseRequest;

@SuppressWarnings("serial")
public abstract class ReqLive implements NeteaseRequest, Serializable {
	public static final String LIVE_DOMAIN = "https://vcloud.163.com/";
	private Map<String, String> headers = new HashMap<String, String>(5);

	public ReqLive() {
		headers.put("Content-Type", "application/json;charset=utf-8");
	}

	@Override
	public String getURL() {
		return LIVE_DOMAIN + getUri();
	}

	@Override
	public String getMethod() {
		return "POST";
	}

	@Override
	public Map<String, String> getHeaders() {
		return headers;
	}

	protected abstract String getUri();

}
