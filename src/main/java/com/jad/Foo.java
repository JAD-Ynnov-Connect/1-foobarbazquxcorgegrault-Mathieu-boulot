package com.jad;

import java.util.ArrayList;

public class Foo {
    private final ArrayList<Baz> bazs = new ArrayList<Baz>();
    private final Qux qux = new Qux();
    private ArrayList<Grault> graults = new ArrayList<Grault>();
    private Bar bar;
    private Corge corge;

    public Foo(Bar bar) {
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

    public void addGrault() {
        graults.add(new Grault(this));
    }

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(final Corge firstCorge) {
        this.corge = corge;
        if (this.corge == firstCorge) {
            return;
        }

        if (this.corge != null) {
            Corge oldCorge = this.corge;
            this.corge = null;
            oldCorge.setFoo(null);
        }

        this.corge = firstCorge;
        if (firstCorge != null && firstCorge.getFoo() != this) {
            firstCorge.setFoo(this);
        }
    }
}
