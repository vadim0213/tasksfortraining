package com.senlainc.denisikvadim.training.task6;

import com.senlainc.denisikvadim.training.AbstractMain;
import com.senlainc.denisikvadim.training.IGenericMain;
import com.senlainc.denisikvadim.training.task6.backpackmanager.IBackpackManager;
import com.senlainc.denisikvadim.training.task6.backpackmanager.implementation.BackpackManager;
import com.senlainc.denisikvadim.training.task6.entity.Backpack;
import com.senlainc.denisikvadim.training.task6.entity.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SixthTaskMain extends AbstractMain {

    private static IGenericMain sixthTaskMain = new SixthTaskMain();
    private IBackpackManager sixthTask = new BackpackManager();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run(sixthTaskMain);
    }

    private boolean addItem(String firstInput, String secondInput, List<Item> items) {
        try {
            int weight = Integer.parseInt(firstInput);
            int cost = Integer.parseInt(secondInput);
            items.add(new Item(weight, cost));
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Enter a correct value! Entered value must contain only digits and to be an integer");
            return false;
        }
    }

    private Integer createItems(List<Item> items) {
        Integer i = 1;
        while (true) {
            System.out.println("Enter [" + i + "]st item's weight:   [type 'stop' to stop creating items | type 'return' to stop this task]");
            String firstInput = scanner.nextLine();
            if (firstInput.equals("stop")) {
                i--;
                break;
            }
            if (firstInput.equals("return")) {
                return null;
            }
            System.out.println("Enter [" + i + "]st item's cost:   [type 'stop' to stop creating items | type 'return' to stop this task]");
            String secondInput = scanner.nextLine();
            if (secondInput.equals("stop")) {
                i--;
                break;
            }
            if (secondInput.equals("return")) {
                return null;
            }
            if (addItem(firstInput, secondInput, items)) {
                i++;
            }
        }
        return i;
    }

    @Override
    public void startTask() {
        while (true) {
            System.out.println("Create items:");
            List<Item> items = new ArrayList<>();
            Integer itemsSize = createItems(items);
            if (itemsSize == null) {
                return;
            }
            System.out.println("You've created [" + itemsSize + "] items: \n" + items);
            System.out.println("Enter max weight you want your backpack to handle:");
            int backpackCapacity = scanner.nextInt();
            scanner.nextLine();
            Backpack backpack = new Backpack(backpackCapacity);
            sixthTask.loadBackpack(backpack, items);
            System.out.println("Backpack was successfully filled up! Max capacity is ["
                    + backpackCapacity + "], current load is [" + backpack.getLoad() + "].\n" +
                    "Backpack contains: \n" + backpack.getItems());
        }
    }

}