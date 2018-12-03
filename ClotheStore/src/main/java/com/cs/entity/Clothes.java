package com.cs.entity;

import java.math.BigDecimal;
import java.util.List;

public class Clothes {
    private Integer clothesId;

    private String clothesDescribe;

    private BigDecimal clothesPrice;

    private String clothesImg;

    private Integer brandId;

    private Integer tagId;

    private List<ClothesBrand> clothesBrand;

    private List<ClothesSize> clothesSize;

    private List<ClothesPhoto> clothesPhoto;

    public List<ClothesBrand> getClothesBrand() {
        return clothesBrand;
    }

    public void setClothesBrand(List<ClothesBrand> clothesBrand) {
        this.clothesBrand = clothesBrand;
    }

    public List<ClothesSize> getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(List<ClothesSize> clothesSize) {
        this.clothesSize = clothesSize;
    }

    public List<ClothesPhoto> getClothesPhoto() {
        return clothesPhoto;
    }

    public void setClothesPhoto(List<ClothesPhoto> clothesPhoto) {
        this.clothesPhoto = clothesPhoto;
    }

    public List<ClothesPhotoSizeRelation> getClothesPhotoSizeRelation() {
        return clothesPhotoSizeRelation;
    }

    public void setClothesPhotoSizeRelation(List<ClothesPhotoSizeRelation> clothesPhotoSizeRelation) {
        this.clothesPhotoSizeRelation = clothesPhotoSizeRelation;
    }

    private List<ClothesPhotoSizeRelation> clothesPhotoSizeRelation;


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
        this.clothesDescribe = clothesDescribe == null ? null : clothesDescribe.trim();
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
        this.clothesImg = clothesImg == null ? null : clothesImg.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}