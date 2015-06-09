package test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import model.Bicicleta;
import model.HistorialBicicleta;

import org.junit.Test;

import dao.FactoryDAO;

public class TestRecuperaBicicleta {

	@Test
	public void testCRUD() throws Exception {		
		Bicicleta bici = FactoryDAO.getBicicletaDAO().buscaPorID(1);
		List<HistorialBicicleta> hb = bici.getHistorial();
		assertEquals(2, hb.size());
	}
}
