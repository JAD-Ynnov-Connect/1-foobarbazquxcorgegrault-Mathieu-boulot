package com.jad;

import java.util.ArrayList;

public class Foo {
    private final Bar bar;
    private final ArrayList<Baz> bazs = new ArrayList<Baz>();
    private final Qux qux = new Qux();
    private final ArrayList<Grault> graults = new ArrayList<Grault>();
    private Corge corge = new Corge(new Foo(new Bar()));

    public Foo(final Bar bar) {
        this.bar = bar;
    }

    public ArrayList<Grault> getGraults() {
        return graults;
    }

    public Qux getQux() {
        return qux;
    }

    public ArrayList<Baz> getBazs() {
        return bazs;
    }

    public Bar getBar() {
        return bar;
    }


    public void addBaz(final Baz baz) {
        bazs.add(baz);
    }

    /* public void addGrault(final Grault grault) {
        graults.add(grault);
    }*/

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }
}
