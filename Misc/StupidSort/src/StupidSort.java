import java.util.Arrays;
import java.util.Random;

class StupidSort {
    private static long iteration = 0;

    static int[] stupidSort(int[] arr){
        long start = System.currentTimeMillis();
        int[] sortedArr = randomSort(arr);
        while (!isSorted(sortedArr)){
            sortedArr = randomSort(arr);
        }
        long finish = System.currentTimeMillis();
        long seconds = (finish - start);
        System.out.println("Elapsed Time: " + seconds +"ms");
        return sortedArr;
    }

    //Checks if the array is sorted
    private static boolean isSorted(int[] arr){
        System.out.println("Iteration "+ iteration + ": " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                //If even one value is smaller than the one that comes before it, it's not sorted
                iteration++;
                return false;
            }
        }
        return true;
    }

    //Actual sorting algorithm
    private static int[] randomSort(int[] arr){
        Random rand = new Random();
        int[] indexes = new int[arr.length];

        //First assign all values in indexes to something outside index bounds to prevent infinity
        for(int i = 0; i < indexes.length; i++){
            indexes[i] = arr.length+1;
        }

        //Assign indexes randomly to a separate index array
        for(int i = 0; i < indexes.length; i++){
            int randomIndex = rand.nextInt(arr.length);
            while (indexUsed(indexes,randomIndex)){
                //Keep making indexes until you get an unused one
                randomIndex = rand.nextInt(arr.length);
            }
            indexes[i] = randomIndex;
        }

        int[] outputArr = new int[arr.length];
        for(int i = 0; i < outputArr.length; i++){
            outputArr[indexes[i]] = arr[i];
        }
        return outputArr;
    }

    private static boolean indexUsed(int[] indexes, int currentIndex){
        for(int index : indexes){
            if(index == currentIndex){
                return true;
            }
        }
        return false;
    }
}
