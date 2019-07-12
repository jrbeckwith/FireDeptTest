package com.prominentedge.FireDeptTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
        return incidentRepo.findByIncidentNumber(incident_number);
    }
	
}
