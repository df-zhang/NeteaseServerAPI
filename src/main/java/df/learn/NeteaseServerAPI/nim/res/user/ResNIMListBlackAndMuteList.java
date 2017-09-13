package df.learn.NeteaseServerAPI.nim.res.user;

import java.util.List;

import df.learn.NeteaseServerAPI.NeteaseResponse;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.ResNIMListBlackAndMuteList  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:49:46 
 * @Author 854154025@qq.com
 * 
 * @Description 网易云IM功能用户模块查看指定用户的黑名单和静音列表
 * 
 */
public class ResNIMListBlackAndMuteList extends NeteaseResponse {
	private List<String> mutelist;
	private List<String> blacklist;

	/**
	 * @return the mutelist
	 */
	public List<String> getMutelist() {
		return mutelist;
	}

	/**
	 * @return the blacklist
	 */
	public List<String> getBlacklist() {
		return blacklist;
	}

	/**
	 * @param mutelist
	 *            the mutelist to set
	 */
	public void setMutelist(List<String> mutelist) {
		this.mutelist = mutelist;
	}

	/**
	 * @param blacklist
	 *            the blacklist to set
	 */
	public void setBlacklist(List<String> blacklist) {
		this.blacklist = blacklist;
	}

}
