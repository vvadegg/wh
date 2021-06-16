/**
 * Продукт.
 */
public class Product {
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
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
