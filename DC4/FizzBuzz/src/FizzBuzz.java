import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(fizzBuzz("fig"));
        System.out.println(fizzBuzz("dib"));
        System.out.println(fizzBuzz("fib"));
        System.out.println("Type a line");
        System.out.println(fizzBuzz(scan.nextLine())); // Will run the same check on the input text
    }

    public static String fizzBuzz(String sampleText){
        //toUpperCase() used to check even capitalized letters.
        if (sampleText.toUpperCase().startsWith("F") && sampleText.toUpperCase().endsWith("B")){
            return "FizzBuzz";
        } else if (sampleText.toUpperCase().startsWith("F")){
            return "Fizz";
        } else if (sampleText.toUpperCase().endsWith("B")){
            return "Buzz";
        } else {
            return sampleText;
        }
    }
}