package test;

import static org.junit.Assert.assertEquals;
import model.EstadoEstacion;
import org.junit.Test;
import dao.FactoryDAO;

public class TestEstadoEstacion {
	
	@Test
	public void testCRUD() throws Exception {
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
		
		assertEquals(3, FactoryDAO.getEstadoEstacionDAO().contarElementos());
		
	}

}
