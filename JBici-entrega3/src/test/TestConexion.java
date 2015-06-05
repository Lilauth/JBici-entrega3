package test;

import static org.junit.Assert.assertEquals;
import javax.persistence.EntityManager;
import org.junit.Test;
import connection.Conexion;

public class TestConexion {
	
	@Test
	public void testCRUD() throws Exception {
		EntityManager emf = Conexion.getEntityManager();		
		assertEquals(true, emf.isOpen());
	}

}
