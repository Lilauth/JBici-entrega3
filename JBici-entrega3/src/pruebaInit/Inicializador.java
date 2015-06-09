package pruebaInit;

import javax.persistence.EntityManager;

import connection.Conexion;
import model.EstadoBicicleta;
import model.EstadoEstacion;
import model.Perfil;
import dao.FactoryDAO;

public class Inicializador {
	
	public static void inicializarEstadosBicicleta(){
		/**estado bicicleta*/
		EstadoBicicleta est_apta = new EstadoBicicleta();
		est_apta.setId(1);
		est_apta.setDescricpion("apta para uso");
		
		EstadoBicicleta est_des = new EstadoBicicleta();
		est_des.setId(2);
		est_des.setDescricpion("en desuso");
		
		EstadoBicicleta est_rep = new EstadoBicicleta();
		est_rep.setId(3);
		est_rep.setDescricpion("en reparación");
		
		EstadoBicicleta est_den = new EstadoBicicleta();
		est_den.setId(4);
		est_den.setDescricpion("denunciada");
		
		FactoryDAO.getEstadoBicicletaDAO().persistir(est_apta);
		FactoryDAO.getEstadoBicicletaDAO().persistir(est_des);
		FactoryDAO.getEstadoBicicletaDAO().persistir(est_rep);
		FactoryDAO.getEstadoBicicletaDAO().persistir(est_den);	
	}
	
	public static void inicializarEstadoEstacion(){
		EstadoEstacion est_op = new EstadoEstacion();
		est_op.setDescripcion("operativa");
		est_op.setId(1);
		
		EstadoEstacion est_ce = new EstadoEstacion();
		est_ce.setDescripcion("cerrada");
		est_ce.setId(2);
		
		EstadoEstacion est_enc = new EstadoEstacion();
		est_enc.setDescripcion("en construcción");
		est_enc.setId(3);
		
		FactoryDAO.getEstadoEstacionDAO().persistir(est_op);
		FactoryDAO.getEstadoEstacionDAO().persistir(est_ce);
		FactoryDAO.getEstadoEstacionDAO().persistir(est_enc);
		
	}
	
	public static void inicializarPerfiles(){
		Perfil perfil1 = new Perfil();
		perfil1.setId(1);
		perfil1.setDescripcion("administrador");
		FactoryDAO.getPerfilDAO().persistir(perfil1);	 
		
		Perfil perfil2 = new Perfil();
		perfil2.setId(2);
		perfil2.setDescripcion("usuario");
		FactoryDAO.getPerfilDAO().persistir(perfil2);
		
	}
	
	public static boolean testConexion(){
		EntityManager emf = Conexion.getEntityManager();
		return (emf!=null);
	}

}
