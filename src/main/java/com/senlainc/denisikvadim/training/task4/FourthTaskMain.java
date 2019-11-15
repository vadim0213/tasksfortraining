package com.senlainc.denisikvadim.training.task4;

import com.senlainc.denisikvadim.training.AbstractMain;
import com.senlainc.denisikvadim.training.IGenericMain;
import com.senlainc.denisikvadim.training.task4.duplicateservice.IDuplicateService;
import com.senlainc.denisikvadim.training.task4.duplicateservice.implementation.DuplicateService;

import java.util.Scanner;

public class FourthTaskMain extends AbstractMain {

    private static IGenericMain fourthTaskMain = new FourthTaskMain();
    private IDuplicateService fourthTask = new DuplicateService();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run(fourthTaskMain);
    }

    @Override
    public void startTask() {
        while (true) {
            System.out.println("Enter your sentence:     [type 'return' to stop this task]");
            String inputSentence = scanner.nextLine();
            if (inputSentence.equals("return")) {
                return;
            }
            System.out.println("Type a word whose duplicates you are looking for:     [type 'return' to stop this task]");
            String inputWord = scanner.nextLine();
            if (inputWord.equals("return")) {
                return;
            }
            System.out.println("There are [" + fourthTask.getNumberOfDuplicates(inputSentence, inputWord) +
                    "] duplicates of [" + inputWord + "] in [" + inputSentence + "]");
        }
    }

}
