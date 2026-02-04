package com.example.order_management.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.order_management.entity.Order;
import com.example.order_management.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order createOrder(Order order) {
        return repository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public Order updateOrder(Long id, Order order) {

        Order existing = getOrderById(id);

        existing.setProductName(order.getProductName());
        existing.setQuantity(order.getQuantity());
        existing.setPrice(order.getPrice());

        return repository.save(existing);
    }

    @Override
    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}
