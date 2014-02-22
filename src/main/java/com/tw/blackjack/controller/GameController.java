package com.tw.blackjack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getdata() {

		ModelAndView model = new ModelAndView("gamePage");
		return model;

	}

}