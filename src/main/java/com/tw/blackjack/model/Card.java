package com.tw.blackjack.model;

import com.tw.blackjack.service.CardUtility;

public class Card {

    private final CardUtility cardUtility = new CardUtility();
    private String shape;
    private final String pointName;

    public Card(String shape, String pointName) {
        shape = cardUtility.upperFirstLetter(shape);
        this.shape = shape;
        if (!CardUtility.SHAPE_LIST.contains(shape)) {
            throw new IllegalArgumentException("wrong shape");
        }
        pointName = cardUtility.upperFirstLetter(pointName);
        this.pointName = pointName;
        if (!CardUtility.POINT_MAP.containsKey(this.pointName)) {
            throw new IllegalArgumentException("wrong pointName");
        }
    }

    public int getPoint() {
        return CardUtility.POINT_MAP.get(pointName);
    }

    public String getShape() {
        return shape;
    }

    public String getPointName() {
        return pointName;
    }
}
