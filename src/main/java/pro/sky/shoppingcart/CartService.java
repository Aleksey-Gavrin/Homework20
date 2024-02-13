package pro.sky.shoppingcart;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {

    public Cart cart;
    public CartService(Cart cart) {
        this.cart = cart;
    }
    public void addProductsToCart(List<Integer> numbers) {
        for (Integer num: numbers) {
            if (Products.getProductsMap().containsKey(num)) {
                cart.productsList.add(Products.getProductsMap().get(num));
            }
        }
    }
}
