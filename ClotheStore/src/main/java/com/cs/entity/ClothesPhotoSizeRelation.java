package com.cs.entity;

public class ClothesPhotoSizeRelation {
    private Integer relationId;

    private Integer relationClothesId;

    private Integer relationPhotoId;

    private Integer realtionSizeId;

    private Integer clothesCount;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getRelationClothesId() {
        return relationClothesId;
    }

    public void setRelationClothesId(Integer relationClothesId) {
        this.relationClothesId = relationClothesId;
    }

    public Integer getRelationPhotoId() {
        return relationPhotoId;
    }

    public void setRelationPhotoId(Integer relationPhotoId) {
        this.relationPhotoId = relationPhotoId;
    }

    public Integer getRealtionSizeId() {
        return realtionSizeId;
    }

    public void setRealtionSizeId(Integer realtionSizeId) {
        this.realtionSizeId = realtionSizeId;
    }

    public Integer getClothesCount() {
        return clothesCount;
    }

    public void setClothesCount(Integer clothesCount) {
        this.clothesCount = clothesCount;
    }
}