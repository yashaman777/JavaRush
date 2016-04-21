package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file = new FileOutputStream(reader.readLine());

        while(true)
        {
            String s = reader.readLine();
            if(s.equals("exit"))
            {

                byte[] c = s.getBytes();
                file.write(c);

                break;
            }
            byte[] c = s.getBytes();
            file.write(c);
            file.write(System.lineSeparator().getBytes());
        }
        file.close();
    }
}
