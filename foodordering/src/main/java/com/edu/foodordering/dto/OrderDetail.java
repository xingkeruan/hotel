package com.edu.foodordering.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class OrderDetail {

    long id;
    long dishid;
    int count;

    public OrderDetail(long dishid, int count) {
        this.dishid = dishid;
        this.count = count;
    }

    public OrderDetail() {
    }
}
