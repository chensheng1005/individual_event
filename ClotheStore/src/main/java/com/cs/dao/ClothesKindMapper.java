package com.cs.dao;

import com.cs.entity.ClothesKind;
import java.util.List;

public interface ClothesKindMapper {
    int deleteByPrimaryKey(Integer kindId);

    int insert(ClothesKind record);

    ClothesKind selectByPrimaryKey(Integer kindId);

    List<ClothesKind> selectAll();

    int updateByPrimaryKey(ClothesKind record);
}