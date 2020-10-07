package com.vinylstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vinylstore.dao.IVinylDAO;
import com.vinylstore.entity.Vinyl;

@Service
public class VinylServiceImpl implements IVinylService {

	// inject customer dao
	@Autowired
	private IVinylDAO _vinylDAO;

	@Override
	@Transactional
	public List<Vinyl> getVinyls() {

		return _vinylDAO.getVinyls();

	}

	@Override
	@Transactional
	public void saveVinyl(Vinyl theVinyl) {

		_vinylDAO.saveVinyl(theVinyl);

	}

	@Override
	@Transactional
	public Vinyl getVinyl(int theId) {

		return _vinylDAO.getVinyl(theId);
	}

	@Override
	@Transactional
	public void deleteVinyl(int theId) {

		_vinylDAO.deleteVinyl(theId);

	}

}
