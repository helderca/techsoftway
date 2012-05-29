package RepositorioAgenda;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.Agenda;

public class repositorioAgenda {

	private Session session;
	private SessionFactory sf;

	public repositorioAgenda() {

		sf = new org.hibernate.cfg.Configuration().configure()
				.buildSessionFactory();
		session = sf.openSession();

	}

	public void salvaAgenda() {
		sf = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

		session = sf.openSession();
		String sql = "SELECT agenda (idagenda,dataconsulta,horarioconsulta,nomepaciente,observaconsulta) VALUES (?,?,?,?,?)";

		Query query = session.createQuery(sql);

		query.executeUpdate();

		session.close();

	}

	public void alteraAgenda() {

	}

	public void listaAgenda() {

	}

	public void removeAgenda(String nomepaciente) {

		}

}
