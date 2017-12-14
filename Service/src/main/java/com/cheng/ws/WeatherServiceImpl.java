package com.cheng.ws;

import javax.jws.WebService;



//服务器的实现类 必须添加@webservice 此时变成了 一个webservice 的服务类

/*@BindingType: 指定SOAP协议的版本号  默认是1.1版本
*/

@WebService
/*@BindingType(SOAPBinding.SOAP12HTTP_BINDING)*/
public class WeatherServiceImpl implements WeatherService {

	public String queryWeather(String city) {
	System.out.println("weather service....");
	return city+"sun";
		
	}
	

}
