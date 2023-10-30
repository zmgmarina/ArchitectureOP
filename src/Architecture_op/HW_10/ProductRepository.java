package Architecture_op.HW_10;

import java.util.List;

/**
 * Репозиторий служит хранилищем для продуктов и использует DAO для доступа к данным.
 */
public class ProductRepository implements Repository{

    private ProductDao productDao;

    public ProductRepository(ProductDao productDao) {
        this.productDao = productDao;
    }

    /**
     * @apiNote  Метод добавления продукта с проверкой на корректность введенных данных
      */

    @Override
    public void addProduct(Product product) throws IllegalArgumentException{
        if(product.getName().length() < 4 || product.getPrice() <= 0){
            throw new IllegalArgumentException("Incorrect value entered");
        }
        productDao.add(product);

    }

    /**
     * @apiNote Метод получения всех продуктов из списка
     * return product
      */

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }


    /**
     * @apiNote Метод поиска продукта по ID
     * @param id
     * @return product
     */
    public Product findById(int id) {
        return productDao.findById(id);
    }

    /**
     * @apiNote  Метод удаления продукта
     */
    public void delete(int id) {
        productDao.delete(id);
    }



}
