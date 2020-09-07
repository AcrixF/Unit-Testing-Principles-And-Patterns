package ch02;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {

    @Test
    public void purchase_succeeds_when_enough_inventory() {
        Store store = new Store();
        store.addInventory(Product.Shampoo, 10);
        Customer customer = new Customer();

        boolean success = customer.purchase(store, Product.Shampoo, 5);

        assertTrue(success);
        assertThat(store.getInventory(Product.Shampoo), equalTo(5));

    }

}
