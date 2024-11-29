package com.jad;

public class Corge {
    private Foo foo = new Foo(new Bar());

    public Corge(final Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setFoo(final Foo foo) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
