package Exception.HW3;


//    Условия для ДЗ:
//    __
//    Создайте иерархию классов для интернет-магазина, как в примере.
//    Реализуйте методы для обработки покупок и доступа к данным о продуктах.
//    Добавьте исключения на каждый уровень абстракции для обработки возможных ошибок, например, если товар не найден.****
//    Дополнительно, вы можете добавить дополнительные уровни абстракции, такие как уровень оплаты и доставки, и реализовать обработку исключений и на этих уровнях.

import java.util.Scanner;

class OnlineShopUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter street: ");
        String street = scanner.next();
        System.out.print("Enter house number: ");
        int house = scanner.nextInt();
        System.out.print("Enter apartment number: ");
        int apartment = scanner.nextInt();


        try {
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
        }catch (FoundNotException | QuantityAvailableException e){
            System.out.println(e.getMessage());
        }


        DeliveryAddress address = new DeliveryAddress(street, house, apartment);
        try {
            address.chackedInputAddress(address.getStreet(), address.getHouse(),address.getApartment());
        }catch (IllegalDataEntryException e){
            System.out.println(e.getMessage());
        }

    }
}


