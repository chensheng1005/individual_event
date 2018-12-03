package com.cs.dao;

import com.cs.entity.ClothesInformation;

import java.util.List;

public interface ClothesInformationMapper {
    List<ClothesInformation> selectAll();
}
