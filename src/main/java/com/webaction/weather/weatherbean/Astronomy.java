package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Astronomy {

	private String sunrise;
	private String sunset;

	@XmlAttribute(name = "sunrise")
	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	@XmlAttribute(name = "sunset")
	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
}
