package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

public class Channel {

	private String link;
	private String title;
	private String description;
	private String language;
	private String lastBuildDate;
	private long ttl;
	private Units units;
	private Image image;
	private Location location;
	private Wind wind;
	private Atmosphere atmosphere;
	private Astronomy astronomy;
	//private Item item;


	@XmlElement(name = "link")
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@XmlElement(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name = "language")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@XmlElement(name = "lastBuildDate")
	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	@XmlElement(name = "ttl")
	public long getTtl() {
		return ttl;
	}

	public void setLink(long ttl) {
		this.ttl = ttl;
	}

	@XmlElement(name = "image")
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	/*@XmlElement(name = "item")
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}*/

	@XmlElement(name = "yweather:units") 
	public Units getUnits() {
		return units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	@XmlElement(name = "yweather:location")
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@XmlElement(name = "yweather:wind")
	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	@XmlElement(name = "yweather:atmosphere")
	public Atmosphere getAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(Atmosphere atmosphere) {
		this.atmosphere = atmosphere;
	}

	@XmlElement(name = "yweather:astronomy")
	public Astronomy getAstronomy() {
		return astronomy;
	}

	public void setAstronomy(Astronomy astronomy) {
		this.astronomy = astronomy;
	}
}