package com.cheg.test1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cheng.weather.ArrayOfString;
import com.cheng.weather.WeatherWSSoap;

public class Weathertest {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");
			QName qName = new QName("http://WebXml.com.cn/", "WeatherWS");
			Service service = Service.create(url, qName);
			WeatherWSSoap port = service.getPort(WeatherWSSoap.class);
			
			/* List<String> string; */
			ArrayOfString weather = port.getWeather("…œ∫£", null);
			
			for (String string : weather.getString()) {
				
				System.out.println(string);
		System.out.println("-------------------------");
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
