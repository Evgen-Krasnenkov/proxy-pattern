package org.kras.store;

public class StoreProxy extends Store{
    private String name;
    private String location;

    private Store store;

    public Store getStore() {
        return store;
    }


    public StoreProxy(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public void printLocation() {
        System.out.println(this.location);
    }

    @Override
    public void printInventory() {
        Inventory inventory = null;
        if (store == null) {
            inventory = new SuperstoreInventory();
            this.store = new Store(this.name, this.location, inventory);
            inventory.getInventory().forEach(System.out::println);
        } else {
            store.printInventory();
        }
    }
}
