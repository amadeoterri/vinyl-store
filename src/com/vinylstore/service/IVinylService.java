package com.vinylstore.service;

import java.util.List;

import com.vinylstore.entity.Vinyl;

public interface IVinylService {

	public List<Vinyl> getVinyls();

	public void saveVinyl(Vinyl theVinyl);

	public Vinyl getVinyl(int theId);

	public void deleteVinyl(int theId);

}
