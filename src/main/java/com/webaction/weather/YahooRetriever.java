package com.webaction.weather;

import java.io.*;
import java.io.InputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {
	
	private static Logger log = Logger.getLogger(YahooRetriever.class);

	public InputStream retrieve(String zipcode) throws Exception {
		log.info("Retrieving weather data");
		//String url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20=%202295424&format=xml&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
		String url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=xml&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
		URLConnection conn = new URL(url).openConnection();
		return conn.getInputStream();
	}
}