package com.vinylstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinylstore.entity.Vinyl;

@Repository
public class VinylDAOImpl implements IVinylDAO {

	// inject session factory
	@Autowired
	private SessionFactory _sessionFactory;

	@Override
	public List<Vinyl> getVinyls() {

		// get current hibernate session
		Session session = _sessionFactory.getCurrentSession();

		// create a query ... sort by artist
		Query<Vinyl> theQuery = session.createQuery("FROM Vinyl ORDER BY artist", Vinyl.class);

		// execute query and get result
		List<Vinyl> vinyls = theQuery.getResultList();

		// return the results
		return vinyls;

	}

	@Override
	public void saveVinyl(Vinyl theVinyl) {

		Session session = _sessionFactory.getCurrentSession();

		session.saveOrUpdate(theVinyl);
	}

	@Override
	public Vinyl getVinyl(int theId) {

		Session session = _sessionFactory.getCurrentSession();

		Vinyl theVinyl = session.get(Vinyl.class, theId);

		return theVinyl;
	}

	@Override
	public void deleteVinyl(int theId) {

		Session session = _sessionFactory.getCurrentSession();

		Vinyl theVinyl = session.get(Vinyl.class, theId);

		session.delete(theVinyl);

	}

}
