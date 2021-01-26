package vtb.baranovdv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ozon implements Basket {

    private Map<String, Integer> products;

    public Ozon() {
        this.products = new HashMap<>();
    }

    @Override
    public void addProduct(String name, int quantity) {
        if (products.containsKey(name))
            products.put(name, quantity + products.get(name));
        else
            products.put(name, quantity);
    }

    @Override
    public void removeProduct(String name) {
        products.remove(name);
    }

    @Override
    public String getProductName(String name) {
        return name;
    }

    @Override
    public void updateProductQuantity(String name, int quantity) {
        products.put(name, quantity);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        if (products.isEmpty())
            return null;
        return new ArrayList<String>(products.keySet());
    }

    @Override
    public int getProductQuantity(String name) {
        if (products.isEmpty())
            return 0;
        return products.get(name);

    }

}


