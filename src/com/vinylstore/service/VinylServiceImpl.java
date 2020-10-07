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

}
