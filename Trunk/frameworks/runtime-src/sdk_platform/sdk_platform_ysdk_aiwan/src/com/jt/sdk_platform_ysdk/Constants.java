package com.jt.sdk_platform_ysdk;

import YYProjectJni.JniHelper;

public class Constants {
	//URL
//	public static String APP_URL = "https://ysdk.qq.com";
	public static String APP_URL = "https://ysdktest.qq.com";

	public static String APP_ID = "";
	public static String APP_KEY = "";
	public static String APP_KEY_PAY = "";
	public static String wxAppId = "";
	public static String msdkKey = "";
	public static String offerId = "";
	public static String discountid = "UM160226151003720";
	public static String giftID = "65682073PID201602261510037400";
	
	public static final String LOCAL_ACTION = "com.tencent.tmgp.niuox";
	
	static{
			//发行版
			APP_ID = "1105125571";
			APP_KEY = "WPccATx7WTCM2Je7";
			APP_KEY_PAY = "JIUBtL4gCB7GgigX8RF24AfPdfojNis6";//现网：JIUBtL4gCB7GgigX8RF24AfPdfojNis6;沙箱：WPccATx7WTCM2Je7;
			wxAppId = "wx75c8a9e911510672";
			msdkKey = "d76a46308933b358f335a001ddbc9094";
			offerId = "1105125571";
		if(JniHelper.getAppDebug()==0){
			APP_URL = "https://ysdk.qq.com";
		}else{
//			//MSDK
//			APP_ID = "100703379";
//			APP_KEY = "4578e54fb3a1bd18e0681bc1c734514e";
			APP_KEY_PAY = APP_KEY;
//			wxAppId = "wxcde873f99466f74a";
//			msdkKey = "5d1467a4d2866771c3b289965db335f4";
//			offerId = "100703379";
//			APP_URL = "https://ysdktest.qq.com";
		}
	}
	
}
