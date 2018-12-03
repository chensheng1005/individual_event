package com.cs.dao;

import com.cs.entity.ClothesPhoto;
import java.util.List;

public interface ClothesPhotoMapper {
    int deleteByPrimaryKey(Integer photoId);

    int insert(ClothesPhoto record);

    ClothesPhoto selectByPrimaryKey(Integer photoId);

    List<ClothesPhoto> selectAll();

    int updateByPrimaryKey(ClothesPhoto record);
}