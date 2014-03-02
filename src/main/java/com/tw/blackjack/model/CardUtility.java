package com.tw.blackjack.model;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

public class CardUtility {
    static final Map<String, Integer> POINT_MAP = createPointMap();
    static final List<String> SHAPE_LIST = createShapeList();
    static final List<String> POINT_NAME_LIST = createPointNameList();

    public CardUtility() {
    }

    private static ImmutableList<String> createPointNameList() {
        ImmutableList.Builder<String> pointListBuilder = ImmutableList.builder();
        pointListBuilder.add("Ace");
        addPointListEntryFrom2To10(pointListBuilder);
        pointListBuilder.add("Jack");
        pointListBuilder.add("Queue");
        pointListBuilder.add("King");
        return pointListBuilder.build();
    }

    private static void addPointListEntryFrom2To10(ImmutableList.Builder<String> pointListBuilder) {
        for (int i = 2; i <= 10; i++) {
            pointListBuilder.add(String.valueOf(i));
        }
    }

    static ImmutableList<String> createShapeList() {
        return ImmutableList.of("Club", "Diamond", "Heart", "Spade");
    }

    static ImmutableMap<String, Integer> createPointMap() {
        ImmutableMap.Builder<String, Integer> pointMapBuilder = ImmutableMap.<String, Integer>builder()
                .put("Ace", 1)
                .put("Jack", 10)
                .put("Queue", 10)
                .put("King", 10);
        addPointMapEntryFrom2To10(pointMapBuilder);
        return pointMapBuilder.build();
    }

    static void addPointMapEntryFrom2To10(ImmutableMap.Builder<String, Integer> pointMapBuilder) {
        for (int i = 2; i <= 10; i++) {
            pointMapBuilder.put(String.valueOf(i), i);
        }
    }

    static String upperFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() +
                string.substring(1).toLowerCase();
    }
}