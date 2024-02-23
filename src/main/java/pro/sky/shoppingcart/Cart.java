package pro.sky.shoppingcart;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Cart {
   private final List<String> productsList;
   public Cart() {
      this.productsList = new ArrayList<>();
   }
   public List<String> getProductsList() {
      return productsList;
   }
   @PostConstruct
   public void showInfo() {
      System.out.println("корзина создана");
   }
}