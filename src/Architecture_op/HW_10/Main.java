package Architecture_op.HW_10;

import java.util.List;

public class Main {
    public static void main(String[] args) {

         /**
         * Создаем экземпляр класса ProductDao, UserRepository, передаем в него ProductDao и используем его
         * для выполнения всех операций с коллекцией данных (добавляем, удаляем, обновляем)
         * Создаем ProductService, используем в его конструкторе ProductRepository. ProductService
         * позволяет проверить в ходе выполнения процедур заданные правила.
         */

        ProductDao productDAO = new InMemoryProductDao();
        Repository productRepository = new ProductRepository(productDAO);
        ProductService productService = new ProductService(productRepository);


        Product product1 = new Product(1, "Телефон", 25000);
        Product product2 = new Product(2, "Микрофон", 2000);
        Product product3 = new Product(3, "Ми", 1000);

        productService.addProductWithLogic(product1);
        productService.addProductWithLogic(product2);
        //productService.addProductWithLogic(product3); //здесь получаем ошибку при введении неверного формата данных

        System.out.println(productService.getAllProducts());


        /**
         * Создаем экземпляр класса UnitOfWork, который реализует группу операция в одном методе(транзакция)
         */
        UnitOfWork unitOfWork = new UnitOfWork();

        unitOfWork.addNewProduct(product1);
        unitOfWork.addNewProduct(product2);
        unitOfWork.addNewProduct(product3);

        unitOfWork.printAllProducts();
        unitOfWork.commit();
        unitOfWork.printAllProducts();






    }
}
