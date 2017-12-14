package com.cheng.test;

import com.cheng.mobile.ArrayOfString;
import com.cheng.mobile.MobileCodeWS;
import com.cheng.mobile.MobileCodeWSSoap;

public class Mobile {
	public static void main(String[] args) {
		// 创建服务视图
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		
		
		// 调用服务端提供的方法进行服务调用
		MobileCodeWSSoap impl = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		ArrayOfString databaseInfo = impl.getDatabaseInfo();
		// 获取所有号码归属地
		for (String string : databaseInfo.getString()) {
			System.out.println(string);
		}

		String address = impl.getMobileCodeInfo("13063310938", null);
		System.out.println(address);

	}

}
