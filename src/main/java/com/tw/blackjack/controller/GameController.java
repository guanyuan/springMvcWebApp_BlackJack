package com.tw.blackjack.controller;

import com.tw.blackjack.model.ShuffledCards;
import com.tw.blackjack.service.Shuffler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GameController {

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public ModelAndView startGame() {
        ModelAndView model = new ModelAndView("welcome");
        ShuffledCards shuffledCards = new ShuffledCards();
        List<Integer> shuffledIndex = shuffledCards.shuffledCardsIndex;
        shuffledIndex = Shuffler.shuffleCards(shuffledIndex);
        model.addObject("shuffledCardsPoints", Shuffler.getCardsPoint(shuffledIndex));
        model.addObject("shuffledCardsNames", Shuffler.getCardsName(shuffledIndex));
        return model;
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public ModelAndView showHtmlPage() {
        ModelAndView model = new ModelAndView("redirect:/resources/html/hello.html");
        return model;
    }




}