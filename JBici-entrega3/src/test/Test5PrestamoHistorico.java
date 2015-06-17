package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import dao.FactoryDAO;
import model.PrestamoHistorico;

public class Test5PrestamoHistorico {	
	@Test
	public void testCRUD() throws Exception {			
		PrestamoHistorico ph = new PrestamoHistorico();
		ph.asignar(FactoryDAO.getPrestamoActualDAO().buscaPorID(1));
		ph.setFechaHoraDevolucion(new Date());
		ph.setEstacionDevolucion(FactoryDAO.getEstacionDAO().buscaPorID(1));
		FactoryDAO.getPrestamoHistoricoDAO().persistir(ph);
		
		assertEquals(1, FactoryDAO.getPrestamoHistoricoDAO().contarElementos());
	}
}
