package com.cs.dao;

import com.cs.entity.ClothesSize;
import java.util.List;

public interface ClothesSizeMapper {
    int deleteByPrimaryKey(Integer sizeId);

    int insert(ClothesSize record);

    ClothesSize selectByPrimaryKey(Integer sizeId);

    List<ClothesSize> selectAll();

    int updateByPrimaryKey(ClothesSize record);
}