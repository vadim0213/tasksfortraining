package com.senlainc.denisikvadim.training.task3;

import com.senlainc.denisikvadim.training.AbstractMain;
import com.senlainc.denisikvadim.training.IGenericMain;
import com.senlainc.denisikvadim.training.task3.wordservice.IWordService;
import com.senlainc.denisikvadim.training.task3.wordservice.implementation.WordService;

import java.util.Scanner;

public class ThirdTaskMain extends AbstractMain {

    private static IGenericMain thirdTaskMain = new ThirdTaskMain();
    private IWordService thirdTask = new WordService();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run(thirdTaskMain);
    }

    @Override
    public void startTask() {
        while (true) {
            System.out.println("Type some text:    [type 'return' to stop this task]");
            String sentence = scanner.nextLine();
            if (sentence.equals("return")) {
                return;
            }
            System.out.println("Your sentence contains of [" + thirdTask.getSentenceSize(sentence) + "] words \n" +
                    "Sorted sentence: " + thirdTask.getSortedWords(sentence) + "\n" +
                    "Words with first letter capitalized: " + thirdTask.capitalizeFirstLetter(sentence));
        }
    }

}
