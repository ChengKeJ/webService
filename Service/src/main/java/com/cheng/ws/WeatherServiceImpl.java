package com.cheng.ws;

import javax.jws.WebService;



//��������ʵ���� �������@webservice ��ʱ����� һ��webservice �ķ�����

/*@BindingType: ָ��SOAPЭ��İ汾��  Ĭ����1.1�汾
*/

@WebService
/*@BindingType(SOAPBinding.SOAP12HTTP_BINDING)*/
public class WeatherServiceImpl implements WeatherService {

	public String queryWeather(String city) {
	System.out.println("weather service....");
	return city+"sun";
		
	}
	

}
