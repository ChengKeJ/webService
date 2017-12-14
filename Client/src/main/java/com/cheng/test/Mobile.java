package com.cheng.test;

import com.cheng.mobile.ArrayOfString;
import com.cheng.mobile.MobileCodeWS;
import com.cheng.mobile.MobileCodeWSSoap;

public class Mobile {
	public static void main(String[] args) {
		// ����������ͼ
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		
		
		// ���÷�����ṩ�ķ������з������
		MobileCodeWSSoap impl = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		ArrayOfString databaseInfo = impl.getDatabaseInfo();
		// ��ȡ���к��������
		for (String string : databaseInfo.getString()) {
			System.out.println(string);
		}

		String address = impl.getMobileCodeInfo("13063310938", null);
		System.out.println(address);

	}

}
