package com.tw.blackjack.service;

import com.tw.blackjack.model.Card;
import com.tw.blackjack.model.Player;
import com.tw.blackjack.model.Poker;

import java.util.List;

public class BlackJack {
    private Poker poker;
    private Player player;
    private Player host;
    private int index;

    public BlackJack() {
        poker = new Poker();
        player = new Player();
        host = new Player();
        index = 0;
        poker.shuffle();
    }

    public void getFaceDownCards() {
        playerHit();
        playerHit();
        hostHit();
        hostHit();
    }

    public void hostHit() {
        host.draw(poker.takeOneCard(index++));
    }

    public void playerHit() {
        player.draw(poker.takeOneCard(index++));
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public int getHostScore() {
        return host.getScore();
    }

    public List<Card> getPlayerCards() {
        return player.getCards();
    }

    public List<Card> getHostCards() {
        return host.getCards();
    }
}
