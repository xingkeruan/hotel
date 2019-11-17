package com.edu.foodordering.dto;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    long id;
    String email;
    List<OrderDetail> orderDetailList;
    String status;
}
