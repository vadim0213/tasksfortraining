package com.senlainc.denisikvadim.training.task3.wordservice;

import java.util.List;


public interface IWordService {

    int getSentenceSize(String sentence);

    List<String> getSortedWords(String sentence);

    List<String> capitalizeFirstLetter(String sentence);

}
