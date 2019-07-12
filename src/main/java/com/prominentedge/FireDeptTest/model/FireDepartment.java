package com.prominentedge.FireDeptTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fire_dept", schema = "incident")
public class FireDepartment {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;
	
	private String fd_id;
	
	private String firecares_id;
	
	private String name;
	
	private String shift;
	
	private String state;
	
	private String timezone;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public String getFd_id() {
		return fd_id;
	}

	public void setFd_id(String fd_id) {
		this.fd_id = fd_id;
	}

	public String getFirecares_id() {
		return firecares_id;
	}

	public void setFirecares_id(String firecares_id) {
		this.firecares_id = firecares_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	
}
