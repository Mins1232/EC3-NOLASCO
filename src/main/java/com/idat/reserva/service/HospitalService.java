package com.idat.reserva.service;

import java.util.List;

import com.idat.reserva.dto.HospitalDTORequest;
import com.idat.reserva.dto.HospitalDTOResponse;


public interface HospitalService {
	void guardarHopsital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse>listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);
}
