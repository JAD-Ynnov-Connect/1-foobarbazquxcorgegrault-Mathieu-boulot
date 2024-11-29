package com.jad;

public class Grault {
    private Foo foo = new Foo(new Bar());

    public Grault(final Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
