package test;

import static org.junit.Assert.assertEquals;
import model.Denuncia;

import org.junit.Test;

import dao.FactoryDAO;

public class TestDenuncia {
	@Test
	public void testCRUD() throws Exception {
	    Denuncia den = new Denuncia();
	    den.setDescripcion("tengo ganas de denunciar algo");
	    den.setPrestamoOrigen(FactoryDAO.getPrestamoHistoricoDAO().buscaPorID(2));
	    FactoryDAO.getDenunciaDAO().persistir(den);
	    
	    assertEquals(1, FactoryDAO.getDenunciaDAO().contarElementos());
	}
}
