package com.senlainc.denisikvadim.training.task5;

import com.senlainc.denisikvadim.training.AbstractMain;
import com.senlainc.denisikvadim.training.IGenericMain;
import com.senlainc.denisikvadim.training.task5.palindromeservice.IPalindromeService;
import com.senlainc.denisikvadim.training.task5.palindromeservice.implementation.PalindromeService;

import java.util.List;
import java.util.Scanner;

public class FifthTaskMain extends AbstractMain {

    private static IGenericMain fifthTaskMain = new FifthTaskMain();
    private IPalindromeService fifthTask = new PalindromeService();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run(fifthTaskMain);
    }

    private String getResult(String input) {
        try {
            Integer length = Integer.valueOf(input);
            List<Integer> palindromes = fifthTask.findPalindromes(length);
            if (palindromes != null && !palindromes.isEmpty()) {
                return "Palindromes: " + palindromes;
            }
            return "There are no palindrome-numbers in given sequence [0-" + length + "]";
        } catch (NumberFormatException e) {
            return "Enter a correct value! Entered value must contain only digits and to be an integer";
        }
    }

    @Override
    public void startTask() {
        while (true) {
            System.out.println("Enter length of your sequence:     [type 'return' to stop this task]");
            String input = scanner.nextLine();
            if (input.equals("return")) {
                return;
            }
            System.out.println(getResult(input));
        }
    }


}


