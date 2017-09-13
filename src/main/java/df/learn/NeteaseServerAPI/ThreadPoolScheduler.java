package df.learn.NeteaseServerAPI;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName df.learn.NeteaseServerAPI.ThreadPoolScheduler
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:44:23
 * @Author 854154025@qq.com
 * 
 * @Description 线程池调度器
 * 
 */
public final class ThreadPoolScheduler {

	private static ThreadPoolScheduler manager = new ThreadPoolScheduler();
	private ThreadPoolExecutor pool;

	private ThreadPoolScheduler() {
		pool = new ThreadPoolExecutor(100, 160, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100), new ThreadPoolExecutor.CallerRunsPolicy());
	}

	public static boolean addTask(Runnable run) {
		manager.pool.execute(run);
		return true;
	}
}