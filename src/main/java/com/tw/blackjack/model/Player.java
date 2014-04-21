package com.tw.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards;
    private int score;

    public Player() {
        cards = new ArrayList<>();
        score = 0;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getScore() {
        return score;
    }

    public void draw(Card card) {
        cards.add(card);
        score += card.getPoint();
    }
}
