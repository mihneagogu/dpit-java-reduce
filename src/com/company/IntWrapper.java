package com.company;

public class IntWrapper {
    private Integer inner;

    // println(? param) -> System.out::println
    // new IntWrapper(value) -> IntWrapper::new
    public IntWrapper(Integer value) {
        this.inner = value;
    }

    public Integer getInner() {
        return this.inner;
    }

    // wrapper.isEven()
    // IntWrapper::isEven
    public boolean isEven() {
        return this.inner % 2 == 0;
    }

    // wrapper.next()
    // IntWrapper::next
    public Integer next() {
        return this.inner + 1;
    }

    public IntWrapper wrapNext() {
        return new IntWrapper(this.inner + 1);
    }

    // IntWrapper::timesTwo
    public Integer timesTwo() {
        return this.inner * 2;
    }

    @Override
    public String toString() {
        return "Wrapper of: " + this.inner;
    }

    public boolean complicatedFilterMethod() {
       /*
       *
       *
       * ??
        */
        return this.inner % 3 == 0;
    }

}
