package com.webservice.jaxws;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

@WebService
public class WeatherServiceImpl implements WeatherService {

	@Override
	public String queryWeather(String cityName) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(sdf.format(new Date()) + " ���յ��ͻ��˵����ݣ�"+cityName);
		 String result = new String();
		 if (cityName.equals("����")) {
			 result = cityName +"������ת��";
		}else if (cityName.equals("�Ϻ�")) {
			result = cityName +"����";
		}else if (cityName.equals("����")) {
			result = cityName + "������";
		}else if (cityName.equals("")) {
			result = "������������ƺ��ѯ��";
		}else {
			result = cityName + "��δ�鵽�������";
		}
		 System.out.println(sdf.format(new Date()) + " ���͵��ͻ��˵����ݣ�"+result);
		 return result;
	}
}
