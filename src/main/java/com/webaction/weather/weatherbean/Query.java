package com.webaction.weather.weatherbean;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "query")
public class Query {

	private long yahooCount;
	private String yahooCreated;
	private String yahooLang;
	private Results results;

	@XmlAttribute(name = "yahoo:count")
	public long getYahooCount() {
		return yahooCount;
	}

	public void setYahooCount(long yahooCount) {
		this.yahooCount = yahooCount;
	}

	@XmlAttribute(name = "yahoo:created")
	public String getYahooCreated() {
		return yahooCreated;
	}

	public void setYahooCreated(String yahooCreated) {
		this.yahooCreated = yahooCreated;
	}

	@XmlAttribute(name = "yahoo:lang")
	public String getYahooLang() {
		return yahooLang;
	}

	public void setYahooLang(String yahooLang) {
		this.yahooLang = yahooLang;
	}

	@XmlElement(name = "results")
	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}
}