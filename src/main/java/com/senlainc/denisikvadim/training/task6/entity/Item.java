package com.senlainc.denisikvadim.training.task6.entity;

public class Item {

    private int weight;
    private int cost;

    public Item(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
