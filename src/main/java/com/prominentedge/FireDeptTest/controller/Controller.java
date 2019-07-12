package com.prominentedge.FireDeptTest.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private AddressRepo addressRepo;
	
	@GetMapping("/incidents/{incident_number}")
    public Incident getIncidentByIncidentNumber(@PathVariable String incident_number) {
        Incident incident = incidentRepo.findByIncidentNumber(incident_number);
        
        addWeather(incident);
        
        return incident;
    }
	
	
	private Incident addWeather(Incident incident) {
		
		JSONObject weather = new JSONObject();
		
		String uri = "https://api.weather.gov/points/";
		
		uri += incident.getAddress().getLatitude() + ",";
		
		uri += incident.getAddress().getLongitude();

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println(result);
		
		return incident;
	}
}
