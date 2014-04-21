package com.tw.blackjack.model;

import com.tw.blackjack.service.BlackJack;
import org.junit.Test;

public class BlackJackTest {
    @Test
    public void should_Name() throws Exception {

    }

    @Test
    public void should_get_four_face_down_cards() throws Exception {
        BlackJack blackJack = new BlackJack();
        blackJack.playerHit();
    }
}
