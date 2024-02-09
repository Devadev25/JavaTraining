package com.basic.teashopmanagement;

public class OwnerDetails {
    private String ownerName;
    private String address;
    private long phoneNumber;
    int quantities = 10;

    public OwnerDetails() {
    }

    OwnerDetails(String ownerName, String address, long phoneNumber) {
        this.ownerName = ownerName;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
