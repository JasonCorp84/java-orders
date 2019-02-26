package com.lambdaschool.orders.orders.repository;

import com.lambdaschool.orders.orders.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, Long> {

}
