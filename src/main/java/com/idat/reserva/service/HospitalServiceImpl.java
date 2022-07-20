package com.idat.reserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.reserva.dto.HospitalDTORequest;
import com.idat.reserva.dto.HospitalDTOResponse;
import com.idat.reserva.model.Hospital;
import com.idat.reserva.repository.HospitalRepository;
@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository repository;

	@Override
	public void guardarHopsital(HospitalDTORequest hospital) {
		Hospital h=new Hospital();
		h.setNombre(hospital.getNombreHospital());
		h.setDescripcion(hospital.getDescripcionHospital());
		h.setDistrito(hospital.getDistritoHospital());
		
		repository.save(h);
		
	}

	@Override
	public void actualizarHospital(HospitalDTORequest hospital) {
		Hospital h=new Hospital();
		h.setNombre(hospital.getNombreHospital());
		h.setDescripcion(hospital.getDescripcionHospital());
		h.setDistrito(hospital.getDistritoHospital());
		h.setIdHospital(hospital.getId());
		repository.saveAndFlush(h);
		
	}

	@Override
	public void eliminarHospital(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<HospitalDTOResponse> listarHospital() {
		List<HospitalDTOResponse>listar=new ArrayList<>();
		HospitalDTOResponse dto=null;
		List<Hospital> h=repository.findAll();
		
		for(Hospital hospital : h) {
			dto=new HospitalDTOResponse();
			dto.setNombreHospital(hospital.getNombre());
			dto.setDescripcionHospital(hospital.getDescripcion());
			dto.setDistritoHospital(hospital.getDistrito());
			dto.setId(hospital.getIdHospital());
			listar.add(dto);
		}
		return listar;
	}

	@Override
	public HospitalDTOResponse obtenerHospitalId(Integer id) {
		Hospital hospital=repository.findById(id).orElse(null);
		HospitalDTOResponse dto=new HospitalDTOResponse();
		dto.setNombreHospital(hospital.getNombre());
		dto.setDescripcionHospital(hospital.getDescripcion());
		dto.setDistritoHospital(hospital.getDistrito());
		dto.setId(hospital.getIdHospital());
		return dto;
	}
	

}
