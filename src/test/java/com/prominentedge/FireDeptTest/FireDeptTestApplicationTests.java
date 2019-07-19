package com.prominentedge.FireDeptTest;

import static org.junit.Assert.assertTrue;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FireDeptTestApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void weatherServiceAvailable() {
		
		String uri = "https://api.darksky.net/forecast/95234cce5d01718f39f4a8ea18e73402/37.466513,-77.428683,1494897378";
	    RestTemplate restTemplate = new RestTemplate();
		JSONObject weather = new JSONObject();
	    
	    weather = restTemplate.getForObject(uri, JSONObject.class);
	    
		assertTrue(weather.containsKey("currently"));
	}
	
	@Test
	public void parcelServiceAvailable() {
		
		String uri = "http://gis.richmondgov.com/ArcGIS/rest/services/StatePlane4502/Ener/MapServer/0/query?inSR=4326&geometryType=esriGeometryPoint&spatialRel=esriSpatialRelIntersects&f=pjson&geometry=-77.428683,37.466513";
	    RestTemplate restTemplate = new RestTemplate();
	    JSONParser parser = new JSONParser();
	    JSONObject parcel = new JSONObject();
	    
	    String serverResponse = restTemplate.getForObject(uri, String.class);
	    
		try {
			parcel = (JSONObject) parser.parse(serverResponse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
		assertTrue(parcel.containsKey("features"));
	}

}
