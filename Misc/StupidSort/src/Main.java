/*
This is a "Stupid" sorting algorithm that basically randomly generates a new index position for every value inside of
an array and assigns each new value to a new position every time, checks if it's sorted, and returns it if it is.

Obviously a horribly inefficient method of sorting arrays, especially if they are big, but fun nonetheless.

See the StupidSort.java file for the actual code.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StupidSort.stupidSort(new int[]{1,2,3,4,5,6,7});
    }
}
