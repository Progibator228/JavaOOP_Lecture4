package org.example;


import java.util.Objects;

public class SimpleBox {
    private Object obj;

    public SimpleBox() {
    }

    public SimpleBox(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleBox simpleBox = (SimpleBox) o;
        return Objects.equals(obj, simpleBox.obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj);
    }

    @Override
    public String toString() {
        return "SimpleBox{" +
                "obj=" + obj +
                '}';
    }
}
