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
	private SessionFactory sessionFactory;

	@Override
	public List<Vinyl> getVinyls() {

		// get current hibernate session
		Session session = sessionFactory.getCurrentSession();

		// create a query
		Query<Vinyl> theQuery = session.createQuery("FROM Vinyl", Vinyl.class);

		// execute query and get result
		List<Vinyl> vinyls = theQuery.getResultList();

		// return the results
		return vinyls;

	}

}
