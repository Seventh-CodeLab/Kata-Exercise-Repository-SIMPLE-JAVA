import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(5,10)));
        System.out.println(Arrays.toString(fizzArray(3,4)));
        System.out.println(Arrays.toString(fizzArray(1,11)));
        System.out.println(Arrays.toString(fizzArray(50,100)));
    }

    public static int[] fizzArray(int start,int end){
        int[] output = new int[end - start];
        for (int i = 0; i < output.length; i++){
            output[i] = i + start;
        }
        return output;
    }
}
