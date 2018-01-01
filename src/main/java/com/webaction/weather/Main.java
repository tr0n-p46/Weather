package com.webaction.weather;

import java.io.InputStream;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	private String zipcode;

	public Main(String zip) {
		this.zipcode = zip;
	}

	public void start() throws Exception {
		InputStream datain = new YahooRetriever().retrieve(zipcode);
		Weather weather = new YahooParser().parse(datain);
		System.out.println(new WeatherFormatter().format(weather));
	}

	public static void main(String[]args) throws Exception {
		PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log4j.properties"));
		String zip = "2295424";
		try {
			zip = args[0];
		}
		catch(Exception e) {

		}
		new Main(zip).start();
	}
}