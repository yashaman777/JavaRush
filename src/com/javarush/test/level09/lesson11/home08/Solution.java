package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = {6, 7};
        int[] ar3 = {8, 9, 10, 11};
        int[] ar4 = {12, 13, 14, 15, 16, 17, 18};
        int[] ar5 = {};
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(ar1);
        list.add(ar2);
        list.add(ar3);
        list.add(ar4);
        list.add(ar5);

        return list;//Написать тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
