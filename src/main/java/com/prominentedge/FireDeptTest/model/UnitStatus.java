package com.prominentedge.FireDeptTest.model;

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
@Table(name = "unit_status", schema = "incident")
public class UnitStatus {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private UnitArrived arrived;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private UnitAvailable available;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private UnitDispatched dispatched;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private UnitEnroute enroute;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public UnitArrived getArrived() {
		return arrived;
	}

	public void setArrived(UnitArrived arrived) {
		this.arrived = arrived;
	}

	public UnitAvailable getAvailable() {
		return available;
	}

	public void setAvailable(UnitAvailable available) {
		this.available = available;
	}

	public UnitDispatched getDispatched() {
		return dispatched;
	}

	public void setDispatched(UnitDispatched dispatched) {
		this.dispatched = dispatched;
	}

	public UnitEnroute getEnroute() {
		return enroute;
	}

	public void setEnroute(UnitEnroute enroute) {
		this.enroute = enroute;
	}
	
	

}
