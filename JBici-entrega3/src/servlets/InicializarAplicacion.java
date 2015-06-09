package servlets;

import java.io.IOException;
/*import javax.persistence.PersistenceContext;*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pruebaInit.Inicializador;

/**
 * Servlet implementation class InicializarAplicacion
 */
@WebServlet("/InicializarAplicacion")
public class InicializarAplicacion extends HttpServlet {
	private static final long serialVersionUID = 1L;	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Inicializador.testConexion();		
	}


}
