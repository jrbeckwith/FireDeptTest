package com.prominentedge.FireDeptTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prominentedge.FireDeptTest.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, String> {
}
