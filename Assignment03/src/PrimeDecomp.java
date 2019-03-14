public class PrimeDecomp {
    public static String getDecomp(int fullValue){
        String decomposition = fullValue + " = ";
        while (fullValue != 0){
            if (fullValue % 2 == 0){
                decomposition += "2 x ";
                fullValue /= 2;
            } else if (fullValue % 3 == 0){
                decomposition += "3 x ";
                fullValue /= 3;
            } else if (fullValue % 5 == 0){
                decomposition += "5 x ";
                fullValue /= 5;
            } else if (fullValue % 7 == 0){
                decomposition += "7 x ";
                fullValue /= 7;
            } else if (fullValue % 11 == 0){
                decomposition += "11 x ";
                fullValue /= 11;
            } else if (fullValue % 13 == 0){
                decomposition += "13 x ";
                fullValue /= 13;
            } else if (fullValue % 17 == 0){
                decomposition += "17 x ";
                fullValue /= 17;
            } else if (fullValue % 19 == 0){
                decomposition += "19 x ";
                fullValue /= 19;
            } else if (fullValue % 23 == 0){
                decomposition += "23 x ";
                fullValue /= 23;
            } else if (fullValue % 29 == 0){
                decomposition += "29 x ";
                fullValue /= 29;
            } else {
                decomposition += fullValue;
                fullValue -= fullValue;
            }
        }
        return decomposition;
    }
}
