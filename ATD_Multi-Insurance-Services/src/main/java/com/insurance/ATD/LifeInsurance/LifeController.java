package com.insurance.ATD.LifeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LifeController {
	@Autowired
	LifeRepo lifeRepo;
	
	@RequestMapping(value="LifeInsurance")
	public String LifeInsurance() {
		return "LifeOptions";
	}
	@RequestMapping(value="optionsPage")
	public String OptionsPage() {
		return "WholeLifeCover99Years";
	}
	@RequestMapping(value="userDetails")
	public String UserDetails() {
		return "LifePolicyHolderDetails";
	}
	@PostMapping(value="FilledUserDetails")
	public String filledUserDetails(LifeBean lb) {
		repo.save(lb);
		
		return "home";
	}
}
