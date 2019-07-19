package com.prominentedge.FireDeptTest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "apparatus", schema = "incident")
public class Apparatus {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;
	
	private String car_id;
	
	private Float distance;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private ApparatusExtended extended_data;
	
	private String geohash;
	
	private String shift;
	
	private String station;
	
	private String unit_id;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private UnitStatus unit_status;
	
	private String unit_type;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public ApparatusExtended getExtended_data() {
		return extended_data;
	}

	public void setExtended_data(ApparatusExtended extended_data) {
		this.extended_data = extended_data;
	}

	public String getGeohash() {
		return geohash;
	}

	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}

	public String getUnit_type() {
		return unit_type;
	}

	public void setUnit_type(String unit_type) {
		this.unit_type = unit_type;
	}

	public UnitStatus getUnit_status() {
		return unit_status;
	}

	public void setUnit_status(UnitStatus unit_status) {
		this.unit_status = unit_status;
	}
	
	

}
