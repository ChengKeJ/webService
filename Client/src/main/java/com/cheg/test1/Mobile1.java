package com.cheg.test1;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cheng.mobile.ArrayOfString;
import com.cheng.mobile.MobileCodeWSSoap;

public class Mobile1 {
	public static void main(String[] args) {
		try {
			
			/*����д��Ŀ����Ϊ�� ��ֹ  ���ɵķ���ȫ*/
			// ָ��WebService�ķ����ַ
			URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");

			// namespaceURI:�����ռ�
			// localPart:����˷��������
			QName qName = new QName("http://WebXml.com.cn/", "MobileCodeWS");
			// �����������
			Service service = Service.create(url, qName);
			// ��ȡ�ӿڶ���
			MobileCodeWSSoap port = service.getPort(MobileCodeWSSoap.class);
			// �ֻ�������Ϣ
			// String codeInfo = port.getMobileCodeInfo("14705532531", null);
			String codeInfo = port.getMobileCodeInfo("15800389341", null);
			System.out.println(codeInfo);

			ArrayOfString phones = port.getDatabaseInfo();
			for (String phone : phones.getString()) {
				System.out.println("phone=" + phone);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
