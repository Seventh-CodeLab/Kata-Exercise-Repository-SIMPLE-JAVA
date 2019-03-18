public class Main {
    public static void main(String[] args) {
        System.out.println(isThereBalance(new int[]{1,1,1,2,1}));
        System.out.println(isThereBalance(new int[]{2,1,1,2,1}));
        System.out.println(isThereBalance(new int[]{15,15}));
    }

    public static boolean isThereBalance(int[] arr){
        //Iterate through array
        //i determines the split point
        for(int i = 0; i < arr.length; i++){
            // Variable for the values before the split
            int firstHalf = 0;
            for (int a = 0; a <= i; a++){
                // Summarize numbers from 0 to split point
                firstHalf += arr[a];
            }

            // Variable for the values after the split
            int secondHalf = 0;
            for (int b = arr.length - 1; b > i; b--){
                // Summarize numbers from end to split point
                secondHalf += arr[b];
            }

            // If the parts of the array summarize to the same integer at any point, return true
            if (firstHalf == secondHalf){
                return true;
            }
        }

        // Return true never happens, they can't summarize to equal values, return false.
        return false;
    }
}
