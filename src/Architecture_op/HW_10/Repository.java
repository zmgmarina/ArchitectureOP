package Architecture_op.HW_10;

import java.util.List;
/**
 * Интерфейс для работы с данными
 */
public interface Repository {
    public void addProduct(Product product);
    public List<Product> getAllProducts();
    public Product findById(int id);
    public void delete(int id);


}
