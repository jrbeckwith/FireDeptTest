package com.prominentedge.FireDeptTest.model;

import java.sql.Timestamp;

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

@Entity
@Table(name = "description", schema = "incident")
public class Description {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	private String incidentNumber;
	
	private String comments;
	
	private String day_of_week;
	
	private Timestamp event_closed;
	
	private String event_id;
	
	private Timestamp event_opened;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "incident_number", insertable = false, updatable = false)
	private DescriptionExtended extended_data;
	
	private Timestamp first_unit_arrived;
	
	private Timestamp first_unit_dispatched;
	
	private Timestamp first_unit_enroute;
	
	private Integer hour_of_day;
	
	private Timestamp loi_search_complete;
	
	private String subtype;
	
	private String type;

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}

	public Timestamp getEvent_closed() {
		return event_closed;
	}

	public void setEvent_closed(Timestamp event_closed) {
		this.event_closed = event_closed;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public Timestamp getEvent_opened() {
		return event_opened;
	}

	public void setEvent_opened(Timestamp event_opened) {
		this.event_opened = event_opened;
	}

	public DescriptionExtended getExtended_data() {
		return extended_data;
	}

	public void setExtended_data(DescriptionExtended extended_data) {
		this.extended_data = extended_data;
	}

	public Timestamp getFirst_unit_arrived() {
		return first_unit_arrived;
	}

	public void setFirst_unit_arrived(Timestamp first_unit_arrived) {
		this.first_unit_arrived = first_unit_arrived;
	}

	public Timestamp getFirst_unit_dispatched() {
		return first_unit_dispatched;
	}

	public void setFirst_unit_dispatched(Timestamp first_unit_dispatched) {
		this.first_unit_dispatched = first_unit_dispatched;
	}

	public Timestamp getFirst_unit_enroute() {
		return first_unit_enroute;
	}

	public void setFirst_unit_enroute(Timestamp first_unit_enroute) {
		this.first_unit_enroute = first_unit_enroute;
	}

	public Integer getHour_of_day() {
		return hour_of_day;
	}

	public void setHour_of_day(Integer hour_of_day) {
		this.hour_of_day = hour_of_day;
	}

	public Timestamp getLoi_search_complete() {
		return loi_search_complete;
	}

	public void setLoi_search_complete(Timestamp loi_search_complete) {
		this.loi_search_complete = loi_search_complete;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
