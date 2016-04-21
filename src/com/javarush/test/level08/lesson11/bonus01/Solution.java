package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

String s = reader.readLine();
            if (s.equals("January"))
            {System.out.println(s + " is 1 month");
            }
            if (s.equals("February"))
            { System.out.println(s + " is 2 month");
           }
                if (s.equals("March"))
                {System.out.println(s + " is 3 month");
            }
                    if (s.equals("April"))
                System.out.println(s + " is 4 month");
            if (s.equals("May"))
                System.out.println(s + " is 5 month");
            if (s.equals("June"))
                System.out.println(s + " is 6 month");
            if (s.equals("July"))
                System.out.println(s + " is 7 month");
            if (s.equals("August"))
                System.out.println(s + " is 8 month");
            if (s.equals("September"))
                System.out.println(s + " is 9 month");
            if (s.equals("October"))
                System.out.println(s + " is 10 month");
            if (s.equals("November"))
                System.out.println(s + " is 11 month");
            if (s.equals("December"))
                System.out.println(s + " is 12 month");//add your code here - напиши код тут
        }
    }

