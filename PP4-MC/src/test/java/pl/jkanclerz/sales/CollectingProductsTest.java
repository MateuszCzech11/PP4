package pl.jkanclerz.sales;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollectingProductsTest {
    @Test
    void itAllowsToAddProductToCart(){
        //arrange
        Sales sales=thereIsSalesModule();
        String customerId=thereIsCustomer("Kuba");
        String productId=thereIsProduct();
        //act
        sales.addToCart(customerId,productId);

        //assert
        assertCustomerCartContainsNProducts(customerId,1);

    }
    @BeforeEach
    void setup(){

    }

    private void assertCustomerCartContainsNProducts(String customerId,int productsCount){

    }
}
