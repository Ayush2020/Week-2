class Order{
    String orderId;
    String orderDate;

    //Constructor
    public Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    //Method

    public String getOrderStatus(){
        return "Order Placed on:: " + orderDate;
    }
}


class ShippedOrder extends Order{
    int trackingNumber;

    public ShippedOrder(String orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus(){
        super.getOrderStatus();
        return "Order tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderStatus(){
        super.getOrderStatus();
        return "Delivery Date : " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement{
    public static void main(String[] args) {
        Order order = new Order("ORDER12343", "18 MArch");
        ShippedOrder shipped = new ShippedOrder("ORDER1245", "19 March", 12343232);
        DeliveredOrder delivery = new DeliveredOrder("ORDER1256", "20 MArch", 12787346, "25 MArch" );

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivery.getOrderStatus());
    }
}