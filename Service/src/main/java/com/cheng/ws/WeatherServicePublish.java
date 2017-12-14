package com.cheng.ws;

import javax.xml.ws.Endpoint;

public class WeatherServicePublish {
	public static void main(String[] args) {
		//address： 服务被发布到的地址
		
		//要被发布的服务
		Endpoint publish = Endpoint.publish("http://127.0.0.1:10005/weather", new WeatherServiceImpl());
		
	}

}
