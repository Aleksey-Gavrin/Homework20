package pro.sky.shoppingcart;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final Cart cart;
    public CartService(Cart cart) {
        this.cart = cart;
    }
    public Cart getCart() {
        return cart;
    }
    public void addProductsToCart(List<Integer> numbers) {
        for (Integer num: numbers) {
            if (Products.getProductsMap().containsKey(num)) {
                cart.getProductsList().add(Products.getProductsMap().get(num));
            }
        }
    }
    @PostConstruct
    public void showInfo() {
        System.out.println("сервис создан");
    }
}
