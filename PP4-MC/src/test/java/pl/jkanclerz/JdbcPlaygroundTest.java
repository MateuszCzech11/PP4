package pl.jkanclerz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.jkanclerz.productcatalog.Product;

import java.util.UUID;

@SpringBootTest
public class JdbcPlaygroundTest {

    @Autowired
    JdbcTemplate db;

    @BeforeEach
    void setup(){
        db.execute("drop table 'products' if exists");
        db.execute("Create table 'products'(" +
                "'id' varchar(100)," +
                "'name' VARCHAR(100)," +
                "Primary key(id)"+
                ")");
    }

    @Test
    void testIt(){
        String result = db.queryForObject(
                "select 'Hellowordl'",
                String.class);
        assert result.equals("Hellowordl");
    }



    @Test
    void select(){
        Product product = new Product(UUID.randomUUID(),"Lego","Nice one");
        db.update("insert into 'products' ('id','name','desc') values (?,?,?)",
                product.getId(),
                product.getName(),
                product.getDesc()
                );
        int productsCount = db.queryForObject("select count(*) from products", Integer.class);
        assert productsCount==1;
    }
}
