package com.senlainc.denisikvadim.training.task3.wordservice;

import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

public interface IWordService {

    int getSentenceSize(String sentence);

    List<String> getSortedWords(String sentence);

    List<String> capitalizeFirstLetter(String sentence);

}
