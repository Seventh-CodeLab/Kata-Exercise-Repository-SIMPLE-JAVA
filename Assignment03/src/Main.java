import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Read and check XYZ
        System.out.println(CheckXYZ.containDiff(5,4,3));
        System.out.println(CheckXYZ.containDiff(5,5,3));

        System.out.println(CheckXYZ.notContainEqual(6,3,2));
        System.out.println(CheckXYZ.notContainEqual(6,6,2));

        System.out.println(CheckXYZ.twoEqual(7,3,1));
        System.out.println(CheckXYZ.twoEqual(7,2,7));

        //Sort ABC
        System.out.println(Arrays.toString(SortABC.getSort(3,6,9,true)));
        System.out.println(Arrays.toString(SortABC.getSort(2,7,10,false)));

        //Read Horizontal and Vertical lines
        System.out.println(ReadLines.doIntersect(2,0,2,3,1,1,4,1));

        //Get Numerals
        System.out.println(CountNumerals.getNumerals(523));
        System.out.println(CountNumerals.getNumerals(412478));

        //Get Prime Decomposition
        System.out.println(PrimeDecomp.getDecomp(333333));

    }
}
