package Exception.HW3;

import Exception.seminar3.Example2.OrderException;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws FoundNotException, QuantityAvailableException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null){
            throw new FoundNotException("Product not found.");
        }
        if (quantity > product.getAvailableQuantity()) {
            throw new QuantityAvailableException("Not enough quantity available.");
        }
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}
