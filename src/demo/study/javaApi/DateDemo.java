package demo.study.javaApi;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);

        Date date3 = new Date(11111111);
        System.out.println(date3);

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);


    }
}
