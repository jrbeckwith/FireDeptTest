package com.prominentedge.FireDeptTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prominentedge.FireDeptTest.model.Incident;

@Repository
public interface IncidentRepo extends JpaRepository<Incident, String> {
	Incident findByIncidentNumber(String incidentNumber);
}
