package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Location {

	private String city;
	private String country;
	private String region;

	@XmlAttribute(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@XmlAttribute(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlAttribute(name = "region")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}