package df.learn.NeteaseServerAPI;

import df.learn.NeteaseServerAPI.nim.ResNIMInfo;
import df.learn.NeteaseServerAPI.nim.req.user.ReqUserCreate;
import df.learn.NeteaseServerAPI.nim.res.user.ResUserInfo;
import df.learn.NeteaseServerAPI.services.NeteaseNIMUserService;
import df.learn.NeteaseServerAPI.services.NeteaseNIMUserServiceImpl;

/**
 * @ClassName df.learn.NeteaseServerAPI.$
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:38:22
 * @Author 854154025@qq.com
 * 
 * @Description TODO
 * 
 */
public class $ {
	public static void main(String[] args) {
		NeteaseNIMUserService service = new NeteaseNIMUserServiceImpl(new APIHelper());
		ReqUserCreate req = new ReqUserCreate();
		req.setAccid("hello");
		req.setToken("hello");
		ResNIMInfo<ResUserInfo> res = service.createUser(req);
		if (res.getCode() == ResCode.SUCCESSFUL) {
			// success
		}
		service.createUserAsync(req, new ResultHandler<ResNIMInfo<ResUserInfo>>() {
			@Override
			public void handle(int status, ResNIMInfo<ResUserInfo> result) {
				if (result.getCode() == ResCode.SUCCESSFUL) {
					// success
				}
			}
		});
	}
}
