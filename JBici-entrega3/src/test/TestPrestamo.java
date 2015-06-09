package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import model.Bicicleta;
import model.PrestamoActual;

import org.junit.Test;

import dao.FactoryDAO;

public class TestPrestamo {
	
	@Test
	public void testCRUD() throws Exception {
		//genero un prestamo
		PrestamoActual pa = new PrestamoActual();
		Bicicleta bici = FactoryDAO.getBicicletaDAO().buscaPorID(1);
		pa.setBicicleta(bici);
		pa.setFechaHora(new Date());
		pa.setEstacion(FactoryDAO.getEstacionDAO().buscaPorID(1));
		pa.setUsuario(FactoryDAO.getUsuarioDAO().buscarPorEMail("gonzales@hotmail.com"));
		bici.setPrestamoActual(pa);
		
		FactoryDAO.getPrestamoActualDAO().persistir(pa);
		//FactoryDAO.getBicicletaDAO().persistir(bici);
		
		assertEquals(1, FactoryDAO.getPrestamoActualDAO().contarElementos());
	}

}
