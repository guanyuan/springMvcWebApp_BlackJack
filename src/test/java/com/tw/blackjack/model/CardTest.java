package com.tw.blackjack.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CardTest {
    @Test
    public void should_be_2_point_of_heart_2() throws Exception {
        assertThat(new Card("heart", "2").getPoint(), is(2));
    }

    @Test
    public void should_be_10_point_of_heart_10() throws Exception {
        assertThat(new Card("heart", "10").getPoint(), is(10));
    }

    @Test
    public void should_be_1_point_of_heart_ace() throws Exception {
        assertThat(new Card("heart", "Ace").getPoint(), is(1));
    }

    @Test
    public void should_be_10_points_of_heart_jack() throws Exception {
        assertThat(new Card("heart", "Jack").getPoint(), is(10));
    }

    @Test
    public void should_be_10_point_of_heart_Queue() throws Exception {
        assertThat(new Card("heart", "Queue").getPoint(), is(10));
    }

    @Test
    public void should_be_10_point_of_heart_king() throws Exception {
        assertThat(new Card("heart", "King").getPoint(), is(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_create_card_with_wrong_point_name() throws Exception {
        new Card("heart", "fake point");
    }

    @Test
    public void should_be_heart_of_heart_2() throws Exception {
        assertThat(new Card("heart","2").getShape(), is("Heart"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_create_card_with_wrong_shape() throws Exception {
        new Card("fake shape", "2");
    }

    @Test
    public void should_be_ace_of_heart_ace() throws Exception {
        Card card = new Card("heart", "ace");
        assertThat(card.getPointName(), is("Ace"));
    }

    @Test
    public void should_be_2_of_heart_2() throws Exception {
        Card heart_2 = new Card("heart", "2");
        assertThat(heart_2.getPointName(), is("2"));
    }
}
