package com.senlainc.denisikvadim.training.task6.backpackmanager.implementation;

import com.senlainc.denisikvadim.training.task6.backpackmanager.IBackpackManager;
import com.senlainc.denisikvadim.training.task6.entity.Backpack;
import com.senlainc.denisikvadim.training.task6.entity.Item;

import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class BackpackManager implements IBackpackManager {

    private void putItems(int[][] matrix, int row, int column, List<Item> allItems, List<Item> backpackItems) {
        if (allItems == null || allItems.isEmpty() || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        if (matrix[row][column] == 0) {
            return;
        }
        if (matrix[row - 1][column] == matrix[row][column]) {
            putItems(matrix, row - 1, column, allItems, backpackItems);
            return;
        }
        putItems(matrix, row - 1, column - allItems.get(row - 1).getWeight(), allItems, backpackItems);
        backpackItems.add(allItems.get(row - 1));
    }

    private int[][] initializeMatrix(List<Item> items, int backpackCapacity) {
        int[][] matrix = new int[items.size() + 1][backpackCapacity + 1];
        for (int i = 0; i <= items.size(); i++) {
            matrix[i][0] = 0;
        }
        for (int i = 0; i <= backpackCapacity; i++) {
            matrix[0][i] = 0;
        }
        return matrix;
    }

    private void setElement(int[][] matrix, int i, int j, List<Item> items) {
        matrix[i][j] = matrix[i - 1][j];
        if (j - items.get(i - 1).getWeight() >= 0) {
            matrix[i][j] = Math.max(matrix[i][j],
                    matrix[i - 1][j - items.get(i - 1).getWeight()] + items.get(i - 1).getCost());
        }
    }

    private void fillMatrix(int[][] matrix, int backpackCapacity, List<Item> items) {
        for (int i = 1; i <= items.size(); i++) {
            for (int j = 0; j <= backpackCapacity; j++) {
                setElement(matrix, i, j, items);
            }
        }
    }

    private void setBackpackLoad(Backpack backpack, List<Item> backpackItems) {
        int load = backpack.getLoad();
        for (Item item : backpackItems) {
            load+=item.getWeight();
        }
        backpack.setLoad(load);
    }

    public void loadBackpack(Backpack backpack, List<Item> items) {
        if (items != null && !items.isEmpty() && backpack != null && backpack.getCapacity() > 0) {
            int backpackCapacity = backpack.getCapacity();
            int[][] matrix = initializeMatrix(items, backpackCapacity);
            fillMatrix(matrix, backpackCapacity, items);
            if (matrix[0].length == 0) {
                return;
            }
            List<Item> backpackItems = backpack.getItems();
            putItems(matrix, matrix.length - 1, matrix[0].length - 1, items, backpackItems);
            setBackpackLoad(backpack, backpackItems);
        }
    }

}
