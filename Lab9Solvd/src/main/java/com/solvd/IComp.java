package com.solvd;

@FunctionalInterface

public interface IComp <T> {

    boolean comp(T obj1, T obj2);
}