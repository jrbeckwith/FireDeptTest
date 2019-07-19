package com.prominentedge.FireDeptTest.controller;

import java.util.Collections;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prominentedge.FireDeptTest.model.Incident;
import com.prominentedge.FireDeptTest.repository.AddressRepo;
import com.prominentedge.FireDeptTest.repository.IncidentRepo;

@RestController
public class Controller {

	@Autowired
	private IncidentRepo incidentRepo;
	
	@GetMapping("/incidents/{incident_number}")
    public ResponseEntity<?> getIncidentByIncidentNumber(@PathVariable String incident_number) {
		
		Incident incident = incidentRepo.findByIncidentNumber(incident_number);
        
		JSONObject jsonOutput = new JSONObject();
		
		incident.setWeather(addWeatherData(incident));
		
		try {
			incident.setParcel_data(addParcelData(incident));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        return ResponseEntity.ok(incident);
    }
	
	
	private JSONObject addWeatherData(Incident incident) {
		
		String uri = "https://api.darksky.net/forecast/95234cce5d01718f39f4a8ea18e73402/";
	    RestTemplate restTemplate = new RestTemplate();
		JSONObject weather = new JSONObject();
		
		uri += incident.getAddress().getLatitude() + ",";
		uri += incident.getAddress().getLongitude() + ",";
		uri += incident.getDescription().getEvent_opened().getTime() /1000;
	    
	    weather = restTemplate.getForObject(uri, JSONObject.class);
		
		return weather;
	}
		
	private JSONObject addParcelData(Incident incident) throws ParseException {
		
		String uri = "http://gis.richmondgov.com/ArcGIS/rest/services/StatePlane4502/Ener/MapServer/0/query?inSR=4326&geometryType=esriGeometryPoint&spatialRel=esriSpatialRelIntersects&f=pjson&geometry=";
	    RestTemplate restTemplate = new RestTemplate();
	    JSONParser parser = new JSONParser();
	    JSONObject parcel = new JSONObject();
		
		uri += incident.getAddress().getLongitude() + ",";
		uri += incident.getAddress().getLatitude();
	    
	    String serverResponse = restTemplate.getForObject(uri, String.class);
	    
		parcel = (JSONObject) parser.parse(serverResponse);
		
		return parcel;
		
	}
}
