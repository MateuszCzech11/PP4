package pl.jkanclerz.sales;

import java.util.Optional;

public class AlwaysMissingProductDetailsProvider implements ProductDetailsProvider {
    public Optional<Product> load(String productId) {
        return new Optional.empty();
    }
}
