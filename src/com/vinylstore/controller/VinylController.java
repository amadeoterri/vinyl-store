package com.vinylstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinylstore.dao.IVinylDAO;
import com.vinylstore.entity.Vinyl;

@Controller
@RequestMapping("/vinyls")
public class VinylController {

	// need to inject the dao
	@Autowired
	private IVinylDAO vinylDAO;

	@RequestMapping("/list")
	public String listVinyls(Model theModel) {

		// get vinyls from the dao
		List<Vinyl> theVinyls = vinylDAO.getVinyls();

		// add the customers to the model
		theModel.addAttribute("vinyls", theVinyls);

		return "list-vinyls";

	}

}
