package com.tw.blackjack.controller;

import com.tw.blackjack.model.Poker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PokerController {
    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public ModelAndView sendShuffledCards() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("shuffledPoker", getShuffledPoker());
        return modelAndView;
    }

    public Poker getShuffledPoker() {
        Poker poker = new Poker();
        poker.shuffleCards();
        return poker;
    }
}
