import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Продукт.
 */
public class Product {

    // логгер
    private static Logger log = LoggerFactory.getLogger(Product.class);

    /**
     * счетчик идентификатора продукта
     */
    private static int counter = 0;

    /**
     * идентификатор продукта
     */
    private int id;

    /**
     * закрыты конструктор чтобы можно было генерировать продукт фабрикой
     * @param id идентификатор продукта
     */
    private Product(int id) {
        this.id = id;
    }

    /**
     * геттер
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * статический метод-фабрика генерации нового продукта
     * @return новый продукт
     */
    public static Product create() {
        Product product = new Product(++counter);
        log.info("Создан новый продукт {}", product);
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
