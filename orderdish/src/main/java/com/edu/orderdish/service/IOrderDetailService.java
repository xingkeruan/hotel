package com.edu.orderdish.service;

import com.edu.orderdish.domain.OrderDetail;

public interface IOrderDetailService {
    public int dishSetCount(long orderDetailId, int count);
    public OrderDetail addOrderDetail(OrderDetail orderDetail);

}
