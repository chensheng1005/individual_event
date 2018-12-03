package com.cs.entity;

public class Recipient {
    private Integer recipientId;

    private String recipientUserAccountNumber;

    private String recipientPerson;

    private String recipientAddress;

    private String recipientPersonPhone;

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientUserAccountNumber() {
        return recipientUserAccountNumber;
    }

    public void setRecipientUserAccountNumber(String recipientUserAccountNumber) {
        this.recipientUserAccountNumber = recipientUserAccountNumber == null ? null : recipientUserAccountNumber.trim();
    }

    public String getRecipientPerson() {
        return recipientPerson;
    }

    public void setRecipientPerson(String recipientPerson) {
        this.recipientPerson = recipientPerson == null ? null : recipientPerson.trim();
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress == null ? null : recipientAddress.trim();
    }

    public String getRecipientPersonPhone() {
        return recipientPersonPhone;
    }

    public void setRecipientPersonPhone(String recipientPersonPhone) {
        this.recipientPersonPhone = recipientPersonPhone == null ? null : recipientPersonPhone.trim();
    }
}