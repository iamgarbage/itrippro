package cn.itrip.trade.config;

public class AlipayConfig {
	// 商户appid
	private static String APPID = "2016092800615231";
	// 私钥 pkcs8格式的
	private static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC3d0tDxZa+vzTjJ5eikuDwtavi25plMzVJb2M2NUQpmLFiQDMDpI6dD1antcrpmhLZuRN6ejV4ofPKk7tQU314Ql/Z90QfGnTVKSFS5mP3olaVlWafcZYPY677p990pkXQ53Vey7DzmIc6OT7DO5AcNjLKqGL5gCU95CAPlANQcF0PfgZcTupW5R4aBkAM85t/EK1/KmV9f9FEw1sR9AyH/bKvJC5pvPaNqqXc+3ANB/CSY5+y5Hqjh/Xes+XSUmaaCbeEH5xgJz6VQ98z9c+63h7S8ervkFxIfiuutzfmmq3GgEh1lBsza1PD8NtR4+V3926WE4S3UU2QpzKeOVv3AgMBAAECggEAWj1QBN6sHdhYgB5aRDmwcFU7XVMcpwg//oXOK7yZcUhMf4IKVZFcID6KJeWSD8Kb4QFaZlSz9kjaa9qsOH9IaJ1lHgW0OQQ/URVw8aCmrQfpRJv+pRAuehVS3S8eBvc9wdoG7gCMYdS1NtsvVsH2SRoTc4DNZeE08DND3cW0t5wnvFY9Rw9VHB56BAxZ8lXAVRVANCmoTmlDhxnA60l1agx1CR06dIv+B3TENycTZbM+XcUsjiVhiKsYGXp7XKg+ZeKawiQui3Fgv9y90mjGVqdYQFmPDjOdXODteL6oWiD3MELW0POUJSYJTP55UcJUCElF/Bz1KWrRhTUDZWRuSQKBgQDdRFMPtkBB4J46Vbpbod9LZVmxuCcpz3wq0+FkqkW2rFOYpwbJdBx8dEq/uofbIAh78uK46OYFGF9T6IqH3WC2VhihdNjy3f8habAiWQNt680AhSv9QdIZMJxPgHCyUi8OO6yupHrQa+6dXTroPK6cpAWWN+DklRzQGXpwc/0CDQKBgQDUQ+3fBxmHY6guoPoVxz6zRP4HCRCON5FKXLt+LPUM6uvjzy/QhfqsiHz977nGHEDzNpsE5LXVxcNo7YY8/2wb6/jEw0I9uhk2vZKxIdRZQJRtRTSh2HK/hQO2cctqxTYoRbnOP9mtseyPPZUj1b+9yb7DHOro9LECF2LSE67JEwKBgCMGW7eS+9zxt1o4k8VJfFUs9+O/6MMfiuIko/sRUPO3l4wEdHiTHqc8qVBsMHEpQu6L5gOrKi4IS562oqcbDeIPAtsb6fOX3Hjnh/AH8xkFSHAapHn0X1OJdFTJWg2AIN65533Fn4M6co0KYva8FE/LTu8WbU0BpYvzXIRMd/JJAoGBAI/vYCWUEuOT2D+GOQ77hLDbX8Y1h1xoocTjDOCKa8DOrBZWL/4eW9US2G75V+fW0NQbexLeY88Jw3ArYJOMQCrO4GnMXeatgttzwT0Ly4qaGAvgmcgFlgn4kIPuthk4kXjNjykkct8tf1PCVpduIg739rsnqMM+6aiZYxFA94yxAoGAdmq16Fga0q5gBR7XmbAVzGHOnfSH9LoAgpOFBaeCZ7zBDe0SzKt2EmnHNHygizEDYkeAmSna6epRdVjD+sha7iGMcqKopAzfv1yPeRkNDnBX2id6S+Ex1e49zgYhrRLCEeyutzfvAx4zdxjRSHNA4oxYwgUmOSn6MOh0eHddg58=";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	private static String notify_url = "http://itrippro.free.idcfengye.com/trade/api/notify";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	private static String return_url = "http://itrippro.free.idcfengye.com/trade/api/returnUrl";
	// 请求网关地址
	private static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	private static String CHARSET = "UTF-8";
	// 返回格式
	private static String FORMAT = "json";
	// 支付宝公钥
	private static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";
	// 日志记录目录
	private static String log_path = "/log";
	// RSA2
	private static String SIGNTYPE = "RSA2";
	//支付成功跳转页
	private static String paymentSuccessUrl="/trade/success.jsp";
	//支付失败跳转页
	private static String paymentFailureUrl="/trade/fail.jsp";

	public static String getAPPID() {
		return APPID;
	}

	public static void setAPPID(String APPID) {
		AlipayConfig.APPID = APPID;
	}

	public static String getRsaPrivateKey() {
		return RSA_PRIVATE_KEY;
	}

	public static void setRsaPrivateKey(String rsaPrivateKey) {
		RSA_PRIVATE_KEY = rsaPrivateKey;
	}

	public static String getNotify_url() {
		return notify_url;
	}

	public static void setNotify_url(String notify_url) {
		AlipayConfig.notify_url = notify_url;
	}

	public static String getReturn_url() {
		return return_url;
	}

	public static void setReturn_url(String return_url) {
		AlipayConfig.return_url = return_url;
	}

	public static String getURL() {
		return URL;
	}

	public static void setURL(String URL) {
		AlipayConfig.URL = URL;
	}

	public static String getCHARSET() {
		return CHARSET;
	}

	public static void setCHARSET(String CHARSET) {
		AlipayConfig.CHARSET = CHARSET;
	}

	public static String getFORMAT() {
		return FORMAT;
	}

	public static void setFORMAT(String FORMAT) {
		AlipayConfig.FORMAT = FORMAT;
	}

	public static String getAlipayPublicKey() {
		return ALIPAY_PUBLIC_KEY;
	}

	public static void setAlipayPublicKey(String alipayPublicKey) {
		ALIPAY_PUBLIC_KEY = alipayPublicKey;
	}

	public static String getLog_path() {
		return log_path;
	}

	public static void setLog_path(String log_path) {
		AlipayConfig.log_path = log_path;
	}

	public static String getSIGNTYPE() {
		return SIGNTYPE;
	}

	public static void setSIGNTYPE(String SIGNTYPE) {
		AlipayConfig.SIGNTYPE = SIGNTYPE;
	}

	public static String getPaymentSuccessUrl() {
		return paymentSuccessUrl;
	}

	public static void setPaymentSuccessUrl(String paymentSuccessUrl) {
		AlipayConfig.paymentSuccessUrl = paymentSuccessUrl;
	}

	public static String getPaymentFailureUrl() {
		return paymentFailureUrl;
	}

	public static void setPaymentFailureUrl(String paymentFailureUrl) {
		AlipayConfig.paymentFailureUrl = paymentFailureUrl;
	}

}
