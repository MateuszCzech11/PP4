package pl.jkanclerz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.jkanclerz.productcatalog.HashMapProductStorage;
import pl.jkanclerz.productcatalog.Product;
import pl.jkanclerz.productcatalog.ProductCatalog;
import pl.jkanclerz.productcatalog.ProductStorage;
import pl.jkanclerz.sales.CartStorage;
import pl.jkanclerz.sales.Sales;
import pl.jkanclerz.sales.product.ProductDetails;
import pl.jkanclerz.sales.product.ProductDetailsProvider;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Bean
    ProductCatalog createMyProductCatalog(){
        ProductCatalog productCatalog = new ProductCatalog(new HashMapProductStorage());
        String product1 = productCatalog.addProduct("my ebook","niceone");
        productCatalog.changePrice(product1, BigDecimal.valueOf(10.10));
        productCatalog.assignImage(product1,"foo/niecei/image.jpg");
        productCatalog.publishProduct(product1);

        String product2 = productCatalog.addProduct("EBOOK2","niceone!!!");
        productCatalog.changePrice(product2, BigDecimal.valueOf(13.10));
        productCatalog.assignImage(product2,"foo/niec/dsdei/image.jpg");
        productCatalog.publishProduct(product2);
        return productCatalog;
    }

  @Bean
  Sales createSalesViaLambda(ProductCatalog catalog){
      return new Sales(
              new CartStorage(),
              (String productId)->{
                  Product product = loadById(productId);
                  if (product == null) {
                      return Optional.empty();
                  }
                  return Optional.of(new ProductDetails(
                          product.getId(),
                          product.getName(),
                          product.getPrice()
                  ));
              });
  }


}