package com.idat.reserva.service;

import java.util.List;

import com.idat.reserva.dto.UsuarioClienteDTORequest;
import com.idat.reserva.dto.UsuarioClienteDTOResponse;

public interface UsuarioClienteService {
	void guardarUsuarioCliente(UsuarioClienteDTORequest usuariocliente);
	void actualizarUsuarioCliente(UsuarioClienteDTORequest usuariocliente);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioClienteDTOResponse>listarUsuarioCliente();
	UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id);
}
