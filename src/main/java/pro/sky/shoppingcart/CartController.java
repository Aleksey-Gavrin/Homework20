package pro.sky.shoppingcart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class CartController {
    CartService service;
    public CartController(CartService service) {
        this.service = service;
    }
    @GetMapping
    public String welcomeUser(){
        return "Добро пожаловать в интернет-магазин!<br>Для добавления в корзину товаров перечислите их номера через" +
                " запятую в параметре list метода (/add)<br>Список доступных товаров:<br>" +
                "1 - книга<br>2 - конструктор<br>3 - фигурка<br>4 - комикс<br>5 - игра<br>" +
                "Для отображения выбранных товаров используйте метод (/get) без параметров.";
    }
    @GetMapping(path = "/add")
    public String addProducts(@RequestParam ("list") List<Integer> list){
        service.addProductsToCart(list);
        return "Выбранные товары добавлены в корзину";
    }
    @GetMapping(path = "/get")
    public String getProducts() {
        if(!service.cart.productsList.isEmpty()) {
            return service.cart.productsList.toString();
        }
     return "Корзина пуста.";
    }
}
