package com.senlainc.denisikvadim.training.task6.entity;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private int[][] matrix;
    private int capacity;
    private int load = 0;
    private List<Item> items = new ArrayList<>();

    public Backpack(int capacity) {
        this.capacity = capacity;
    }

    private void findAns(int row, int column, List<Item> items) {
        if (items == null || items.isEmpty() || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        if (matrix[row][column] == 0) {
            return;
        }
        if (matrix[row - 1][column] == matrix[row][column]) {
            findAns(row - 1, column, items);
        } else {
            findAns(row - 1, column - items.get(row - 1).getWeight(), items);
            this.items.add(items.get(row - 1));
        }

    }

    public void loadBackpack(List<Item> items) {
        if (items != null && !items.isEmpty() && capacity > 0) {
            matrix = new int[items.size() + 1][capacity + 1];
            for (int i = 0; i <= items.size(); i++) {
                matrix[i][0] = 0;
            }
            for (int i = 0; i <= capacity; i++) {
                matrix[0][i] = 0;
            }
            for (int i = 1; i <= items.size(); i++) {
                for (int j = 0; j <= capacity; j++) {
                    matrix[i][j] = matrix[i - 1][j];
                    if (j - items.get(i - 1).getWeight() >= 0) {
                        matrix[i][j] = Math.max(matrix[i][j], matrix[i - 1][j - items.get(i - 1).getWeight()] + items.get(i - 1).getCost());
                    }
                }
            }
            if (matrix.length > 0 && matrix[0].length > 0) {
                findAns(matrix.length - 1, matrix[0].length - 1, items);
                for (Item item : this.items) {
                    load += item.getWeight();
                }
            }
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
