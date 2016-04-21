package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
      Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vaska", new Cat("Vaska"));
        map.put("Vaska1", new Cat("Vaska1"));
        map.put("Vaska2", new Cat("Vaska2"));
        map.put("Vaska3", new Cat("Vaska3"));
        map.put("Vaska4", new Cat("Vaska4"));
        map.put("Vaska5", new Cat("Vaska5"));
        map.put("Vaska6", new Cat("Vaska6"));
        map.put("Vaska7", new Cat("Vaska7"));
        map.put("Vaska8", new Cat("Vaska8"));
        map.put("Vaska9", new Cat("Vaska9"));
        return map;//Напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet();
        for(Map.Entry<String, Cat> s : map.entrySet())
        {
            set.add(s.getValue());
        }

        return set;//Напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
