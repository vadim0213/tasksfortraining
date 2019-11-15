package com.senlainc.denisikvadim.training.task6.entity;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private int capacity;
    private int load = 0;
    private List<Item> items = new ArrayList<>();

    public Backpack(int capacity) {
        this.capacity = capacity;
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

}