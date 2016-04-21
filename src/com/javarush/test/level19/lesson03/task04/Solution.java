package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {
    public static class PersonScannerAdapter  implements PersonScanner {

        private Scanner scan;
        PersonScannerAdapter(Scanner scan)
        {
            this.scan = scan;
        }
        public Person read() throws IOException
        {
            String string = scan.nextLine();
            String [] line = string.split(" ");
            Calendar calendar = new GregorianCalendar(
                    Integer.parseInt(line[5]),
                    Integer.parseInt(line[4]) - 1,
                    Integer.parseInt(line[3]));
            return new Person(line[1], line[2], line[0], calendar.getTime());
        }

     public  void close() throws IOException
        {this.scan.close();}

    }
}
