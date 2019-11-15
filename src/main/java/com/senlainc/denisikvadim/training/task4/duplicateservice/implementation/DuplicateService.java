package com.senlainc.denisikvadim.training.task4.duplicateservice.implementation;

import com.senlainc.denisikvadim.training.task4.duplicateservice.IDuplicateService;

import java.util.Arrays;
import java.util.List;


public class DuplicateService implements IDuplicateService {

    private List<String> getWordListToUpperCaseFromString(String sentence) {
        String result = sentence.toUpperCase().replaceAll("[-+:,.]", "");
        return Arrays.asList(result.split("\\s+"));
    }

    public int getNumberOfDuplicates(String sentence, String duplicate) {
        int number = 0;
        duplicate = duplicate.toUpperCase();
        List<String> words = getWordListToUpperCaseFromString(sentence);
        for (String word : words) {
            if (word.equals(duplicate)) {
                number++;
            }
        }
        return number;
    }

}
