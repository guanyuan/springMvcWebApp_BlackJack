package com.tw.blackjack.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest {
    @Test
    public void should_be_9_point_after_get_heart_2_and_diamond_7() throws Exception {
        Player player = new Player();
        player.draw(new Card("Heart", "2"));
        player.draw(new Card("Diamond", "7"));
        assertThat(player.getCards().size(), is(2));
        assertThat(player.getScore(), is(9));
    }
    @Test
    public void should_be_12_point_after_get_heart_2_and_diamond_King() throws Exception {
        Player player = new Player();
        player.draw(new Card("Heart", "2"));
        player.draw(new Card("Diamond", "King"));
        assertThat(player.getCards().size(), is(2));
        assertThat(player.getScore(), is(12));
    }
}
