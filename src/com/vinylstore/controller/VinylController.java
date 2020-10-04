package com.vinylstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vinyls")
public class VinylController {

	@RequestMapping("/list")
	public String listVinyls(Model theModel) {

		return "list-vinyls";

	}

}
