package com.edu.orderdish.repository;

import com.edu.orderdish.domain.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail,Long> {
}
