package com.edu.orderdish.repository;

import com.edu.orderdish.domain.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    @Query(value = "select * from orders where email=?1 and status='DRAFT'",nativeQuery = true)
    List<Order> getOrderByEmail(String email);

    @Query(value = "select * from orders where email=?1 ",nativeQuery = true)
    List<Order> getOrderListByEmail(String email);
}
