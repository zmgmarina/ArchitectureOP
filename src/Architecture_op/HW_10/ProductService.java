package Architecture_op.HW_10;

import java.util.List;

/**
 * // Сервис-слой использует интерфейс репозитория, который абстрагирует доступ к данным,
 * содержит методы получения и добавления продуктов с проверкой на корректность данных
 */
public class ProductService {
    private Repository productRepository;

    public ProductService(Repository productRepository) {
        this.productRepository = productRepository;
    }


    public void addProductWithLogic(Product product) {
        if (product.getName() != null && product.getPrice() > 100) {
            productRepository.addProduct(product);
        }
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }



}


