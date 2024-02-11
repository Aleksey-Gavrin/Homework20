package pro.sky.shoppingcart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Cart {
   public List<String> productsList;
   public Cart() {productsList = new ArrayList<>();}
}
