public class Main {
    public static void main(String[] args) {
        printDiamond("SAMPLE");
        printDiamond("ZX");
        printDiamond("ACCESSIBILITIES"); //15 letters, should cut at ACCESSIBIL
    }

    static void printDiamond(String input){
        if(input.length() > 11){ input = input.substring(0,10); } //Ensures the 10 letter limit

        //Result array
        char[][] output = new char[input.length()*2][input.length()*2];


        int center = output.length/2;
        String tempString = input.substring(0,1); //Pick out the substring
        boolean expanding = true; //Used to reverse the pyramid shape to a Diamond

        //Iterate through the array rows
        for(int i = 0; i < output.length;i++){
            int tempChar = 0; //Used to point character in the temporary substring
            boolean incChar = true; //Used to reverse the string after coming halfway
            for(int j = 0; j < output[i].length; j++){ //Iterate through row values
                if(j > center - tempString.length() && j < center + tempString.length()){
                    output[i][j] = tempString.charAt(tempChar); //Put a character where it belongs

                    //Reverse the order going back
                    if(tempChar == tempString.length()-1){ incChar = false; }
                    if (incChar){
                        tempChar += 1;
                    } else {
                        tempChar -= 1;
                    }

                } else {
                    output[i][j] = 32; //Insert a space to achieve diamond shape
                }
            }

            //Reverses the pyramid to diamond
            if(tempString.equals(input)){ expanding = false; }

            if(expanding){ //Top pyramid
                tempString = input.substring(0,tempString.length()+1);
            } else { //Bottom reverse pyramid
                if(tempString.length() == 1){ break; }
                tempString = input.substring(0,tempString.length()-1);
            }
        }

        //Print the Diamond shaped output array
        for(int i = 0; i < output.length; i++){
            System.out.println();
            for(int j = 0; j < output.length; j++){
                System.out.print(output[i][j]);
            }
        }
    }
}
