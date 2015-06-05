package dao;

import model.Perfil;
import model.Usuario;
import connection.Conexion;

public class FactoryDAO {
	
	public static IBaseDAO<Perfil> getPerfilDAO() {
		return new BaseDAOImpl<Perfil>(Perfil.class, Conexion.getEntityManager());
	}
	
	public static IBaseDAO<Usuario> getUsuarioDAO() {
		return new BaseDAOImpl<Usuario>(Usuario.class, Conexion.getEntityManager());
	}

}
