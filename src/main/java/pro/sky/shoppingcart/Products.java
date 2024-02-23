package pro.sky.shoppingcart;

import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class Products {
    private final static Map<Integer, String> productsMap = Map.of(
            1, "книга",
            2, "конструктор",
            3, "фигурка",
            4, "комикс",
            5, "игра"
    );
    public static Map<Integer, String> getProductsMap() {
        return productsMap;
    }
}
