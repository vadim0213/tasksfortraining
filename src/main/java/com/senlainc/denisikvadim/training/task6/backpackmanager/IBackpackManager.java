package com.senlainc.denisikvadim.training.task6.backpackmanager;

import com.senlainc.denisikvadim.training.task6.entity.Backpack;
import com.senlainc.denisikvadim.training.task6.entity.Item;

import java.util.List;


public interface IBackpackManager {

    void loadBackpack(Backpack backpack, List<Item> items);

}
