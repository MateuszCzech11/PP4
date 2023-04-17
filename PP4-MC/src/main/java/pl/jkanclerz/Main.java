package pl.jkanclerz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.jkanclerz.productcatalog.HashMapProductStorage;
import pl.jkanclerz.productcatalog.Product;
import pl.jkanclerz.productcatalog.ProductCatalog;
import pl.jkanclerz.productcatalog.ProductStorage;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Bean
    ProductCatalog createMyProductCatalog(){
        return new ProductCatalog(new HashMapProductStorage());
    }
}
