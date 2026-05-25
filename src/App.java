
public class App {

    public static void main(String[] args) {

        Product product1 = new Product();

        product1.setId(1);
        product1.setName("Tablet");
        product1.setPrice(999.99);
        product1.setStock(10);

        Product product2 = new Product(2, "Smartphone", 499.99, 20);

        product1.setPrice(1800);
        product2.setStock(18);

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());

        System.out.println(product2.getName());
        System.out.println(product2.getStock());

        System.out.println(product1);
        System.out.println(product2);
    }
}
