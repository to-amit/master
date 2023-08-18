package org.example;

import java.util.List;
import java.util.Map;

public class Emp {
    private List<String> friends;
    private Map<String, Integer> feeStructure;

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    //    Emp(){
//
//    }
    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                '}';
    }
}
