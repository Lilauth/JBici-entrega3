package model;

import java.util.ArrayList;

public class Estacion {
	
	private class Ubicacion{
		private float latitud;
		private float longitud;
		
		public Ubicacion(float lat, float longitud){
			this.latitud = lat;
			this.longitud = longitud;
		}
		
		public float getLatitud() {
			return latitud;
		}
		
		public float getLongitud() {
			return longitud;
		}		
		
	}
	
	private String nombre;
	private Ubicacion ubicacion;
	private EstadoEstacion estado;
	private int cantBiciletas;
	private int cantEstacionamientos;
	private ArrayList<Bicicleta> bicisDisponibles;
	
	public ArrayList<Bicicleta> getBicisDisponibles() {
		return bicisDisponibles;
	}
	public void setBicisDisponibles(ArrayList<Bicicleta> bicisDisponibles) {
		this.bicisDisponibles = bicisDisponibles;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Float> getUbicacion(){
		ArrayList<Float> ubic = new ArrayList<Float>();
		ubic.add(this.ubicacion.getLatitud());
		ubic.add(this.ubicacion.getLongitud());
		return ubic;
	}
	
	public void setUbicacion(float latitud, float longitud) {
		this.ubicacion = new Ubicacion(latitud, longitud);
	}
	public EstadoEstacion getEstado() {
		return estado;
	}
	public void setEstado(EstadoEstacion estado) {
		this.estado = estado;
	}
	public int getCantBiciletas() {
		return cantBiciletas;
	}
	public void setCantBiciletas(int cantBiciletas) {
		this.cantBiciletas = cantBiciletas;
	}
	public int getCantEstacionamientos() {
		return cantEstacionamientos;
	}
	public void setCantEstacionamientos(int cantEstacionamientos) {
		this.cantEstacionamientos = cantEstacionamientos;
	}
	
	public Bicicleta prestarBicicleta(Usuario user){
		//crea un prestamo actual
		//se lo pasa a la bicicleta
		//saca la bicicleta de la lista de disponibles
		//entrega la bicicleta
		return null;
	}
	
	public void devolverBicicleta(Bicicleta unaBicileta){
		//le pasa los datos que necesite a la bicicleta
		//agrega la bici a la lista de disponibles.
	}
	
	public void devolverYDenunciarBicicleta(Bicicleta unaBicicleta, Denuncia unaDenuncia){
		//
	}
	
	public int cantidadEstacionamientosLibres(){
		//return cantEstacionamientos - bicisDisponibles.size();
		return 0;
	}
	

}
