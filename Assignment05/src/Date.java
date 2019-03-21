public class Date {
    private int day;
    private int month;
    private int year;

    Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public static void printDate(Date d){
        System.out.println(d.day + "." + d.month + "." + d.year);
    }

    public static String getDate(Date d){
        return (d.day + "." + d.month + "." + d.year);
    }

    // Returns difference between two dates in days
    public static int dayDiff(Date d1, Date d2){
        int diff = d1.daysSince0(d1) - d2.daysSince0(d2);
        return diff;
    }

    // Calculates days since the 1.1.0000 based on Gregorian calendar factoring in leap years
    static int daysSince0(Date d){
        int days = 0;
        days += d.day;
        for(int i = d.month; i > 0; i--){
            if (i == 4 || i == 6 || i == 9 || i == 11){
                days += 30;
            } else if (i == 2){
                days += 28;
            } else {
                days += 31;
            }
        }
        for(int i = d.year; i > 0; i--){
            if (i % 4 == 0){
                if(i % 100 == 0 && i % 400 != 0){
                    days += 365;
                } else {
                    days += 366;
                }
            } else {
                days += 365;
            }
        }
        return days;
    }
}
