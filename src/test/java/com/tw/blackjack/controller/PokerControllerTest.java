package com.tw.blackjack.controller;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PokerControllerTest {
    @Test
    public void should_return_welcome_view() throws Exception {
        PokerController pokerController = new PokerController();
        ModelAndView modelAndView = pokerController.welcome();
        assertThat(modelAndView.getViewName(), is("welcome"));
    }

    @Test
    public void should_return_showFaceDownCards_view() throws Exception {
        PokerController pokerController = new PokerController();
        ModelAndView modelAndView = pokerController.getFaceDownCards();
        assertThat(modelAndView.getViewName(), is("showFaceDownCards"));
    }
}
