package com.vinylstore.dao;

import java.util.List;

import com.vinylstore.entity.Vinyl;

public interface IVinylDAO {

	public List<Vinyl> getVinyls();

	public void saveVinyl(Vinyl theVinyl);

	public Vinyl getVinyl(int theId);

	public void deleteVinyl(int theId);

}
