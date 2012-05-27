package contatoDAO;

import java.sql.PreparedStatement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class contatoDAO<T> {

	private Session session;
	private SessionFactory sf;
	private Class<T> clazz;

	public contatoDAO() {

		sf = new org.hibernate.cfg.Configuration().configure()
				.buildSessionFactory();
		session = sf.openSession();

	}

	public void salvaAgenda(long idAgenda) {
		sf = new org.hibernate.cfg.Configuration().configure()
				.buildSessionFactory();

		session = sf.openSession();
		String sql = "SELECT agenda FROM agenda WHERE idAgenda = " + idAgenda;

		Query query = session.createQuery(sql);

		query.executeUpdate();

		session.close();

	}

	public void alteraAgenda() {

	}

	public void listaAgenda() {

	}

	public void removeAgenda(String nomepaciente) {

		sf = new org.hibernate.cfg.Configuration().configure()
				.buildSessionFactory();
		session = sf.openSession();
		String sql = "DELETE FROM agenda WHERE nomopaciente =" + nomepaciente;

		Query query = session.createQuery(sql);

		query.executeUpdate();

		session.close();

	}

}
