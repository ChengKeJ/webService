package com.cheng.ws;

import javax.xml.ws.Endpoint;

public class WeatherServicePublish {
	public static void main(String[] args) {
		//address�� ���񱻷������ĵ�ַ
		
		//Ҫ�������ķ���
		Endpoint publish = Endpoint.publish("http://127.0.0.1:10005/weather", new WeatherServiceImpl());
		
	}

}
