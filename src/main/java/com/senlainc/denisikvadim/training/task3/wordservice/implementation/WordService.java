package com.senlainc.denisikvadim.training.task3.wordservice.implementation;

import com.senlainc.denisikvadim.training.task3.wordservice.IWordService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class WordService implements IWordService {

    private List<String> parseSentence(String sentence) {
        String result = sentence.replaceAll("[-+:,.]", "");
        return Arrays.asList(result.split("\\s+"));
    }

    public int getSentenceSize(String sentence) {
        return parseSentence(sentence).size();
    }

    public List<String> getSortedWords(String sentence) {
        List<String> words = parseSentence(sentence);
        Collections.sort(words);
        return words;
    }

    public List<String> capitalizeFirstLetter(String sentence) {
        List<String> words = parseSentence(sentence);
        List<String> capitalizedWords = new ArrayList<>();
        words.forEach(word -> capitalizedWords.add(word.substring(0, 1).toUpperCase() + word.substring(1)));
        return capitalizedWords;
    }

}
