package com.cs.dao;

import com.cs.entity.ClothesPhotoSizeRelation;
import java.util.List;

public interface ClothesPhotoSizeRelationMapper {
    int deleteByPrimaryKey(Integer relationId);

    int insert(ClothesPhotoSizeRelation record);

    ClothesPhotoSizeRelation selectByPrimaryKey(Integer relationId);

    List<ClothesPhotoSizeRelation> selectAll();

    int updateByPrimaryKey(ClothesPhotoSizeRelation record);
}