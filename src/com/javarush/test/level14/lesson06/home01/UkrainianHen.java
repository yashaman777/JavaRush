package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 23.06.2015.
 */
public class UkrainianHen extends Hen implements Country
{
    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + UKRAINE +"." + " Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
    @Override
    int getCountOfEggsPerMonth()
    {
        return 30;
    }
}
