package model;

import java.util.Date;

public class PrestamoHistorico extends Prestamo {
	
	private Date fechaHoraDevolucion;
	private Estacion estacionDevolucion;
	private Denuncia denuncia;

	public Denuncia getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

	public Estacion getEstacionDevolucion() {
		return estacionDevolucion;
	}

	public void setEstacionDevolucion(Estacion estacionDevolucion) {
		this.estacionDevolucion = estacionDevolucion;
	}

	public Date getFechaHoraDevolucion() {
		return fechaHoraDevolucion;
	}

	public void setFechaHoraDevolucion(Date fechaHoraDevolucion) {
		this.fechaHoraDevolucion = fechaHoraDevolucion;
	}
	
	public PrestamoHistorico asignar(PrestamoActual p){
		PrestamoHistorico ph = new PrestamoHistorico();
		ph.setBicicleta(p.getBicicleta());
		ph.setEstacion(p.getEstacion());
		ph.setFechaHora(p.getFechaHora());
		ph.setUsuario(p.getUsuario());
		return ph;
	}

}
