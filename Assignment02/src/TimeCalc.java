public class TimeCalc {
    public static String getTime(int inputSec){
        int sec = inputSec % 60;
        int min = (inputSec / 60) % 60;
        int hr = (inputSec/ 60 ) / 60;
        return hr + ":" + min + ":" + sec;
    }
}
