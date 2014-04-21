package com.tw.blackjack.controller;

import com.tw.blackjack.service.BlackJack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PokerController {
    private BlackJack blackJack = new BlackJack();
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        return modelAndView;
    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public ModelAndView getFaceDownCards() {
        ModelAndView modelAndView = new ModelAndView("showFaceDownCards");
        blackJack.getFaceDownCards();
        modelAndView.addObject("playerCards", blackJack.getPlayerCards());
        modelAndView.addObject("hostCards", blackJack.getHostCards());
        modelAndView.addObject("playerScore", blackJack.getPlayerScore());
        modelAndView.addObject("hostScore", blackJack.getHostScore());
        return modelAndView;
    }
}
