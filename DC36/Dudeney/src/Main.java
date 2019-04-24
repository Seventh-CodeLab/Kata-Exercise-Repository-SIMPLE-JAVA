import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isDudeney(123456) + "\n"); // Should not be a perfect cube
        System.out.println(isDudeney(97336) + "\n"); // Cube but not dudeney
        System.out.println(isDudeney(19683) + "\n"); // A dudeney
    }

    static boolean isDudeney(int x){

        //First get all the numbers in the given int and separate them for later use.
        int tempx = x;
        ArrayList<Integer> numbers = new ArrayList<>();
        while(tempx != 0){
            numbers.add(tempx % 10);
            tempx /= 10;
        }

        //Go through all perfect cubes up to 100 because why not limit it (can be changed)
        for(int i = 1; i < 100; i++){
            if (Math.pow(i,3) == x){

                //If a match is found check if the numbers of x sum up to the corresponding i
                int numberSum = 0;
                for(int number : numbers){
                    numberSum += number;
                }
                if(numberSum == i){
                    System.out.println("Dudeney found!");
                    return true;
                }

                System.err.println("This number is not a Dudeney because it's numbers do not add up to it's root");
                return false;
            }
        }
        System.err.println("This number is not a perfect cube");
        return false;
    }
}
