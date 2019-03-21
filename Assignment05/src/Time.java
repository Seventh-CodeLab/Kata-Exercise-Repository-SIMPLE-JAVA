public class Time {
    private int hour;
    private int minute;
    private int second;

    public static Time convertSeconds(int seconds){
        Time t = new Time();
        t.second = seconds % 60;
        t.minute = seconds / 60 % 60;
        t.hour = seconds / 60 / 60;
        return t;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
