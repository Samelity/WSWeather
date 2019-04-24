package com.webservice.jaxws;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

@WebService
public class WeatherServiceImpl implements WeatherService {

	@Override
	public String queryWeather(String cityName) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(sdf.format(new Date()) + " 接收到客户端的数据："+cityName);
		 String result = new String();
		 if (cityName.equals("杭州")) {
			 result = cityName +"：多云转晴";
		}else if (cityName.equals("上海")) {
			result = cityName +"：晴";
		}else if (cityName.equals("北京")) {
			result = cityName + "：雾霾";
		}else if (cityName.equals("")) {
			result = "请输入城市名称后查询。";
		}else {
			result = cityName + "：未查到相关数据";
		}
		 System.out.println(sdf.format(new Date()) + " 发送到客户端的数据："+result);
		 return result;
	}
}
