package main;

public class Main {
    public static int timeToSec(String time) {
        String[] part = time.split(":");
        int hh = Integer.parseInt(part[0]);
        int mm = Integer.parseInt(part[1]);
        int ss = Integer.parseInt(part[2]);

        return 3600 * hh + 60 * mm + ss;
    }

    public static String secToTime(int a) {
        int hh, mm, ss;

        if (a < 0 || a >= 32000) {
            return "-1";
        }

        hh = a / 3600;
        a = a - (3600 * hh);
        mm = a / 60;
        ss = a - (60 * mm);

        return String.format("%02d:%02d:%02d", hh, mm, ss);

    }
}