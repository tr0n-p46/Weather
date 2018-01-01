package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Wind {

	private long chill;
	private long direction;
	private long speed;

	@XmlAttribute(name = "chill")
	public long getChill() {
		return chill;
	}

	public void setChill(long chill) {
		this.chill = chill;
	}

	@XmlAttribute(name = "direction") 
	public long getDirection() {
		return direction;
	}

	public void setDirection(long direction) {
		this.direction = direction;
	}

	@XmlAttribute(name = "speed") 
	public long getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}
}