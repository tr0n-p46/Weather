package com.webaction.weather;

import java.util.Map;
import java.util.HashMap;
import java.io.InputStream;

import javax.xml.bind.*;
import javax.xml.stream.*;
import javax.xml.transform.stream.StreamSource;

import com.webaction.weather.weatherbean.*;

import org.apache.log4j.Logger;
	
public class YahooParser {
	
	private static Logger log = Logger.getLogger(YahooParser.class);

	public Weather parse(InputStream inputStream) throws Exception {

		Query query = null;
		try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        	xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        	XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new StreamSource(inputStream));

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            query = (Query) unmarshaller.unmarshal(xmlStreamReader);
           	log.info(query.getYahooCreated());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        catch (XMLStreamException e) {
        	e.printStackTrace();
        }

        Weather weather = new Weather();
        /*weather.setCity(query.getResults().getChannel().getLocation().getCity());
        weather.setRegion(query.getResults().getChannel().getLocation().getRegion());
        weather.setCountry(query.getResults().getChannel().getLocation().getCountry());

        weather.setChill("" + query.getResults().getChannel().getWind().getChill());

        weather.setTemp(query.getResults().getChannel().getUnits().getTemperature());
        weather.setHumidity("" + query.getResults().getChannel().getAtmosphere().getHumidity());*/

		return weather;
	}
}