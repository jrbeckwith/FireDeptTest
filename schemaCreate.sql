CREATE EXTENSION postgis;

DROP TABLE IF EXISTS incident.incident CASCADE;

CREATE TABLE IF NOT EXISTS incident.incident (
	incident_number VARCHAR(255) UNIQUE NOT NULL,
	version VARCHAR(255),
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.fire_dept;

CREATE TABLE IF NOT EXISTS incident.fire_dept (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	fd_id VARCHAR(255), 
    firecares_id VARCHAR(255), 
    name VARCHAR(255), 
    shift VARCHAR(255), 
    state VARCHAR(2), 
    timezone VARCHAR(255),
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.description;

CREATE TABLE IF NOT EXISTS incident.description (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	comments VARCHAR(2000), 
    day_of_week VARCHAR(255), 
    event_closed TIMESTAMP,
	event_id VARCHAR(255),
	event_opened TIMESTAMP,
	first_unit_arrived TIMESTAMP,
	first_unit_dispatched TIMESTAMP,
	first_unit_enroute TIMESTAMP,
	hour_of_day INTEGER,
	loi_search_complete TIMESTAMP,
	subtype VARCHAR(255),
	type VARCHAR(255),
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.description_extended;

CREATE TABLE IF NOT EXISTS incident.description_extended (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	dispatch_duration INTEGER,
	event_duration INTEGER,
	response_time INTEGER,
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.apparatus;

CREATE TABLE IF NOT EXISTS incident.apparatus (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	car_id VARCHAR(255),
	distance FLOAT,
	geohash VARCHAR(255),
	shift VARCHAR(1),
	station VARCHAR(255),
	unit_id VARCHAR(255),
	unit_type VARCHAR(255),
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.apparatus_extended;

CREATE TABLE IF NOT EXISTS incident.apparatus_extended (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	event_duration INTEGER,
	response_duration INTEGER,
	travel_duration INTEGER,
	turnout_duration INTEGER,
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.unit_arrived;

CREATE TABLE IF NOT EXISTS incident.unit_arrived (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	geohash VARCHAR(255),
	latitude FLOAT,
	longitude FLOAT,
	timestamp TIMESTAMP,
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.unit_available;

CREATE TABLE IF NOT EXISTS incident.unit_available (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	geohash VARCHAR(255),
	latitude FLOAT,
	longitude FLOAT,
	timestamp TIMESTAMP,
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.unit_dispatched;

CREATE TABLE IF NOT EXISTS incident.unit_dispatched (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	geohash VARCHAR(255),
	latitude FLOAT,
	longitude FLOAT,
	timestamp TIMESTAMP,
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.unit_enroute;

CREATE TABLE IF NOT EXISTS incident.unit_enroute (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	geohash VARCHAR(255),
	latitude FLOAT,
	longitude FLOAT,
	timestamp TIMESTAMP,
	PRIMARY KEY (incident_number)
);

DROP TABLE IF EXISTS incident.address;

CREATE TABLE IF NOT EXISTS incident.address (
	incident_number VARCHAR(255) REFERENCES incident.incident(incident_number) NOT NULL,
	address_id VARCHAR(255),
	address_line1 VARCHAR(255),
	city VARCHAR(255),
	common_place_name VARCHAR(255),
	cross_street1 VARCHAR(255),
	cross_street2 VARCHAR(255),
	first_due VARCHAR(255),
	geohash VARCHAR(255),
	latitude FLOAT,
	longitude FLOAT,
	name VARCHAR(255),
	number VARCHAR(255),
	postal_code VARCHAR(255),
	prefix_direction VARCHAR(255),
	response_zone VARCHAR(255),
	state VARCHAR(2),
	suffix_direction VARCHAR(255),
	type VARCHAR(255),
	geom GEOMETRY,
	PRIMARY KEY (incident_number)
);