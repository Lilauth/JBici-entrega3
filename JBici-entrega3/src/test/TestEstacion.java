package test;

import static org.junit.Assert.assertEquals;
import model.Estacion;
import model.EstadoEstacion;

import org.junit.Test;

import dao.FactoryDAO;

public class TestEstacion {
	
	@Test
	public void testCRUD() throws Exception {
		EstadoEstacion estado = FactoryDAO.getEstadoEstacionDAO().buscaPorID(1);
		
		Estacion est = new Estacion();
		est.setNombre("Plaza Islas Malvinas");
		est.setEstado(estado);		
		est.setUbicacion(-34.927494, -57.961193);
		est.setCantBiciletas(15);
		est.setCantEstacionamientos(30);
		
		FactoryDAO.getEstacionDAO().persistir(est);
		
		assertEquals(1, FactoryDAO.getEstacionDAO().contarElementos());
	}

}
