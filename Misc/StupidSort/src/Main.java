/*
This is a "Stupid" sorting algorithm that basically randomly generates a new index position for every value inside of
an array and assigns each new value to a new position every time, checks if it's sorted, and returns it if it is.

Obviously a horribly inefficient method of sorting arrays, especially if they are big, but fun nonetheless.

See the StupidSort.java file for the actual code.
*/

public class Main {
    public static void main(String[] args) {
        StupidSort.stupidSort(new int[]{16,18,3,7,24,17,10,2});
    }
}
