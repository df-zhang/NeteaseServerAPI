package df.learn.NeteaseServerAPI;

/**
 * @ClassName df.learn.NeteaseServerAPI.ResultHandler
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:44:57
 * @Author 854154025@qq.com
 * 
 * @Description 异步调用结果处理器
 * 
 * @param <T>
 */
public abstract class ResultHandler<T> {
	public void handle(int status, T result) {
	}

	public void handle(int status) {
	}
}
