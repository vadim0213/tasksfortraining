package com.senlainc.denisikvadim.training.task1; 

import com.senlainc.denisikvadim.training.AbstractMain;
import com.senlainc.denisikvadim.training.IGenericMain;
import com.senlainc.denisikvadim.training.task1.integerqualifier.IIntegerQualifier;
import com.senlainc.denisikvadim.training.task1.integerqualifier.implementation.IntegerQualifier;

import java.util.Scanner;

public class FirstTaskMain extends AbstractMain {

    private static IGenericMain firstTaskMain = new FirstTaskMain();
    private IIntegerQualifier firstTask = new IntegerQualifier();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run(firstTaskMain);
    }

    private String getResult(String input) {
        try {
            Integer number = Integer.valueOf(input);
            return "Your input is: [" + input + "]. It is [" + firstTask.isEven(number) + "] and ["
                    + firstTask.isPrime(number) + "]";
        } catch (NumberFormatException e) {
            return "Enter a correct value! Entered value must contain only digits and to be an integer";
        }
    }

    @Override
    public void startTask() {
        while (true) {
            System.out.println("Enter some number:     [type 'return' to stop this task]");
            String input = scanner.nextLine();
            if (input.equals("return")) {
                return;
            } 
            System.out.println(getResult(input));
        }
    }

}
