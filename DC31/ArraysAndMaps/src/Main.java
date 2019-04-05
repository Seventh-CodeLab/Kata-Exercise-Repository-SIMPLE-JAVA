import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ TASK A: Make map pairs of first/last letters ================");
        //Task A
        System.out.println(ArrayHandler.makePairs(new String[]{"code","bug"}));
        System.out.println(ArrayHandler.makePairs(new String[]{"man","moon","main"}));
        System.out.println(ArrayHandler.makePairs(new String[]{"man","moon","good","night"}));

        System.out.println("\n============ TASK B: Append a letter every 2nd, 4th, 6th appearance etc. ================");
        //Task B
        System.out.println(ArrayHandler.twoPlusAppend(new String[]{"a","b","a"}));
        System.out.println(ArrayHandler.twoPlusAppend(new String[]{"a","b","a","c","a","d","a"}));
        System.out.println(ArrayHandler.twoPlusAppend(new String[]{"a","","a"}));

        System.out.println("\n============ TASK C: Find the size of the largest mirror in array ================");
        //Task C
        System.out.println(ArrayHandler.mirrorMax(new int[]{1,2,3,8,9,3,2,1}));
        System.out.println(ArrayHandler.mirrorMax(new int[]{1,2,1,4}));
        System.out.println(ArrayHandler.mirrorMax(new int[]{7,1,2,9,7,2,1}));

        System.out.println("\n============ TASK D: Reverse an arraylist ================");
        //Task D
        ArrayList<Integer> arrL1 = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            arrL1.add(i);
        }
        System.out.println(ArrayHandler.reverse(arrL1));

        ArrayList<Integer> arrL2 = new ArrayList<>();
        arrL2.add(111);
        arrL2.add(222);
        arrL2.add(333);
        System.out.println(ArrayHandler.reverse(arrL2));


        System.out.println("\n============ TASK E: Read and use grades from file ================");
        //Task E
        System.out.println(ArrayHandler.max(ArrayHandler.readGrade("grades.txt")));
        System.out.println(ArrayHandler.min(ArrayHandler.readGrade("grades.txt")));
        System.out.println(ArrayHandler.average(ArrayHandler.readGrade("grades.txt")));
        System.out.println(ArrayHandler.removeDuplicates(ArrayHandler.readGrade("grades.txt")));
    }


}
