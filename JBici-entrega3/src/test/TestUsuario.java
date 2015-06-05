package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import model.Perfil;
import model.Usuario;

import org.junit.Test;

import dao.FactoryDAO;

public class TestUsuario {
	@Test
	public void testCRUD() throws Exception {
		Usuario user1 = new Usuario();
		Perfil perfil1 = FactoryDAO.getPerfilDAO().buscaPorID(1);
		//user1.setId(1);
		user1.setPerfil(perfil1);
		user1.setApellido("Gonzalez");
		user1.setDni("00000000");
		user1.setNombre("Ezequiel");
		user1.setDomicilio("un domicilio");
		user1.setFechaNacimiento(new Date());
		user1.setPerfil(perfil1);
		user1.setSexo('M');
		//lo guarda en la base de datos
		FactoryDAO.getUsuarioDAO().persistir(user1);
		//lo recupera
		assertEquals("Gonzalez", FactoryDAO.getUsuarioDAO().buscaPorID(1).getApellido());
	}

}
