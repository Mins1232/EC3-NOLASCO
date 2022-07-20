package com.idat.reserva.dto;

public class UsuarioClienteDTORequest {
	private Integer idUsu;
	private String usuarioCliente;
	private String passwordCliente;
	private String rolCliente;
	public Integer getIdUsu() {
		return idUsu;
	}
	public void setIdUsu(Integer idUsu) {
		this.idUsu = idUsu;
	}
	public String getUsuarioCliente() {
		return usuarioCliente;
	}
	public void setUsuarioCliente(String usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}
	public String getPasswordCliente() {
		return passwordCliente;
	}
	public void setPasswordCliente(String passwordCliente) {
		this.passwordCliente = passwordCliente;
	}
	public String getRolCliente() {
		return rolCliente;
	}
	public void setRolCliente(String rolCliente) {
		this.rolCliente = rolCliente;
	}
	
	
}
