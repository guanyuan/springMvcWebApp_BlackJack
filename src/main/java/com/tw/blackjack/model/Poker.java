package com.tw.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    private List<Card> cardList = new ArrayList<>();
    public Poker() {
        for(String shape : CardUtility.SHAPE_LIST) {
            for (String pointName : CardUtility.POINT_NAME_LIST) {
                cardList.add(new Card(shape, pointName));
            }
        }
    }

    public Card takeCard(int index) {
        return cardList.get(index);
    }

    public void shuffleCards() {
        Collections.shuffle(cardList);
    }

    public List<Card> getAllCards() {
        return cardList;
    }
}
