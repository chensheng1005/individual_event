package com.cs.dao;

import com.cs.entity.ShopCart;
import java.util.List;

public interface ShopCartMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(ShopCart record);

    ShopCart selectByPrimaryKey(Integer shopId);

    List<ShopCart> selectAll();

    int updateByPrimaryKey(ShopCart record);
}