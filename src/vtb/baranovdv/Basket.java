package vtb.baranovdv;

import java.util.List;

public interface Basket {

    void addProduct(String name, int quantity);

    void removeProduct(String name);

    void updateProductQuantity(String name, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String name);

    String getProductName(String name);
}
