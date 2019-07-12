package com.prominentedge.FireDeptTest.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vividsolutions.jts.geom.Geometry;

@Entity
@Table(name = "address", schema = "incident")
public class Address {
	@Id
	@NotBlank
	@Column(name = "incident_number")
	@JsonIgnore
	private String incidentNumber;

	private String address_id;

	private String address_line1;

	private String city;

	private String common_place_name;

	private String cross_street1;

	private String cross_street2;

	private String first_due;

	private String geohash;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private String name;

	private String number;

	private String postal_code;

	private String prefix_direction;

	private String response_zone;

	private String state;

	private String suffix_direction;

	private String type;

	//@Column(name = "geom", columnDefinition = "Geometry")
	//@Type(type = "org.hibernate.spatial.GeometryType")
	//private Geometry geom;

	

	public String getAddress_id() {
		return address_id;
	}

	public String getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCommon_place_name() {
		return common_place_name;
	}

	public void setCommon_place_name(String common_place_name) {
		this.common_place_name = common_place_name;
	}

	public String getCross_street1() {
		return cross_street1;
	}

	public void setCross_street1(String cross_street1) {
		this.cross_street1 = cross_street1;
	}

	public String getCross_street2() {
		return cross_street2;
	}

	public void setCross_street2(String cross_street2) {
		this.cross_street2 = cross_street2;
	}

	public String getFirst_due() {
		return first_due;
	}

	public void setFirst_due(String first_due) {
		this.first_due = first_due;
	}

	public String getGeohash() {
		return geohash;
	}

	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getPrefix_direction() {
		return prefix_direction;
	}

	public void setPrefix_direction(String prefix_direction) {
		this.prefix_direction = prefix_direction;
	}

	public String getResponse_zone() {
		return response_zone;
	}

	public void setResponse_zone(String response_zone) {
		this.response_zone = response_zone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSuffix_direction() {
		return suffix_direction;
	}

	public void setSuffix_direction(String suffix_direction) {
		this.suffix_direction = suffix_direction;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*public Geometry getGeom() {
		return geom;
	}

	public void setGeom(Geometry geom) {
		this.geom = geom;
	}*/

}
