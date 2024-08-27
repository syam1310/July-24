package org.july_24.thread;

public class Address {
    private int houseNo;
    private int street;
    private String state;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(int houseNo, int street, String state) {
        this.houseNo = houseNo;
        this.street = street;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", street=" + street +
                ", state='" + state + '\'' +
                '}';
    }
}
