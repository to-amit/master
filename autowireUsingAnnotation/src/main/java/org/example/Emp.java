package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("add2")
    private Address address;
    public Emp(){

    }
//    @Autowired
    public Emp(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp [ " +
                "address=" + address +
                ']';
    }
}
