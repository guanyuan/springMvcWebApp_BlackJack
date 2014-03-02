package com.tw.blackjack.controller;

import com.tw.blackjack.model.Poker;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PokerControllerTest {
    @Test
    public void should_return_welcome_view() throws Exception {
        PokerController pokerController = new PokerController();
        ModelAndView modelAndView = pokerController.sendShuffledCards();
        assertThat(modelAndView.getViewName(), is("welcome"));
    }

    @Test
    public void should_get_shuffled_poker() throws Exception {
        PokerController pokerController = new PokerController();
        Poker poker = pokerController.getShuffledPoker();
        HashSet<String> shapeSet = new HashSet<>();
        HashSet<String> pointNameSet = new HashSet<>();
        for (int i = 0; i < 12; i++) {
            shapeSet.add(poker.takeCard(i).getShape());
            pointNameSet.add(poker.takeCard(i).getPointName());
        }
        assertThat(shapeSet.size() > 1 || pointNameSet.size() < 13, is(true));
    }

}
