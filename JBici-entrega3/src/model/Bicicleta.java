package model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Bicicleta {
	
	private Date fechaIngreso;
	private String patente;
	private Estacion ubicacionActual;
	private PrestamoActual prestamoActual;
	private ArrayList<PrestamoHistorico> prestamosHistoricos;
	private ArrayList<HistorialBicicleta> historial;	
	private EstadoBicicleta estadoActual;
	
	/*getters and setters*/
	public ArrayList<HistorialBicicleta> getHistorial() {
		return historial;
	}
	public void agregarHistorial(HistorialBicicleta historial) {
		this.historial.add(historial);
	}

	
	public PrestamoActual getPrestamoActual() {
		return prestamoActual;
	}
	public void setPrestamoActual(PrestamoActual prestamoActual) {
		this.prestamoActual = prestamoActual;
	}
	public EstadoBicicleta getEstadoActual() {
		return estadoActual;
	}
	public void setEstadoActual(EstadoBicicleta estadoActual) {
		this.estadoActual = estadoActual;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Estacion getUbicacionActual() {
		return ubicacionActual;
	}
	public void setUbicacionActual(Estacion ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}
	
	/*comportamiento*/	
	public void devolver(){
		PrestamoHistorico archivar = new PrestamoHistorico();
		archivar.asignar(this.prestamoActual);
		//setea fecha y hora devolucion, setea estacion de retorno
		this.prestamosHistoricos.add(archivar);		
		this.prestamoActual = null;
	}
    
}
