package org.kras.store;

import java.util.List;

public class InventoryProxy implements Inventory {
    private List<Item> inventory;

    @Override
    public List<Item> getInventory() {
        if (null == inventory) {
            this.inventory = new SuperstoreInventory().getInventory();
        }
        return inventory;
    }
}
