public class SortArray {
    public static void main(String[] args) {
        int[] myArray = {3, 2, 1, 5, 4, 7, 8, 6};
        sortArray(myArray);
    }

    public static void sortArray(int[] myArray){
        int[] sortedArray = new int [myArray.length];
        int[] positionOrder = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray.length; j++){
                if (myArray[i] > myArray[j]){
                    positionOrder[i]++;
                }
            }
        }

        for (int i = 0; i < myArray.length; i++){
            sortedArray[positionOrder[i]] = myArray[i];
        }
        for (int i = 0; i < myArray.length; i++){
            if (i == (myArray.length - 1)){
                System.out.print(sortedArray[i]);
            } else {
                System.out.print(sortedArray[i] + ", ");
            }
        }
    }
}
