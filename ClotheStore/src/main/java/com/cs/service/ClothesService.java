package com.cs.service;

import com.cs.dao.ClothesMapper;
import com.cs.entity.Clothes;
import com.cs.service.impl.ClothesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClothesService implements ClothesImpl {
    @Autowired
    private ClothesMapper clothesMapper;

    @Override
    public int deleteByPrimaryKey(Integer clothesId) {
        return 0;
    }

    @Override
    public int insert(Clothes record) {
        return 0;
    }

    @Override
    public Clothes selectByPrimaryKey(Integer clothesId) {
        return null;
    }

    @Override
    public List<Clothes> selectAll() {
        return null;
    }

    @Override
    public List<Clothes> selectAllPrimaryKey(Integer clothesId) {
        return clothesMapper.selectAllPrimaryKey(clothesId);
    }

    @Override
    public int updateByPrimaryKey(Clothes record) {
        return 0;
    }
}
