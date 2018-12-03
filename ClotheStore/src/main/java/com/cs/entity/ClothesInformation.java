package com.cs.entity;

import java.math.BigDecimal;

public class ClothesInformation {
    private Integer clothesId;

    private String clothesDescribe;

    private BigDecimal clothesPrice;

    private String clothesImg;

    private String brandName;

    private String tagName;

    private Integer clothesCount;

    public Integer getClothesId() {
        return clothesId;
    }

    public void setClothesId(Integer clothesId) {
        this.clothesId = clothesId;
    }

    public String getClothesDescribe() {
        return clothesDescribe;
    }

    public void setClothesDescribe(String clothesDescribe) {
        this.clothesDescribe = clothesDescribe;
    }

    public BigDecimal getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(BigDecimal clothesPrice) {
        this.clothesPrice = clothesPrice;
    }


    public String getClothesImg() {
        return clothesImg;
    }

    public void setClothesImg(String clothesImg) {
        this.clothesImg = clothesImg;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getClothesCount() {
        return clothesCount;
    }

    public void setClothesCount(Integer clothesCount) {
        this.clothesCount = clothesCount;
    }
}
