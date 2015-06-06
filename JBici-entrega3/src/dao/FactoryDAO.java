package dao;

import model.EstadoEstacion;
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

}
