public class CountNumerals {
    public static int getNumerals(int fullValue){
        int numerals = 0;
        while (fullValue != 0){
            numerals++;
            fullValue /= 10;
        }
        return numerals;
    }
}
