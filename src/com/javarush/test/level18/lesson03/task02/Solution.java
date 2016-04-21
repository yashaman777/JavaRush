package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(input.available() > 0)
        {
            int data = input.read();
            list.add(data);
        }
        for(int i = 0; i <list.size() -1; i++)
        {
            if(list.get(i) < list.get(i + 1))
            {
                int temp = list.get(i);
                int qwe = list.get(i + 1);
                list.set(i, qwe);
                list.set(i + 1, temp);
            }
        }
        input.close();

        System.out.println(list.get(list.size() - 1));

    }
    }

