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

    public class Main {

    public static void main (String args[]) {

    Ozon ozon = new Ozon();
    ozon.addProduct("Трусы", 12);
    ozon.addProduct("Майка", 4);
    System.out.println(ozon.getProductName("Трусы") + " - " + ozon.getProductQuantity("Трусы") + " шт.");
    ozon.updateProductQuantity("Трусы", 9);
    System.out.println(ozon.getProductName("Трусы") + " - " + ozon.getProductQuantity("Трусы") + " шт.");
    ozon.addProduct("Носки", 5);
    System.out.println("Ваша корзина: " + ozon.getProducts());
    ozon.removeProduct("Трусы");
    System.out.println("Ваша корзина: " + ozon.getProducts());
    ozon.clear();
    System.out.println(ozon);

    }
}