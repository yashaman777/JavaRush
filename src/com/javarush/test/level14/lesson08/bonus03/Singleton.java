package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by user on 25.06.2015.
 */
public class Singleton
{
    private static final Singleton vasya = new Singleton();
    private Singleton(){}
    static Singleton getInstance()
    {
       return vasya;
    }
}
