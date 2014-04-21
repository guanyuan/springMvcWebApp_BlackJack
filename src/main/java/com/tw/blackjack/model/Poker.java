package com.tw.blackjack.model;

import com.tw.blackjack.service.CardUtility;

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

    public void shuffle() {
        Collections.shuffle(cardList);
    }

    public Card takeOneCard(int idx) {
        return cardList.get(idx);
    }

    public List<Card> getPoker() {
        return cardList;
    }
}
