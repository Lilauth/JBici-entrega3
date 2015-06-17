package test;

import static org.junit.Assert.assertEquals;
import java.util.Date;
import model.HistorialBicicleta;
import org.junit.Test;
import dao.FactoryDAO;

public class Test3HistorialBicicleta {
	
	@Test
	public void testCRUD() throws Exception {		
		HistorialBicicleta hb = new HistorialBicicleta();
		hb.setResponsable(FactoryDAO.getUsuarioDAO().buscarPorEMail("gonzales@hotmail.com"));
		hb.setFechaYHora(new Date());
		hb.setEstacion(FactoryDAO.getEstacionDAO().buscaPorID(1));
		hb.setEstado(FactoryDAO.getEstadoBicicletaDAO().buscaPorID(1));
		hb.setBicicleta(FactoryDAO.getBicicletaDAO().buscaPorID(1));
		FactoryDAO.getHistorialBicicletaDAO().persistir(hb);
		
		HistorialBicicleta hb2 = new HistorialBicicleta();
		hb2.setResponsable(FactoryDAO.getUsuarioDAO().buscarPorEMail("gonzales@hotmail.com"));
		hb2.setFechaYHora(new Date());
		hb2.setEstacion(FactoryDAO.getEstacionDAO().buscaPorID(1));
		hb2.setEstado(FactoryDAO.getEstadoBicicletaDAO().buscaPorID(1));
		hb2.setBicicleta(FactoryDAO.getBicicletaDAO().buscaPorID(1));
		FactoryDAO.getHistorialBicicletaDAO().persistir(hb2);
		assertEquals(2, FactoryDAO.getHistorialBicicletaDAO().contarElementos());
	}

}
