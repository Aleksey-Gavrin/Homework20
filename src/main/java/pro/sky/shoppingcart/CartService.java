package pro.sky.shoppingcart;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@SessionScope
@Service
public class CartService {

    public List<String> cart;
    public CartService() {
        this.cart = new ArrayList<>();
    }
    public void addProductsToCart(List<Integer> numbers) {
        for (Integer num: numbers) {
            if (Products.getProductsMap().containsKey(num)) {
                cart.add(Products.getProductsMap().get(num));
            }
        }
    }
    public List<String> getCart(){
        return Collections.unmodifiableList(cart);
    }

}
