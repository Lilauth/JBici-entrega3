package test;

import static org.junit.Assert.*;
import model.Perfil;
import org.junit.Test;
import dao.FactoryDAO;


public class TestPerfil {
	@Test
	public void testCRUD() throws Exception {			
		Perfil p = FactoryDAO.getPerfilDAO().buscaPorID(2);
		assertEquals("usuario", p.getDescripcion());
	}

}
