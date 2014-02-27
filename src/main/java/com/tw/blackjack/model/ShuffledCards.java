package com.tw.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class ShuffledCards {
    public static final int CARD_NUMBER = 52;

    public List<Integer> shuffledCardsIndex;

    public ShuffledCards() {
        shuffledCardsIndex= new ArrayList<>();
        for(int i=0; i<CARD_NUMBER; i++) {
            shuffledCardsIndex.add(i);
        }
    }
}
