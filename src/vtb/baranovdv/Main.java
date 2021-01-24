package vtb.baranovdv;
//Реализовать класс корзины интернет магазина по следующему интерфейсу:
//
//interface Basket {
//    void addProduct(String product, int quantity);
//    void removeProduct(String product);
//    void updateProductQuantity(String product, int quantity);
//    void clear();
//    List<String> getProducts();
//    int getProductQuantity(String product);}

import java.util.Hashtable;
import java.util.List;

interface Basket {

    void addProduct(String name, int quantity);
    Integer removeProduct(String name);
    void updateProductQuantity(String name, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String name);
}

class InternetShop implements Basket {

    private String name;
    private int quantity;

    public InternetShop() {
        this.setName(name);
        this.setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " " + String.valueOf(quantity) + "\n";
    }

    @Override
    public List<String> getProducts() {
        return null;
        }

    @Override
    public int getProductQuantity(String name) {
        return 0;
    }

    public void addProduct(String name, int quantity) {
        }

    @Override
    public Integer removeProduct(String name) {
        return null;
    }

    public void updateProductQuantity(String name, int quantity) {
        }

    @Override
    public void clear() {

    }


    }


    /*
    Hashtable<String, Integer> ht1;

    public InternetShop() {

        ht1 = new Hashtable<>(5);
        ht1.put("soap", 8);
        ht1.put("brush", 4);
        ht1.put("toothpaste", 17);
        ht1.put("towel", 5);
    }

    public int getProductQuantity(String name) {
        return ht1.get(name);
    }

    public Integer removeProduct(String name) {
        return ht1.remove(name);
    }

    public void clear() {
        ht1.clear();
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    public void addProduct(String name, int quantity) {
    }

    public void updateProductQuantity(String name, int quantity) {
    }
}
*/
public class Main {

    public static void main (String args[]) {

        InternetShop ozon = new InternetShop();
        ozon.addProduct("Футболка", 3);
        ozon.addProduct("Шорты", 2);
        ozon.addProduct("Трусы", 5);
        ozon.addProduct("Носки", 12);
        ozon.removeProduct("Носки");
        ozon.setQuantity(5);

        System.out.println(ozon);



        /*
        Hashtable<String, Integer> ht1;

        ht1 = new Hashtable<>(5);
        ht1.put("soap", 8);
        ht1.put("brush", 4);
        ht1.put("toothpaste", 17);
        ht1.put("towel", 5);


        System.out.println("Get product quantity: " + ozon.getProductQuantity("soap"));
        System.out.println("Current basket: " + ozon.ht1);
        System.out.println("Remove product: " + ozon.removeProduct("soap"));
        System.out.println("Current basket without soap: " + ozon.ht1);
        ozon.ht1.put("comb", 1);
        System.out.println("Current basket with comb: " + ozon.ht1);
        System.out.println("Clear products ------- ");
        ozon.clear();
        System.out.println("Clear basket: " + ozon.ht1);
        */
    }
}