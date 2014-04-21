package com.tw.blackjack.service;

import com.tw.blackjack.model.Poker;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PokerShuffleTest {
    @Test
    public void should_get_1_more_shape_or_13_less_pointName_at_first_13_cards_after_shuffle() throws Exception {
        Set<String> shapeSet = new HashSet<>();
        Set<String> pointNameSet = new HashSet<>();
        Poker poker = new Poker();
        poker.shuffle();
        for (int i = 0; i <= 12; i++) {
            shapeSet.add(poker.takeOneCard(i).getShape());
            pointNameSet.add(poker.takeOneCard(i).getPointName());
        }
        assertThat((shapeSet.size() > 1 || pointNameSet.size() < 13), is(true));
    }

    @Test
    public void should_get_1_more_shape_or_13_less_pointName_at_last_13_cards_after_shuffle() throws Exception {
        Set<String> shapeSet = new HashSet<>();
        Set<String> pointNameSet = new HashSet<>();
        Poker poker = new Poker();
        poker.shuffle();
        for (int i = 39; i <= 51; i++) {
            shapeSet.add(poker.takeOneCard(i).getShape());
            pointNameSet.add(poker.takeOneCard(i).getPointName());
        }
        assertThat((shapeSet.size() > 1 || pointNameSet.size() < 13), is(true));
    }
}
