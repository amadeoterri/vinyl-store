package com.vinylstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinylstore.entity.Vinyl;
import com.vinylstore.service.IVinylService;

@Controller
@RequestMapping("/vinyls")
public class VinylController {

	// inject vinyl service
	@Autowired
	private IVinylService _vinylService;

	@GetMapping("/list")
	public String listVinyls(Model theModel) {

		// get vinyls from the service
		List<Vinyl> theVinyls = _vinylService.getVinyls();

		// add the customers to the model
		theModel.addAttribute("vinyls", theVinyls);

		return "list-vinyls";

	}

}
