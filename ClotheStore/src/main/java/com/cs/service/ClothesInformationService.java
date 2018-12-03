package com.cs.service;

import com.cs.dao.ClothesInformationMapper;
import com.cs.entity.ClothesInformation;
import com.cs.service.impl.ClothesInformationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesInformationService implements ClothesInformationImpl {
    @Autowired
    private ClothesInformationMapper clothesInformationMapper;


    @Override
    public List<ClothesInformation> selectAll() {
        return clothesInformationMapper.selectAll();
    }
}
