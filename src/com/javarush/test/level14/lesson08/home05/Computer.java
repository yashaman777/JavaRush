package com.javarush.test.level14.lesson08.home05;

/**
 * Created by user on 24.06.2015.
 */
public class Computer
{
    private Keyboard a;
    private Monitor b;
    private Mouse c;

    public Computer()
    {
        this.a = new Keyboard();
        this.b = new Monitor();
        this.c = new Mouse();
    }

    public Keyboard getKeyboard()
    {
        return a;
    }

    public Monitor getMonitor()
    {
        return b;
    }

    public Mouse getMouse()
    {
        return c;
    }
}
