package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by user on 22.07.2015.
 */
public class Plane implements Flyable
{
    public int people;
    Plane(int people)
    {
        this.people = people;
    }
    @Override
    public void fly()
    {

    }
}
