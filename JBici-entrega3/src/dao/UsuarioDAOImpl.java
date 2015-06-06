package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Usuario;

public class UsuarioDAOImpl extends BaseDAOImpl<Usuario> implements IUsuarioDAO {

	public UsuarioDAOImpl(Class<Usuario> unaClase, EntityManager unEntityManager) {
		super(unaClase, unEntityManager);
	}

	@Override
	public Usuario buscarPorEMail(String emailUsuario) {
		Query qry = this.em.createQuery("select u from Usuario u where u.email = :email");
		qry.setParameter("email", emailUsuario);
		qry.setMaxResults(1);
		return((Usuario) qry.getSingleResult());
	}

}
