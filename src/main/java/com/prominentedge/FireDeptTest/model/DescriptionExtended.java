package com.prominentedge.FireDeptTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "description_extended", schema = "incident")
public class DescriptionExtended {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;
	
	private Integer dispatch_duration;
	
	private Integer event_duration;
	
	private Integer response_time;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public Integer getDispatch_duration() {
		return dispatch_duration;
	}

	public void setDispatch_duration(Integer dispatch_duration) {
		this.dispatch_duration = dispatch_duration;
	}

	public Integer getEvent_duration() {
		return event_duration;
	}

	public void setEvent_duration(Integer event_duration) {
		this.event_duration = event_duration;
	}

	public Integer getResponse_time() {
		return response_time;
	}

	public void setResponse_time(Integer response_time) {
		this.response_time = response_time;
	}
	
	
}
