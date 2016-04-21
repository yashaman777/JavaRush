package com.javarush.test.level14.lesson08.bonus01;


import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {
      for(int j = 0; j < 10; j++)//it's first exception
      {
          try
          {
              float i = 1 / 0;

          }
          catch (Exception e)
          {
              exceptions.add(e);
          }
      }

    }
}
