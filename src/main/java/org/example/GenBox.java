package org.example;

import java.util.Objects;

public class GenBox<G> {

    private G obg;

    public GenBox() {
    }

    public GenBox(G obg) {
        this.obg = obg;
    }

    public G getObg() {
        return obg;
    }

    public void setObg(G obg) {
        this.obg = obg;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "obg=" + obg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenBox<?> genBox = (GenBox<?>) o;
        return Objects.equals(obg, genBox.obg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obg);
    }
}
