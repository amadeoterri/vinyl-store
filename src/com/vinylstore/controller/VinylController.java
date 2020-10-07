package com.vinylstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Vinyl theVinyl = new Vinyl();

		theModel.addAttribute("vinyl", theVinyl);

		return "vinyl-form";

	}

	@PostMapping("/saveVinyl")
	public String saveVinyl(@ModelAttribute("vinyl") Vinyl theVinyl) {

		// save the vinyl using our service
		_vinylService.saveVinyl(theVinyl);

		return "redirect:/vinyls/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("vinylId") int theId, Model theModel) {

		// get the vinyl from the service
		Vinyl theVinyl = _vinylService.getVinyl(theId);

		// set vinyl as a model attribute to pre-populate the form
		theModel.addAttribute("vinyl", theVinyl);

		// send over to our form
		return "vinyl-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("vinylId") int theId) {

		_vinylService.deleteVinyl(theId);

		return "redirect:/vinyls/list";

	}

}
