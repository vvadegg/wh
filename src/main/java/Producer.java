
/**
 * Класс, который складывает товары в ячейки.
 */
public class Producer implements Runnable{
    // склад
    private final Warehouse warehouse;
    // интервал
    private int millis = 1000;

    public Producer(Warehouse warehouse, int millis) {
        this.warehouse = warehouse;
        this.millis = millis;
    }

    @Override
    public void run() {
        // стартовая ячейка
        Cell cell = Cell.A;

        while (true) {

            // создали новый продукт
            Product product = Product.create();

            // положили продукт в ячейку склада
            warehouse.put(cell, product);

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
