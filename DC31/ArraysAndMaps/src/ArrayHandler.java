import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayHandler {
    //Task A
    public static Map<String,String> makePairs(String[] arr){
        Map<String,String> map = new HashMap<>();
        for(String value : arr){
            map.put(value.substring(0,1),value.substring(value.length()-1));
        }
        return map;
    }

    //Task B
    public static String twoPlusAppend(String[] arr){
        //Builds out a string to return.
        StringBuilder result = new StringBuilder();

        //Will contain one of each unique element
        ArrayList<String> seenList = new ArrayList<>();

        //Will contain the amount of times unique elements are found on the same indexes.
        ArrayList<Integer> seenCounter = new ArrayList<>();

        for(String value : arr){
            //Check first if the value has been found before
            if(seenList.contains(value)){
                //Increase the amount of times a value is seen
                int found = seenCounter.get(seenList.indexOf(value));
                found++;
                seenCounter.set(seenList.indexOf(value),found);
                if(found % 2 == 0){
                    result.append(value);
                }
            } else {
                //Add a new value and assign it 1;
                seenList.add(value);
                seenCounter.add(1);
            }
        }
        return result.toString();
    }

    //Task C
    public static int mirrorMax(int[] arr){
        int mirrorSize = 0; //The returned value

        //For loop section defines the first group
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int[] tempGroup = new int[j-i];
                for (int x = 0; x < tempGroup.length; x++){
                    //Create and write to a group (Used to look for a mirror)
                    tempGroup[x] = arr[i+x];
                }

                //Backwards comparator finds the second group in reverse
                for(int k = arr.length-1; k > 0; k--){
                    for(int l = k; l > 0; l--){
                        int[] tempMirror = new int[tempGroup.length];
                        for (int x = 0; x < tempMirror.length; x++){
                            if(k-x >= 0){
                                tempMirror[x] = arr[k-x];
                            }
                        }

                        // After every loop check if the groups match
                        // The mirror is found in reverse so the values should match
                        if(Arrays.equals(tempGroup,tempMirror)){
                            //Make sure the newly found length is the largest possible
                            if (tempGroup.length > mirrorSize){
                                //If all conditions are met, push out the value to the mirrorsize
                                mirrorSize = tempGroup.length;
                            }
                        }
                    }
                }
            }
        }
        return mirrorSize;
    }

    //Task D
    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        ArrayList<Integer> reveredList = new ArrayList<>();
        for(int i = arr.size()-1; i >= 0; i--){
            reveredList.add(arr.get(i));
        }
        return reveredList;
    }

    //Task E
    public static ArrayList<Double> readGrade (String gradeFileName){
        ArrayList<Double> grades = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(gradeFileName));
            double line;
            while(reader.readLine() != null){
                line = Double.parseDouble(reader.readLine());
                grades.add(line);
            }

        } catch (Exception e){
            System.out.println(e);
        }
        return grades;
    }

    public static double max (ArrayList<Double> arr){
        double highestValue = 0;
        for(double value : arr){
            if(value > highestValue){
                highestValue = value;
            }
        }
        return highestValue;
    }

    public static double min (ArrayList<Double> arr){
        double smallestValue = 9999999; //Placeholder Value
        for(double value : arr){
            if(value < smallestValue){
                smallestValue = value;
            }
        }
        return smallestValue;
    }

    public static double average (ArrayList<Double> arr){
        double total = 0;
        for(double value : arr){
            total+=value;
        }
        double average =  total / arr.size();
        return average;
    }

    public static ArrayList<Double> removeDuplicates (ArrayList<Double> arr){
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).equals(arr.get(i-1))){
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }
}
