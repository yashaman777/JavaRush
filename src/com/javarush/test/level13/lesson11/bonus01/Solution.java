package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
         String file;
         ArrayList<Integer> list  = new ArrayList<Integer>();
         while((file = reader1.readLine()) != null)
         {

             if(Integer.parseInt(file)%2 == 0)
                 list.add(Integer.parseInt(file));
         }
          Collections.sort(list);
for (int i = 0; i < list.size(); i++)
        System.out.println(list.get(i));// напишите тут ваш код
    }
}
