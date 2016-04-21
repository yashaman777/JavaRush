package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мама
2 Рама
1 Мыла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {


        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String n = reader.readLine();
            if(n.isEmpty())break;
            int id = Integer.parseInt(n);
            String name = reader.readLine();
            if(name.isEmpty()) break;
            map.put(name, id);
        }
        for(HashMap.Entry<String, Integer> element : map.entrySet() )
            System.out.println(element.getValue() + " " + element.getKey());
    }
}
