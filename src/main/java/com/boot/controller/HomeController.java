package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kristina on 27-Feb-18.
 */
@RestController
public class HomeController {


	@RequestMapping("/")
	public String home() {
		return "Das Boot, reporting for duty!";
	}
}
