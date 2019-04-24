package com.webservice.jaxws;

import javax.xml.ws.Endpoint;

public class ServerPoint {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:1234/weather", new WeatherServiceImpl());
	}

}
