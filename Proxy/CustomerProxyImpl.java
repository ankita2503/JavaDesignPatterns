package Proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{
    private int id;
    private List<Order> orders;

    public CustomerProxyImpl() {
        this.id = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> list = new ArrayList<>();
        Order order = new Order();
        order.setId(1);
        order.setQuantity(1);
        order.setProductName("Macbook");
        list.add(order);
        return list;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
