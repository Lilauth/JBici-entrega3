package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import model.Bicicleta;
import model.Estacion;
import model.EstadoBicicleta;
import model.EstadoEstacion;

import org.junit.Test;

import dao.FactoryDAO;

public class TestEstacionBicicleta {
	
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
		//creo una bicicleta
		Bicicleta bici = new Bicicleta();
		bici.setPatente("ABC123");
		bici.setFechaIngreso(new Date());
		EstadoBicicleta estadoBici = FactoryDAO.getEstadoBicicletaDAO().buscaPorID(1); //operativa
		bici.setEstadoActual(estadoBici);
		bici.setUbicacionActual(est);
		FactoryDAO.getBicicletaDAO().persistir(bici);
		
		assertEquals(1, FactoryDAO.getEstacionDAO().contarElementos());
	}

}
