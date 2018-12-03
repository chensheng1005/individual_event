package com.cs.dao;

import com.cs.entity.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    Order selectByPrimaryKey(String orderId);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}