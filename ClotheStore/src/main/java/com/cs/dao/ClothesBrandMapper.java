package com.cs.dao;

import com.cs.entity.ClothesBrand;
import java.util.List;

public interface ClothesBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(ClothesBrand record);

    ClothesBrand selectByPrimaryKey(Integer brandId);

    List<ClothesBrand> selectAll();

    int updateByPrimaryKey(ClothesBrand record);
}