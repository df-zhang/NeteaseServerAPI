package df.learn.NeteaseServerAPI;

/**
 * @ClassName df.learn.NeteaseServerAPI.nim.res.ResCode  
 * 
 * @Version v1.0
 * @Date 2017年9月14日 上午1:47:08 
 * @Author 854154025@qq.com
 * 
 * @Description TODO
 * 
 */
public final class ResCode {
	// code 详细描述
	/**
	 * @Fields SUCCESSFUL 操作成功 : {@value}
	 */
	public static final int SUCCESSFUL = 200;
	/**
	 * @Fields SDK_VERSION_ERR 客户端版本不对，需升级sdk: {@value}
	 */
	public static final int SDK_VERSION_ERR = 201;
	/**
	 * @Fields BLOCKED 被封禁: {@value}
	 */
	public static final int BLOCKED = 301;
	/**
	 * @Fields USERNAME_OR_PASSWORD_INVALID 用户名或密码错误: {@value}
	 */
	public static final int USERNAME_OR_PASSWORD_INVALID = 302;
	/**
	 * @Fields IP_LIMITED IP限制: {@value}
	 */
	public static final int IP_LIMITED = 315;
	/**
	 * @Fields NO_PERIMISSION 非法操作或没有权限: {@value}
	 */
	public static final int NO_PERIMISSION = 403;
	/**
	 * @Fields NOT_FOUND 对象不存在: {@value}
	 */
	public static final int NOT_FOUND = 404;
	/**
	 * @Fields PARAMETER_TOO_LONG 参数长度过长: {@value}
	 */
	public static final int PARAMETER_TOO_LONG = 405;
	/**
	 * @Fields READONLY 对象只读: {@value}
	 */
	public static final int READONLY = 406;
	/**
	 * @Fields TIMEOUT 客户端请求超时: {@value}
	 */
	public static final int TIMEOUT = 408;
	/**
	 * @Fields SMS_VALIDATION_FAILED 验证失败(短信服务): {@value}
	 */
	public static final int SMS_VALIDATION_FAILED = 413;

	/**
	 * @Fields PARAMETER_ERR 参数错误: {@value}
	 */
	public static final int PARAMETER_ERR = 414;
	/**
	 * @Fields CLIENT_NETWORK_ERR 客户端网络问题: {@value}
	 */
	public static final int CLIENT_NETWORK_ERR = 415;
	/**
	 * @Fields RATE_LIMITED 频率控制: {@value}
	 */
	public static final int RATE_LIMITED = 416;
	/**
	 * @Fields REPEAT_OPTIONS 重复操作: {@value}
	 */
	public static final int REPEAT_OPTIONS = 417;
	/**
	 * @Fields SMS_CHANNEL_ERR 通道不可用(短信服务): {@value}
	 */
	public static final int SMS_CHANNEL_ERR = 418;

	/**
	 * @Fields COUNT_LIMITED 数量超过上限: {@value}
	 */
	public static final int COUNT_LIMITED = 419;
	/**
	 * @Fields DISABLED_ACCOUNT 账号被禁用: {@value}
	 */
	public static final int DISABLED_ACCOUNT = 422;
	/**
	 * @Fields REPEAT_HTTP HTTP重复请求: {@value}
	 */
	public static final int REPEAT_HTTP = 431;
	/**
	 * @Fields SERVER_ERR 服务器内部错误: {@value}
	 */
	public static final int SERVER_ERR = 500;
	/**
	 * @Fields SERVER_BUSY 服务器繁忙: {@value}
	 */
	public static final int SERVER_BUSY = 503;
	/**
	 * @Fields SERVER_NOT_AVALIABLE 服务不可用: {@value}
	 */
	public static final int SERVER_NOT_AVALIABLE = 514;
	/**
	 * @Fields INVALID_PROTOCOL 无效协议: {@value}
	 */
	public static final int INVALID_PROTOCOL = 509;
	/**
	 * @Fields UNZIP_ERR 解包错误: {@value}
	 */
	public static final int UNZIP_ERR = 998;
	/**
	 * @Fields ZIP_ERR 打包错误: {@value}
	 */
	public static final int ZIP_ERR = 999;
	// 群相关错误码
	// 801 群人数达到上限
	// 802 没有权限
	// 803 群不存在
	// 804 用户不在群
	// 805 群类型不匹配
	// 806 创建群数量达到限制
	// 807 群成员状态错误
	// 808 申请成功
	// 809 已经在群内
	// 810 邀请成功
	// 音视频、白板通话相关错误码
	/**
	 * @Fields INVALID_CHANNEL 通道失效: {@value}
	 */
	public static final int INVALID_CHANNEL = 9102;
	/**
	 * @Fields RESPONSE_END 已经在他端对这个呼叫响应过了: {@value}
	 */
	public static final int RESPONSE_END = 9103;
	/**
	 * @Fields OTHER_SIDE_OFFLINE 通话不可达，对方离线状态: {@value}
	 */
	public static final int OTHER_SIDE_OFFLINE = 11001;
	// 聊天室相关错误码
	// 13001 IM主连接状态异常
	// 13002 聊天室状态异常
	// 13003 账号在黑名单中,不允许进入聊天室
	// 13004 在禁言列表中,不允许发言
	// 特定业务相关错误码
	// 10431 输入email不是邮箱
	// 10432 输入mobile不是手机号码
	// 10433 注册输入的两次密码不相同
	// 10434 企业不存在
	// 10435 登陆密码或帐号不对
	// 10436 app不存在
	// 10437 email已注册
	// 10438 手机号已注册
	// 10441 app名字已经存在
}
