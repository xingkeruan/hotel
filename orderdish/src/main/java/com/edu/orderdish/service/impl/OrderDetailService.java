package com.edu.orderdish.service.impl;

import com.edu.orderdish.domain.OrderDetail;
import com.edu.orderdish.repository.OrderDetailRepository;
import com.edu.orderdish.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public int dishSetCount(long orderDetailId, int count) {
        OrderDetail orderDetail = orderDetailRepository.findById(orderDetailId).get();
        orderDetail.setCount(count);
        orderDetailRepository.save(orderDetail);
        return orderDetail.getCount();
    }

    @Override
    public OrderDetail addOrderDetail(OrderDetail orderDetail) {

        return orderDetailRepository.save(orderDetail);
    }
}
