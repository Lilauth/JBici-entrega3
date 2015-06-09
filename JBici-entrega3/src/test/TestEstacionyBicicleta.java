package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import model.Bicicleta;
import model.Estacion;

import org.junit.Test;

import dao.FactoryDAO;

public class TestEstacionyBicicleta {
	
	@Test
	public void testCRUD() throws Exception {				
		Estacion est = new Estacion();
		est.setNombre("Plaza Islas Malvinas");
		est.setEstado(FactoryDAO.getEstadoEstacionDAO().buscaPorID(1));		
		est.setUbicacion(-34.927494, -57.961193);
		est.setCantBiciletas(15);
		est.setCantEstacionamientos(30);
		
		FactoryDAO.getEstacionDAO().persistir(est);
		//creo una bicicleta
		Bicicleta bici = new Bicicleta();
		bici.setPatente("ABC123");
		bici.setFechaIngreso(new Date());		
		bici.setEstadoActual(FactoryDAO.getEstadoBicicletaDAO().buscaPorID(1));
		bici.setUbicacionActual(est);
		
		ArrayList<Bicicleta> lista = new ArrayList<Bicicleta>();
		lista.add(bici);
		est.setBicisDisponibles(lista);
		FactoryDAO.getBicicletaDAO().persistir(bici);
		
		assertEquals(1, FactoryDAO.getEstacionDAO().contarElementos());
	}

}
