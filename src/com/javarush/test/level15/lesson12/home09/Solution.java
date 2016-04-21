package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        ArrayList<String> param = new ArrayList<String>();
        ArrayList<String> param2 = new ArrayList<String>();
        double lp = 0;
        String kl = null;
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int index = s.indexOf("?");
        String s2 = s.substring(index+1);
        String[] arr = s2.split("&");

        for(int i = 0; i < arr.length; i++)
        {
            //int y = arr[i].indexOf("obj=");
            if (arr[i].startsWith("obj="))
            {
                String[] rrr = arr[i].split("=");
                param.add(rrr[0]);
                param2.add(rrr[1]);

            }
            else
            {
                int x = arr[i].indexOf("=");

                if (x >= 0)
                {
                    String qwe = arr[i].substring(0, x);
                    param.add(qwe);
                }
                else
                {
                    param.add(arr[i]);
                }

            }
        }
        for (String k : param)
        {
            System.out.print(k + " ");
        }

        for(String g : param2)
        {
            try
            {
                lp = Double.parseDouble(g);
                alert(lp);
            }
            catch (Exception e)
            {
                kl = g;
                alert(kl);
            }
        }//add your code here


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
