package com.prominentedge.FireDeptTest.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "incident", schema = "incident")
public class Incident {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private Address address;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumns({ @JoinColumn(name = "incident_number", referencedColumnName = "incident_number") })
	private List<Apparatus> apparatus;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private Description description;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private FireDepartment fire_department;

	private String version;
	
	@Transient
	private JSONObject weather;
	
	@Transient
	private JSONObject parcel_data;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Apparatus> getApparatus() {
		return apparatus;
	}

	public void setApparatus(List<Apparatus> apparatus) {
		this.apparatus = apparatus;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public FireDepartment getFire_department() {
		return fire_department;
	}

	public void setFire_department(FireDepartment fire_department) {
		this.fire_department = fire_department;
	}

	public JSONObject getWeather() {
		return weather;
	}

	public void setWeather(JSONObject weather) {
		this.weather = weather;
	}

	public JSONObject getParcel_data() {
		return parcel_data;
	}

	public void setParcel_data(JSONObject parcel_data) {
		this.parcel_data = parcel_data;
	}

}
