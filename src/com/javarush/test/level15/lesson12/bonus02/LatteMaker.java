package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by user on 22.07.2015.
 */
public class LatteMaker extends DrinkMaker
{
    public  void getRightCup()
    {

        System.out.println("Берем чашку для латте");
    }
    public  void putIngredient()
    {
        System.out.println("Делаем кофе");
    }
    public  void pour()
    {
        System.out.println("Заливаем молоком с пенкой");
    }
    public void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();
    }
}
