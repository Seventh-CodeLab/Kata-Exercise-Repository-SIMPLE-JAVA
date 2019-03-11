import java.util.ArrayList;
import java.util.Arrays;

    public class ArrayMerge {
        public static void main(String[] args) {
            String[] str1 = {"a", "i", "j", "x"};
            String[] str2 = {"f", "f", "h", "l", "m", "x"};
            int N = 3;
            String[] newArray = mergeTwo(str1,str2,N);
            System.out.println(Arrays.toString(newArray));
        }

        public static String[] mergeTwo(String[] strA, String[] strB, int units){

            //Create arraylist for easier handling
            ArrayList<String> arrL = new ArrayList<String>();
            int aDex = 0;
            int bDex = 0;

            //Add all values to arraylist in alphabetical order (based on first letter)
            while(aDex < strA.length || bDex < strB.length){
                char aChar = strA[aDex].charAt(0);
                char bChar = strB[bDex].charAt(0);
                if (aChar < bChar){
                    arrL.add(strA[aDex]);
                    aDex++;
                } else if (bChar < aChar){
                    arrL.add(strB[bDex]);
                    bDex++;
                } else if (aChar == bChar) {
                    arrL.add(strA[aDex]);
                    arrL.add(strB[bDex]);
                    aDex++;
                    bDex++;
                }
            }

            //Removes all duplicates in arraylist
            for(int i = 0; i < arrL.size()-1; i++){
                if (arrL.get(i) == arrL.get(i+1)){
                    arrL.remove(i);
                    i--;
                } else {
                    //Do nothing
                }
            }

            //Cut down array to defined unit length
            if(arrL.size() > units){
                for (int i = arrL.size()-1; i > units-1;i--){
                    arrL.remove(i);
                }
            }

            //Convert Arraylist to array
            String[] result = arrL.toArray(new String[arrL.size()]);
            return result;
        }
    }
