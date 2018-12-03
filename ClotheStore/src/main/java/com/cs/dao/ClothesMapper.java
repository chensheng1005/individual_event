package com.cs.dao;

import com.cs.entity.Clothes;
import java.util.List;

public interface ClothesMapper {
    int deleteByPrimaryKey(Integer clothesId);

    int insert(Clothes record);

    Clothes selectByPrimaryKey(Integer clothesId);

    List<Clothes> selectAll();

    List<Clothes> selectAllPrimaryKey(Integer clothesId);

    int updateByPrimaryKey(Clothes record);
}