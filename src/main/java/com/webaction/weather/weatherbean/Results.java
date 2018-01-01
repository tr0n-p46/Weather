package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Results {

	private Channel channel;

	@XmlElement(name = "channel")
	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
}