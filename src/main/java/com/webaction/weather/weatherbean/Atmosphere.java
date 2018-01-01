package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Atmosphere {

	private long humidity;
	private long rising;
	private long pressure;
	private long visibility;

	@XmlAttribute(name = "humidity")
	public long getHumidity() {
		return humidity;
	}

	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}

	@XmlAttribute(name = "rising")
	public long getRising() {
		return rising;
	}

	public void setRising(long rising) {
		this.rising = rising;
	}

	@XmlAttribute(name = "pressure")
	public long getPressure() {
		return pressure;
	}

	public void setPressure(long pressure) {
		this.pressure = pressure;
	}

	@XmlAttribute(name = "visibility")
	public long getVisibility() {
		return visibility;
	}

	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}
}
