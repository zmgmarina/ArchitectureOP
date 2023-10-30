package Architecture_op.HW_10;

import java.util.ArrayList;
import java.util.List;

/**
 * В этом классе
 */
public class UnitOfWork {


    private List<Product> products = new ArrayList<>();
    private List<Product> newProducts = new ArrayList<>();
    private List<Product> deletedProducts = new ArrayList<>();


    public void addNewProduct(Product product) {
        newProducts.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
        deletedProducts.add(product);
    }

    public void printAllProducts() {
        System.out.println(new ArrayList<>(products));
    }

    public void commit() {
        products.addAll(newProducts);
        products.removeAll(deletedProducts);
        newProducts.clear();
        deletedProducts.clear();
    }


}
