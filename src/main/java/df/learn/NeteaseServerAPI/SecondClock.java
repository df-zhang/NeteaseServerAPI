package df.learn.NeteaseServerAPI;

/**
 * @ClassName df.learn.NeteaseServerAPI.SecondClock  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:44:35 
 * @Author 854154025@qq.com
 * 
 * @Description 控制时间，每秒同步一次
 * 
 */
public class SecondClock {
	private volatile long now = 0;// 当前时间
	private static final SecondClock clock = new SecondClock();

	public static SecondClock getInstance() {
		return clock;
	}

	public static long getNow() {
		return getInstance().now();
	}

	private SecondClock() {
		this.now = System.currentTimeMillis() ;
		start();
	}

	private void start() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					now = System.currentTimeMillis();
				}
			}
		}).start();
	}

	public long now() {
		return now;
	}
}
