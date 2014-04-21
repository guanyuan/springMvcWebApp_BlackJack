package com.tw.blackjack.service;

import com.tw.blackjack.model.Poker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class PokerInitTest {
    int cardIndex;
    String shape, pointName;

    public PokerInitTest(int cardIndex, String shape, String pointName) {
        this.cardIndex = cardIndex;
        this.shape = shape;
        this.pointName = pointName;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, "Club", "Ace"},
                {12, "Club", "King"},
                {24, "Diamond", "Queue"},
                {31, "Heart", "6"},
                {47, "Spade", "9"}});
    }

    @Test
    public void should_be_right_shape_at_5_different_index() throws Exception {
        assertThat(new Poker().takeOneCard(cardIndex).getShape(), is(shape));
    }

    @Test
    public void should_be_right_pointName_at_5_different_index() throws Exception {
        assertThat(new Poker().takeOneCard(cardIndex).getPointName(), is(pointName));

            }
}
