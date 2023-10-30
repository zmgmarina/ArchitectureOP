package Architecture_op.HW_10;

import java.util.ArrayList;
import java.util.List;


/**
 * Класс, реализуют паттерн DAO, содержит в себе коллекцию данных (список продуктов)
 * со своими методами, позволяющими работать с этими данными.
 */
public class InMemoryProductDao implements ProductDao{
    private List<Product> products = new ArrayList<>();
    private int nextId = 1;


    /**
     * @apiNote Нахождение продукта в списке по id
     * @param id
     * @return product
     */
    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    /**
     * @apiNote Получение всех элементов списка
     * @return products
     */
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    /**
     * @apiNote Добавление продуктов в список
     * @param product
     */
    @Override
    public void add(Product product) {
        product.setId(nextId++);
        products.add(product);
    }

    /**
     * Замена продукта в списке по id
     * @param product
     */
    @Override
    public void replace(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                return;
            }
        }
    }

    /**
     * Удаление продукта
     * @param id
     */
    @Override
    public void delete(int id) {
        products.removeIf(product -> product.getId() == id);
    }


}
