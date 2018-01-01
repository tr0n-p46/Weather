package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Units {

	private String distance;
	private String pressure;
	private String speed;
	private String temperature;

	@XmlAttribute(name = "distance") 
	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	@XmlAttribute(name = "pressure")
	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	@XmlAttribute(name = "speed")
	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@XmlAttribute(name = "temperature") 
	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
}