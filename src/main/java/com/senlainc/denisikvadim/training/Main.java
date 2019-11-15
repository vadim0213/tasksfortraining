package com.senlainc.denisikvadim.training;

import com.senlainc.denisikvadim.training.task1.FirstTaskMain;
import com.senlainc.denisikvadim.training.task2.SecondTaskMain;
import com.senlainc.denisikvadim.training.task3.ThirdTaskMain;
import com.senlainc.denisikvadim.training.task4.FourthTaskMain;
import com.senlainc.denisikvadim.training.task5.FifthTaskMain;
import com.senlainc.denisikvadim.training.task6.SixthTaskMain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static IGenericMain firstTaskMain = new FirstTaskMain();
    private static IGenericMain secondTaskMain = new SecondTaskMain();
    private static IGenericMain thirdTaskMain = new ThirdTaskMain();
    private static IGenericMain fourthTaskMain = new FourthTaskMain();
    private static IGenericMain fifthTaskMain = new FifthTaskMain();
    private static IGenericMain sixthTaskMain = new SixthTaskMain();

    public static void main(String[] args) {
        taskSelection();
    }

    private static void taskSelection() {
        while (true) {
            System.out.println("Enter task number: \nAvailable numbers: [1, 2, 3, 4, 5, 6]");
            try {
                int taskNumber = scanner.nextInt();
                switch (taskNumber) {
                    case 1:
                        firstTaskMain.startTask();
                        break;
                    case 2:
                        secondTaskMain.startTask();
                        break;
                    case 3:
                        thirdTaskMain.startTask();
                        break;
                    case 4:
                        fourthTaskMain.startTask();
                        break;
                    case 5:
                        fifthTaskMain.startTask();
                        break;
                    case 6:
                        sixthTaskMain.startTask();
                        break;
                    default:
                        System.err.println("Enter a correct value!");
                }
            } catch (InputMismatchException exc) {
                System.err.println("Enter a correct value!");
                scanner.nextLine();
            }
        }
    }

}
