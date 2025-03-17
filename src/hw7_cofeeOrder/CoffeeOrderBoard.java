package hw7_cofeeOrder;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {

    private final Queue<Order> orders;
    private int orderCounter;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void addOrder(Order order) {
        order.setOrderNumber(orderCounter + 1);
        orders.offer(order);
        orderCounter++;

    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("Coffee Order Board: " + orders.size() + '\n' + "==============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " " + order.getCustomerName());
        }
    }
}
