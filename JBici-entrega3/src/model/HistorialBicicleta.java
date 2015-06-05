package model;

import java.util.Date;

public class HistorialBicicleta {
	private EstadoBicicleta estado;
	private Date fechaYHora;
	private Estacion estacion;
	private Usuario responsable;
	public EstadoBicicleta getEstado() {
		return estado;
	}
	public void setEstado(EstadoBicicleta estado) {
		this.estado = estado;
	}
	public Date getFechaYHora() {
		return fechaYHora;
	}
	public void setFechaYHora(Date fechaYHora) {
		this.fechaYHora = fechaYHora;
	}
	public Estacion getEstacion() {
		return estacion;
	}
	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
	public Usuario getResponsable() {
		return responsable;
	}
	public void setResponsable(Usuario responsable) {
		this.responsable = responsable;
	}
	
	
}
