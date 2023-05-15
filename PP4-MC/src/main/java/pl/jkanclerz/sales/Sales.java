package pl.jkanclerz.sales;

import java.util.Optional;
import java.util.ServiceLoader;

public class Sales {

    public Sales(){

    }

    private CartStorage cartStorage;

    private productDetailsProvider productDetailsProvider;

    public void addToCart(String customerId, String productId){
        Cart cart = loadForCustomer(customerId)
                .orElse(Cart.empty());

        Product product =loadDetailsForProduct(productId)
                .orElseThrow(()->new NoSuchProductException());
    }

    private Optional<Product> loadDetailsForProduct(String productId) {
        //return productDetailsProvider.load(productId);
        return null;
    }

    private Optional<Cart> loadForCustomer(String customerId) {
        //return cartStorage.load(customerId);
        return null;

    }

    public String thereIsCustomer(String customerId){
        return customerId;
    }

    private Sales thereIsSalesModule(){
        return new Sales();
    }

    public void getCurrentOffer() {
    }
}
