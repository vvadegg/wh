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

    }

}
