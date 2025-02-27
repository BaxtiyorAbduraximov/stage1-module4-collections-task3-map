package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(sentence.toLowerCase().split("\\W+"))
                .filter(word -> !word.isEmpty())
                .forEach(word -> map.merge(word, 1, Integer::sum));
//        String[] words = sentence.toLowerCase().split("\\W+");
//
//
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                map.put(word, map.getOrDefault(word, 0) + 1);
//            }
//        }
        return map;
    }
}
