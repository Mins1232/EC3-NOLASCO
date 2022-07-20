package com.idat.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.reserva.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
