import java.util.Map;
import java.util.Set;

/**
 * Главный класс
 */
public class Main {


    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Producer producer = new Producer(warehouse, 1000);

        Consumer consumer = new Consumer(warehouse, 10000);

        new Thread(producer).start();
        new Thread(consumer).start();

//        Product product1 = Product.create();
//        Product product2 = Product.create();
//        Product product3 = Product.create();
//        Product product4 = Product.create();
//        Product product5 = Product.create();
//        Product product6 = Product.create();
//
//        warehouse.put(Cell.A, product1); //A
//        warehouse.put(Cell.B, product2); //B
//        warehouse.put(Cell.C, product3); //C
//        warehouse.put(Cell.A, product4); //A
//        warehouse.put(Cell.B, product5); //B
//
//        Set<Product> products = warehouse.get(Cell.A);
//        System.out.println(products); // [1, 4]
//
//        warehouse.put(Cell.C, product6); // C
//
//        Set<Product> products2 = warehouse.get(Cell.A);
//        System.out.println(products2); // []
//
//        Set<Product> products3 = warehouse.get(Cell.A);
//        System.out.println(products3); // []
//
//        Set<Product> products4 = warehouse.get(Cell.B);
//        System.out.println(products4); // [2,5]
//
//        Set<Product> products5 = warehouse.get(Cell.C);
//        System.out.println(products5); // [3,6]
//
//        Set<Product> products6 = warehouse.get(Cell.B);
//        System.out.println(products6); // []

    }


}
