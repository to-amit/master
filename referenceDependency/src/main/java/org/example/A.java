package org.example;

public class A {
    private int x;
    private B ob;

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }

    public void setX(int x) {
        this.x = x;
    }


}
