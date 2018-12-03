package com.cs.entity;

public class ShopCart {
    private Integer shopId;

    private Integer relationId;

    private String shopUserAccountNumber;

    private Integer shopOrder;

    private Integer shopState;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getShopUserAccountNumber() {
        return shopUserAccountNumber;
    }

    public void setShopUserAccountNumber(String shopUserAccountNumber) {
        this.shopUserAccountNumber = shopUserAccountNumber == null ? null : shopUserAccountNumber.trim();
    }

    public Integer getShopOrder() {
        return shopOrder;
    }

    public void setShopOrder(Integer shopOrder) {
        this.shopOrder = shopOrder;
    }

    public Integer getShopState() {
        return shopState;
    }

    public void setShopState(Integer shopState) {
        this.shopState = shopState;
    }
}