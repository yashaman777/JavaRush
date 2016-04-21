package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
    public static HashMap<String, String> createMap()
    {
      HashMap<String, String> map = new HashMap<String, String>();
        map.put("q1", "s2");
        map.put("q2", "s2");
        map.put("q3", "s3");
        map.put("q4", "s4");
        map.put("q5", "s4");
        map.put("q6", "s5");
        map.put("q7", "s6");
        map.put("q8", "s6");
        map.put("q9", "s7");
        map.put("q0", "s9");//Напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            String value = pair.getValue();
            int count = 0;
            for (Map.Entry<String, String> pair1 : copy.entrySet())
            {
                if (pair1.getValue().equals(value))
                {
                    count++;
                    if (pair1.getValue().equals(value) & (count > 1))
                        map.remove(pair1.getKey());
                }

            }//Напишите тут ваш код
             if (count > 1)
             map.remove(pair.getKey());
        }
    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
