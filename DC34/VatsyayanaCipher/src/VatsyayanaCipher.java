public class VatsyayanaCipher {
    public static String[] generateTable(String keyStr1, String keyStr2, Boolean print){
        //Always set keys to caps for consistency
        keyStr1 = keyStr1.toUpperCase();
        keyStr2 = keyStr2.toUpperCase();

        //Check for duplicate keys
        if(keyStr1.length() != keyStr2.length()){
            System.err.println("ERROR: Key Strings are not of equal lengths.");
        } else {
            boolean errFound = false;
            for (int i = 0; i < keyStr1.length(); i++) {
                for (int j = 0; j < keyStr2.length(); j++) {
                    char a1 = keyStr1.charAt(i);
                    char a2 = keyStr1.charAt(j);
                    char b1 = keyStr2.charAt(i);
                    char b2 = keyStr2.charAt(j);

                    //Checks for multiple instances of a key in both strings
                    if(a1 == b2){
                        System.err.println("ERROR: A key is used multiple times: '" + a1 + "' is found in both keystrings.");
                        errFound = true;
                    }

                    if (i == j){ continue; } // Ignore the current value when checking one string

                    //Checks for multiple instances of a key in one string
                    if (a1 == a2) {
                        System.err.println("ERROR: A key is used multiple times: '" + a1 + "' is found multiple times in keystring: \"" + keyStr1 +"\"");
                        errFound = true;
                    }
                    if (b1 == b2) {
                        System.err.println("ERROR: A key is used multiple times: '" + b1 + "' is found multiple times in keystring: \"" + keyStr2 +"\"");
                        errFound = true;
                    }
                }
            }
            //Prints out the table if requested and boolean se
            if (!errFound && print){
                System.out.println("== Vatsyayana Cipher Table Successfully Generated ==");
                for(int i = 0; i < keyStr1.length(); i++){
                    System.out.println(keyStr1.charAt(i) + " = " + keyStr2.charAt(i));
                }
            }
        }
        return new String[]{keyStr1,keyStr2};
    }

    //Overloaded version of generate table that does not print
    public static String[] generateTable(String keyStr1, String keyStr2){
        keyStr1 = keyStr1.toUpperCase();
        keyStr2 = keyStr2.toUpperCase();
        if(keyStr1.length() != keyStr2.length()){
            System.err.println("ERROR: Key Strings are not of equal lengths.");
        } else {
            for (int i = 0; i < keyStr1.length(); i++) {
                for (int j = 0; j < keyStr2.length(); j++) {
                    char a1 = keyStr1.charAt(i);
                    char a2 = keyStr1.charAt(j);
                    char b1 = keyStr2.charAt(i);
                    char b2 = keyStr2.charAt(j);
                    if(a1 == b2){
                        System.err.println("ERROR: A key is used multiple times: '" + a1 + "' is found in both keystrings.");
                    }
                    if (i == j){ continue; }
                    if (a1 == a2) {
                        System.err.println("ERROR: A key is used multiple times: '" + a1 + "' is found multiple times in keystring: \"" + keyStr1 +"\"");
                    }
                    if (b1 == b2) {
                        System.err.println("ERROR: A key is used multiple times: '" + b1 + "' is found multiple times in keystring: \"" + keyStr2 +"\"");
                    }
                }
            }
        }
        return new String[]{keyStr1,keyStr2};
    }


    //Method for encrypting and decrypting - Works both ways.
    public static String cipher(String input, String[] cipher){
        //Set input to uppercase for consistency
        input = input.toUpperCase();

        StringBuilder output = new StringBuilder();

        //For every letter in the input
        for(int i = 0; i < input.length();i++) {
            //Ignore spaces and make sure the substituion table actually contains the letter
            if (input.charAt(i) != ' ' && (cipher[0].contains(input.substring(i, i + 1)) || cipher[1].contains(input.substring(i, i + 1)))) {
                //Find the current input letter in the cipher table
                for (int x = 0; x < cipher[0].length(); x++) {
                    char a = cipher[0].charAt(x);
                    char b = cipher[1].charAt(x);

                    //If it finds a match
                    if (input.charAt(i) == a || input.charAt(i) == b) {
                        //Determine which side of the table the match is on, and append the opposite
                        if (input.charAt(i) == a) {
                            output.append(b);
                        } else if (input.charAt(i) == b) {
                            output.append(a);
                        }
                    }
                } //Give out an error if the letter is not defined in the table.
            } else if (input.charAt(i) != ' ' && (!cipher[0].contains(input.substring(i, i + 1)) || !cipher[1].contains(input.substring(i, i + 1)))){
                System.err.println("ERROR: Key does not exist in ciphertable: '" + input.charAt(i) +"'");
                output.append(input.charAt(i)); //Appends it anyway, but without changing it.
            } else {
                output.append(input.charAt(i)); //Add spaces
            }
        }
        //Return the encrypted/decrypted text
        return output.toString();
    }
}
