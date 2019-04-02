import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Finds the number of clusters
        System.out.println(numberOfClusters(new int[] {1, 2, 2, 3, 5, 5, 5}));
        System.out.println(numberOfClusters(new int[] {1, 1, 2, 2, 1, 1, 4}));
        System.out.println(numberOfClusters(new int[] {1, 1, 1, 1, 1}));
        System.out.println(numberOfClusters(new char[] {'a', 'a', 'a', 'v',}));

        System.out.println(moveIt(new char[] {'B', 'A', 'X', 'A', 'X', 'B'}));
        System.out.println(moveIt(new char[] {'C', 'A', 'C', 'B'}));
        System.out.println(moveIt(new char[] {'C', 'A', 'C', 'B', 'B', 'A', 'C'}));
    }

    static int numberOfClusters(int[] arr){
        int clusterCount = 0;
        for (int i = 0; i < arr.length; i++){ //Go through array
            int j = i;
            int clusterSize = 0; //Tracks the size of a cluster to skip
            while (arr[i] == arr[j]){ //Finds the size of a cluster
                clusterSize++;
                if(j == arr.length-1){
                    break; //Break the while loop if J exceeds array length to prevent outofbounds
                } else {
                    j++;
                }
            }
            if (clusterSize > 1){
                clusterCount++; //Increment cluster count
                i += clusterSize - 1; //Passes by the rest of a cluster
            }
        }
        return clusterCount;
    }

    static int numberOfClusters(char[] arr){ //Overload with Char values
        int clusterCount = 0;
        for (int i = 0; i < arr.length; i++){
            int j = i;
            int clusterSize = 0;
            while (arr[i] == arr[j]){
                clusterSize++;
                if(j == arr.length-1){
                    break;
                } else {
                    j++;
                }
            }
            if (clusterSize > 1){
                clusterCount++;
                i += clusterSize - 1;
            }
        }
        return clusterCount;
    }


    static String moveIt(char[] arr){
        for (int i = 0; i < arr.length; i++){
            char tempTarget = 'X'; //Placeholder Initializer
            char tempB = 'B'; //This will always be a B anyway
            int tempBIndex = 0; //Placeholder B index.
            if (arr[i] == 'A' && arr[i+1] != 'B'){ //Find an A without a following B
                tempTarget = arr[i+1]; //Store the value after the A

                for(int j = 0; j < arr.length-1; j++){ //For loop that finds a free B
                    //Unique check for first index
                    if (j == 0 && arr[j] == 'B'){
                        tempB = arr[j];
                        tempBIndex = j;
                    }
                    if (arr[j] == 'A' && arr[j+1] == 'B'){
                        continue; //Ignore B's that have a preceding A
                    } else if (arr[j] != 'A' && arr[j+1] == 'B'){
                        tempB = arr[j+1];
                        tempBIndex = j+1;
                    }
                }

                arr[i+1] = tempB; //Place a B after the A

                arr[tempBIndex] = tempTarget;
            }
        }
        return Arrays.toString(arr);
    }
}
