package com.prominentedge.FireDeptTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "apparatus_extended", schema = "incident")
public class ApparatusExtended {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;
	
	private Integer event_duration;
	
	private Integer response_duration;
	
	private Integer travel_duration;
	
	private Integer turnout_duration;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public Integer getEvent_duration() {
		return event_duration;
	}

	public void setEvent_duration(Integer event_duration) {
		this.event_duration = event_duration;
	}

	public Integer getResponse_duration() {
		return response_duration;
	}

	public void setResponse_duration(Integer response_duration) {
		this.response_duration = response_duration;
	}

	public Integer getTravel_duration() {
		return travel_duration;
	}

	public void setTravel_duration(Integer travel_duration) {
		this.travel_duration = travel_duration;
	}

	public Integer getTurnout_duration() {
		return turnout_duration;
	}

	public void setTurnout_duration(Integer turnout_duration) {
		this.turnout_duration = turnout_duration;
	}
	
	
}
