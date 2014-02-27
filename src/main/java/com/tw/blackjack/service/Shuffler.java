package com.tw.blackjack.service;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

import java.util.List;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

public class Shuffler {
    public static final int CARD_MAX_VALUE = 13;
    public static final ImmutableList<String> CARD_COLOR = ImmutableList.of(
            "Clubs","Diamonds","Hearts","Spades");
    public static final ImmutableList<String> CARD_VAlUE = ImmutableList.of(
            "Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King");


    public static Function<Integer, String> cardIndexToCardName() {
        return new Function<Integer, String>() {
            @Override
            public String apply(Integer index) {
                String cardName = "";
                cardName += CARD_COLOR.get(index / CARD_MAX_VALUE);
                if (index % CARD_MAX_VALUE == 0) {
                    cardName += "/King";
                }
                else {
                    cardName += ("/" + CARD_VAlUE.get(index % CARD_MAX_VALUE));
                }
                return cardName + ".jpg";
            }
        };
    }

    public static Function<Integer, Integer> cardIndexToCardPoint() {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer cardIndex) {
                Integer point;
                if (cardIndex % CARD_MAX_VALUE ==0){
                    point = 1;
                }
                else if (cardIndex % CARD_MAX_VALUE >=10) {
                    point = 10;
                }
                else {
                    point = cardIndex % CARD_MAX_VALUE;
                }

                return point;
            }
        };
    }



    public static List<Integer> shuffleCards(List<Integer> shuffledCardsIndex) {
        int randIndex,temp;
        for(int i = shuffledCardsIndex.size() - 1; i>=0; i--){
            randIndex = (int) (Math.random() * (i+1));
            temp = shuffledCardsIndex.get(i);
            shuffledCardsIndex.set(i, shuffledCardsIndex.get(randIndex));
            shuffledCardsIndex.set(randIndex, temp);
        }
        return shuffledCardsIndex;

    }
    public static List<String> getCardsName(List<Integer> shuffledCardsIndex) {
        return newArrayList(transform(shuffledCardsIndex, cardIndexToCardName()));
    }

    public static List<Integer> getCardsPoint(List<Integer> shuffledCardsIndex){
        return  newArrayList(transform(shuffledCardsIndex, cardIndexToCardPoint()));
    }
}
