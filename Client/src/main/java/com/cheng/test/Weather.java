package com.cheng.test;

import com.cheng.ws.WeatherServiceImpl;
import com.cheng.ws.WeatherServiceImplService;

public class Weather {
	public static void main(String[] args) {
		
		WeatherServiceImplService service = new WeatherServiceImplService();
		WeatherServiceImpl impl = service.getPort(WeatherServiceImpl.class);
		String queryWeather = impl.queryWeather("…œ∫£");
		System.out.println("ss"+queryWeather);
		
		
	}

}
