package aulas.aula103;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        //ADCIONA HORAS
//        cal.add(Calendar.HOUR_OF_DAY, 4);
//        d = cal.getTime();

        System.out.println("Minutes: " + minutes);
        System.out.println("Minutes: " + month );
    }
}
