import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Склад.
 */
public class Warehouse {

    // логгер
    Logger log = LoggerFactory.getLogger(Warehouse.class);

    // Переменная для хранения продуктов по ячейкам
    private Map<Cell, Set<Product>> productByCells = new EnumMap<>(Cell.class);

    // Инициализация склада, где ячейка используется как ключ в мапе
    public Warehouse() {
        for(Cell cell: Cell.values()) {
            productByCells.put(cell, new HashSet<>());
        }
    }

    /**
     * Положить товар в ячейку
     * @param cell      ячейка
     * @param product   товар
     */
    public void put(Cell cell, Product product) {
        synchronized (cell){
            productByCells.get(cell).add(product);
            log.info("Положили товар {} в ячейку {}", product, cell);
        }
    }

    /**
     * Изъять все товары из ячейки
     * @param cell  ячейка
     * @return      множество товаров
     */
    public Set<Product> get(Cell cell) {
        synchronized (cell) {
            Set<Product> products = productByCells.get(cell);
            productByCells.put(cell, new HashSet<>());
            log.info("Возвращаем товары из ячейки {}: {}", cell, products);
            return products;
        }
    }

}
