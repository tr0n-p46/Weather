package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Image {

	private String title;
	private int height;
	private int width;
	private String url;
	private String link;

	@XmlElement(name = "title")
	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@XmlElement(name = "link")
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@XmlElement(name = "width")
	public int getWidth() {
		return width;
	}

	public void setWdith(int width) {
		this.width = width;
	}


	@XmlElement(name = "height")
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
