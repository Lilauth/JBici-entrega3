package test;

import static org.junit.Assert.*;
import model.Perfil;
import org.junit.Test;
import dao.FactoryDAO;


public class TestPerfil {
	@Test
	public void testCRUD() throws Exception {
		
		Perfil perfil1 = new Perfil();
		perfil1.setDescripcion("administrador");
		FactoryDAO.getPerfilDAO().persistir(perfil1);
		Perfil p = FactoryDAO.getPerfilDAO().buscaPorID(1); 
		assertEquals("usuario", p.getDescripcion());
	}

}
