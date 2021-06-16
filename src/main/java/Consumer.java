import java.util.Set;

/**
 * Класс, который складывает товары в ячейки.
 */
public class Consumer implements Runnable {
    // склад
    private final Warehouse warehouse;
    // интервал
    private int millis = 1;

    public Consumer(Warehouse warehouse, int millis) {
        this.warehouse = warehouse;
        this.millis = millis;
    }

    @Override
    public void run() {
        // стартовая ячейка
        Cell cell = Cell.A;

        while (true) {

            // получаем список продуктов из ячейки
            Set<Product> products = warehouse.get(cell);

            System.out.println(products);

            // следующая ячейка
            cell = cell.next();

            // поспали
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
