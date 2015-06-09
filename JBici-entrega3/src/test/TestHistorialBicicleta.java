package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import model.HistorialBicicleta;

import org.junit.Test;

import dao.FactoryDAO;

public class TestHistorialBicicleta {
	
	@Test
	public void testCRUD() throws Exception {		
		HistorialBicicleta hb = new HistorialBicicleta();
		hb.setResponsable(FactoryDAO.getUsuarioDAO().buscarPorEMail("gonzales@hotmail.com"));
		hb.setFechaYHora(new Date());
		hb.setEstacion(FactoryDAO.getEstacionDAO().buscaPorID(1));
		hb.setEstado(FactoryDAO.getEstadoBicicletaDAO().buscaPorID(2));
		FactoryDAO.getHistorialBicicletaDAO().persistir(hb);
		assertEquals(1, FactoryDAO.getHistorialBicicletaDAO().contarElementos());
	}

}
