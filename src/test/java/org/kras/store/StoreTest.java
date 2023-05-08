package org.kras.store;

import org.junit.jupiter.api.Test;

class StoreTest {

    @Test
    void givenProxyInventory_whenPrintInventory_thenInventoryImpl() {
        Store store = new Store("Healthy Wholefoods", "Los Angeles", new InventoryProxy());
        store.printLocation();
        store.printName();
        store.printInventory();
    }

}