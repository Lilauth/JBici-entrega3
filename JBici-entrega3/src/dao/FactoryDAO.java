package dao;

import model.Bicicleta;
import model.Estacion;
import model.EstadoBicicleta;
import model.EstadoEstacion;
import model.HistorialBicicleta;
import model.Perfil;
import model.Usuario;
import connection.Conexion;

public class FactoryDAO {
	
	public static IBaseDAO<Perfil> getPerfilDAO() {
		return new BaseDAOImpl<Perfil>(Perfil.class, Conexion.getEntityManager());
	}
	
	public static IUsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOImpl(Usuario.class, Conexion.getEntityManager());
	}
	
	public static IBaseDAO<EstadoEstacion> getEstadoEstacionDAO(){
		return new BaseDAOImpl<EstadoEstacion>(EstadoEstacion.class, Conexion.getEntityManager());	
	}
	
	public static IBaseDAO<EstadoBicicleta> getEstadoBicicletaDAO(){
		return new BaseDAOImpl<EstadoBicicleta>(EstadoBicicleta.class, Conexion.getEntityManager());
	}
	
	public static IBaseDAO<Estacion> getEstacionDAO(){
		return new BaseDAOImpl<Estacion>(Estacion.class, Conexion.getEntityManager());
	}
	
	public static IBaseDAO<Bicicleta> getBicicletaDAO(){
		return new BaseDAOImpl<Bicicleta>(Bicicleta.class, Conexion.getEntityManager());
	}
	
	public static IBaseDAO<HistorialBicicleta> getHistorialBicicletaDAO(){
		return new BaseDAOImpl<HistorialBicicleta>(HistorialBicicleta.class, Conexion.getEntityManager());
	}

}
