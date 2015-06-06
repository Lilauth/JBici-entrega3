package test;

import static org.junit.Assert.*;
import model.Perfil;
import org.junit.Test;
import dao.FactoryDAO;


public class TestPerfil {
	@Test
	public void testCRUD() throws Exception {
		
		Perfil perfil1 = new Perfil();
		perfil1.setId(1);
		perfil1.setDescripcion("administrador");
		FactoryDAO.getPerfilDAO().persistir(perfil1);
		
		Perfil perfil2 = new Perfil();
		perfil2.setId(2);
		perfil2.setDescripcion("usuario");
		FactoryDAO.getPerfilDAO().persistir(perfil2);
		
		Perfil p = FactoryDAO.getPerfilDAO().buscaPorID(1); 
		assertEquals("administrador", p.getDescripcion());
	}

}
