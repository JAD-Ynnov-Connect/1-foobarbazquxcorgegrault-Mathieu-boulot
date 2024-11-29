package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar = new Bar();
    private ArrayList<Baz> bazs = new ArrayList<Baz>();
    private Qux qux = new Qux();
    private Corge corge = new Corge(new Foo(new Bar()));
    private ArrayList<Grault> graults = new ArrayList<Grault>();

    public Foo(final Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Baz> getBazs() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Qux getQux() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Corge getCorge() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setCorge(final Corge firstCorge) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Grault> getGraults() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addBaz(final Baz baz) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addGrault() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
