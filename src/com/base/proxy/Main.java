package com.base.proxy;

public class Main {

    public static void main(String[] args) {
        Barista beginner = new BaristaManager(new BaristaBeginner());
        Barista senior = new BaristaManager(new BaristaSenior());
        beginner.roastingBeans();
        senior.roastingBeans();
    }
}
