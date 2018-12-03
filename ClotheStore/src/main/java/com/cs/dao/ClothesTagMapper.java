package com.cs.dao;

import com.cs.entity.ClothesTag;
import java.util.List;

public interface ClothesTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(ClothesTag record);

    ClothesTag selectByPrimaryKey(Integer tagId);

    List<ClothesTag> selectAll();

    int updateByPrimaryKey(ClothesTag record);
}