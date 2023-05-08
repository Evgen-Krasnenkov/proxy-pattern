package org.kras.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StoreProxyTest {

    @Test
    void givenStoreWithNullInventory_whenPrintInventory_thenLoadInventory() {
        StoreProxy proxy = new StoreProxy("Healthy Wholefoods", "Los Angeles");
        Assertions.assertNull(proxy.getStore());
        proxy.printName();
        proxy.printLocation();
        Assertions.assertNull(proxy.getStore());
        proxy.printInventory();
        Assertions.assertEquals(Store.class, proxy.getStore().getClass());
        proxy.printInventory();
    }

}