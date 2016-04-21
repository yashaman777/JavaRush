package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
бузПример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        int x, y = 0;
        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (!isNumber(array[i]))
                {
                    x = i+1;
                    while (isNumber(array[x]) & (x < array.length - 1))
                    {
                        x++;
                    }
                    if(!isNumber(array[x]))
                    if (isGreaterThen(array[i], array[x]))
                    {
                        String c = array[i];
                        array[i] = array[x];
                        array[x] = c;
                    }
                }
                else
                if (isNumber(array[i]))
                {
                    y = i + 1;
                    while (!isNumber(array[y]) & (y < array.length - 1))
                    {
                        y++;
                    }
                    if (isNumber(array[y]))
                        if (Integer.parseInt(array[i]) < Integer.parseInt(array[y]))
                        {
                            String c = array[i];
                            array[i] = array[y];
                            array[y] = c;
                        }
                }
            }//Напишите тут ваш код
        }
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
