package df.learn.NeteaseServerAPI.live.res;

import java.util.List;

public class ResAppVideolist<T> {
	private List<T> videoList;

	public List<T> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<T> videoList) {
		this.videoList = videoList;
	};
}