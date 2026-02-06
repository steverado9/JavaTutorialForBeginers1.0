package org.example.dateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println(date.getMonth() + 1);
        System.out.println(1900 + date.getYear());
        System.out.println(date.getDay());

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
        System.out.println(sdf.format(date));
    }
}
