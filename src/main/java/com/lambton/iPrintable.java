package com.lambton;

public interface iPrintable
{
    int x=100;
    void print();
    //we can give definition of a method with default keyword.
    default void iAmNewMethod()
    {

    }
}
