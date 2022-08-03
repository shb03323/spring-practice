package practice.spring_practice.order;

public interface OrderService {
    Order createOrder(Long membnerId, String itemName, int itemPrice);
}
