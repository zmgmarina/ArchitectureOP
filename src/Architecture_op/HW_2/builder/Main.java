package Architecture_op.HW_2.builder;

public class Main {
    public static void main(String[] args) {
        DeliveryOrder order = new OrderBuilder()
                .setClientName("Олег")
                .setDate("10 января")
                .setPhone("895231233")
                .build();


        System.out.println(order.getClientName());
        System.out.println(order.getDate());
        System.out.println(order.getPhone());

    }


}
