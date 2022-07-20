package com.idat.reserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.idat.reserva.dto.UsuarioClienteDTORequest;
import com.idat.reserva.dto.UsuarioClienteDTOResponse;
import com.idat.reserva.model.Cliente;
import com.idat.reserva.model.UsuarioCliente;
import com.idat.reserva.repository.UsuarioClienteRepository;

public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public void guardarUsuarioCliente(UsuarioClienteDTORequest usuariocliente) {
		UsuarioCliente uc= new UsuarioCliente();
		uc.setUsuario(usuariocliente.getUsuarioCliente());
		uc.setPassword(usuariocliente.getPasswordCliente());
		uc.setRol(usuariocliente.getRolCliente());
		repository.save(uc);
		
	}

	@Override
	public void actualizarUsuarioCliente(UsuarioClienteDTORequest usuariocliente) {
		UsuarioCliente uc= new UsuarioCliente();
		uc.setIdUsuario(usuariocliente.getIdUsu());
		uc.setUsuario(usuariocliente.getUsuarioCliente());
		uc.setPassword(usuariocliente.getPasswordCliente());
		uc.setRol(usuariocliente.getRolCliente());
		repository.saveAndFlush(uc);
	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<UsuarioClienteDTOResponse> listarUsuarioCliente() {
		List<UsuarioClienteDTOResponse>listar =new ArrayList<>();
		UsuarioClienteDTOResponse dto=null;
		List<UsuarioCliente> uc=repository.findAll();
		
		for (UsuarioCliente usuariocliente: uc) {
			dto = new UsuarioClienteDTOResponse();
			
			dto.setUsuarioCliente(usuariocliente.getUsuario());
			dto.setPasswordCliente(usuariocliente.getPassword());
			dto.setRolCliente(usuariocliente.getRol());
			dto.setIdUsu(usuariocliente.getIdUsuario());
			listar.add(dto);
		}
		return listar;
	}

	@Override
	public UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id) {
		UsuarioCliente usuariocliente=repository.findById(id).orElse(null);
		UsuarioClienteDTOResponse dto=new UsuarioClienteDTOResponse();
		
		dto.setUsuarioCliente(usuariocliente.getUsuario());
		dto.setPasswordCliente(usuariocliente.getPassword());
		dto.setRolCliente(usuariocliente.getRol());
		dto.setIdUsu(usuariocliente.getIdUsuario());
		return dto;
	}
	

}
