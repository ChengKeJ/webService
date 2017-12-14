package com.cheng.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class HttpclientWeather {

	
	public static void main(String[] args) {

		try {
			URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			
			conn.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
			conn.setDoOutput(true);
			conn.setDoOutput(true);
			String xml = getXml("15800789341");
			OutputStream os = conn.getOutputStream();
			os.write(xml.getBytes());
			os.close();
			System.out.println("AAAAAA");
//		
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			
			if (conn.getResponseCode()==200) {
				
				System.out.println("BBBBB");
				

				InputStream inputStream = conn.getInputStream();
				BufferedReader bir = new BufferedReader(new InputStreamReader(inputStream));
				String readLine;

				StringBuilder sb = new StringBuilder();

				while ((readLine = bir.readLine()) != null) {
					sb.append(readLine);
				}
				System.out.println(sb.toString());
				bir.close();
				inputStream.close();

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 必须是这种格式的数据才可以
	private static String getXml(String phoneNum) {
		// 根据手机号生成遵循soap规范的xml数据
		String data = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "<soap:Body>" + "<getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">" + "<mobileCode>" + phoneNum
				+ "</mobileCode>" + "<userID></userID>" + "</getMobileCodeInfo>" + "</soap:Body>" + "</soap:Envelope>";
		return data;
	}

}
