package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human a = new Human("Sergey","Yakovenko",31, true, "shirt","bike");
        Human b = new Human(37, "Vova","Konovich",true, "shirt", "bike");
        Human c = new Human(true, 39, "Kolya", "Franchuk", "paints", "bike");
        Human d = new Human(38,"Galya", "Kos","dress", "cook",false);
        Human e = new Human("Yarik","Gor",38,"shirt","mozg", true);
        Human f = new Human("Slavik", "Ol",33, "shirt", true, "comp");
        Human g = new Human(true, "Den","Bor", 35, "shirt", "buhlo");
        Human h = new Human (true, "maks", "kar", "shirt","pizdet", 38);
        Human i = new Human("igor","urb","shirt","direct", 38, true);
        Human j = new Human ("sasha", "vitv","shirt",40,true, "buhat");

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        String surname;
         String clothes;
         String hobby;
         Human(String name, String surname, int age, boolean sex, String clothes, String hobby)
         {
             this.name = name;
             this.surname = surname;
             this.age = age;
             this.sex = sex;
             this.clothes = clothes;
             this.hobby = hobby;
         }
         Human(int age,  String name, String surname,  boolean sex, String clothes, String hobby)
         {
             this.name = name;
             this.surname = surname;
             this.age = age;
             this.sex = sex;
             this.clothes = clothes;
             this.hobby = hobby;
         }
        Human(boolean sex, int age,  String name, String surname,  String clothes, String hobby)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
        Human( int age,  String name, String surname,  String clothes, String hobby, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
        Human(   String name, String surname, int age, String clothes, String hobby, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
        Human(   String name, String surname, int age, String clothes,boolean sex, String hobby )
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }//напишите тут ваши переменные и конструкторы
        Human(  boolean sex, String name, String surname, int age, String clothes, String hobby )
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
        Human(  boolean sex, String name, String surname,  String clothes, String hobby,int age )
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
        Human(   String name, String surname,  String clothes, String hobby,int age,boolean sex )
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
        Human(   String name, String surname,  String clothes,int age,boolean sex, String hobby )
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.clothes = clothes;
            this.hobby = hobby;
        }
    }


}
