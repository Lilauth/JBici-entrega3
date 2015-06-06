package test;

import static org.junit.Assert.assertEquals;
import model.EstadoBicicleta;

import org.junit.Test;

import dao.FactoryDAO;

public class TestEstadoBicicleta {
	
	@Test
	public void testCRUD() throws Exception {
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
		
		assertEquals(4, FactoryDAO.getEstadoBicicletaDAO().contarElementos());
	}

}
