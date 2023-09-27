package Architecture_op.HW_2.builder;


public class OrderBuilder {
    private DeliveryOrder order;

    public OrderBuilder(){
        order = new DeliveryOrder();
    }

    public OrderBuilder setClientName(String clientName) {
        order.setClientName(clientName);
        return this;
    }
    public OrderBuilder setPhone(String phone) {
        order.setPhone(phone);
        return this;
    }

    public OrderBuilder setDate(String date) {
        order.setDate(date);
        return this;
    }

    public OrderBuilder setQuantity(int quantity) {
       order.setQuantity(quantity);
       return  this;
    }

    public OrderBuilder setPrice(int price) {
        order.setPrice(price);
        return this;
    }

    public DeliveryOrder build(){
        return order;
    }





}
