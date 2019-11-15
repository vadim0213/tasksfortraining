package com.senlainc.denisikvadim.training.task2;

import com.senlainc.denisikvadim.training.AbstractMain;
import com.senlainc.denisikvadim.training.IGenericMain;
import com.senlainc.denisikvadim.training.task2.numbercommonservice.INumberCommonService;
import com.senlainc.denisikvadim.training.task2.numbercommonservice.implementation.NumberCommonService;

import java.util.Scanner;

public class SecondTaskMain extends AbstractMain {

    private static IGenericMain secondTaskMain = new SecondTaskMain();
    private INumberCommonService secondTask = new NumberCommonService();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run(secondTaskMain);
    }

    private String getResult(String firstInput, String secondInput) {
        try {
            Integer firstNumber = Integer.valueOf(firstInput);
            Integer secondNumber = Integer.valueOf(secondInput);
            return "Your inputs are: [" + firstNumber + "] & [" + secondNumber + "]. Least common multiple is ["
                    + secondTask.getLcm(firstNumber, secondNumber) + "], greatest common divisor is ["
                    + secondTask.getGcd(firstNumber, secondNumber) + "]";
        } catch (NumberFormatException e) {
            return "Enter a correct value! Entered value must contain only digits and to be an integer";
        }
    }

    @Override
    public void startTask() {
        while (true) {
            System.out.println("Enter first number:     [type 'return' to stop this task]");
            String firstInput = scanner.nextLine();
            if (firstInput.equals("return")) {
                return;
            }
            System.out.println("Enter second number:     [type 'return' to stop this task]");
            String secondInput = scanner.nextLine();
            if (secondInput.equals("return")) {
                return;
            }
            System.out.println(getResult(firstInput, secondInput));
        }
    }

}