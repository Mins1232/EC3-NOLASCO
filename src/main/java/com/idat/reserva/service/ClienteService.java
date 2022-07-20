package com.idat.reserva.service;

import java.util.List;

import com.idat.reserva.dto.ClienteDTORequest;
import com.idat.reserva.dto.ClienteDTOResponse;




public interface ClienteService {
	void guardarClientes(ClienteDTORequest cliente);
	void actualizarClientes(ClienteDTORequest cliente);
	void eliminarClientes(Integer id);
	List<ClienteDTOResponse>listarClientes();
	ClienteDTOResponse obtenerClienteId(Integer id);
}
