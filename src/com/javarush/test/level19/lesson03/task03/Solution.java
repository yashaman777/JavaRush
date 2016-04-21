package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static Map<String, String> countries = new HashMap<String, String>();

    static
    {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class IncomeDataAdapter implements Customer, Contact
    {
        private IncomeData data;

        IncomeDataAdapter(IncomeData data)
        {
            this.data = data;
        }

        public String getCompanyName()
        {
            return this.data.getCompany();
        }//example JavaRush Ltd.

        public String getCountryName()
        {
            return countries.get(this.data.getCountryCode());
        }

        public String getName()
        {
            return this.data.getContactLastName() + ", " + this.data.getContactFirstName();
        }//example Ivanov, Ivan

        public String getPhoneNumber()
        {
            StringBuilder s = new StringBuilder(String.valueOf(this.data.getPhoneNumber()));
           while (s.length() < 10)
               s.insert(0, "0");

            return "+" + this.data.getCountryPhoneCode() + "(" + s.substring(0, 3) + ")" + s.substring(3, 6) + "-" + s.substring(6, 8) + "-" + s.substring(8, 10);
        }
    }

    public static interface IncomeData
    {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer
    {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact
    {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }


    public static void main(String[] args)
    {
        class IncomeDataClass implements IncomeData
        {
            String countryCode = "UA";
            String company = "JavaRush Ltd.";
            String firstName = "Ivan";
            String lastName = "Ivanov";
            int phoneCode = 38;
            int numPhone = 12;

            @Override
            public String getCountryCode()
            {
                return countryCode;
            }

            @Override
            public String getCompany()
            {
                return company;
            }

            @Override
            public String getContactFirstName()
            {
                return firstName;
            }

            @Override
            public String getContactLastName()
            {
                return lastName;
            }

            @Override
            public int getCountryPhoneCode()
            {
                return phoneCode;
            }

            @Override
            public int getPhoneNumber()
            {
                return numPhone;
            }
        }
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeDataClass());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getPhoneNumber());
    }

}
