import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Below is code with preset values instead of console input
        /*
        * //I set a boolean for printing the table if successfull or not
        * VatsyayanaCipher.generateTable("THEQUICKBROWN", "FXJMPSVLAZYDG",true); //Successful Generation
        * System.out.println();
        * VatsyayanaCipher.generateTable("THIS CIPHER", "WILLNOTWORK",true); //Error: Contains duplicates
        * System.out.println();
        * VatsyayanaCipher.generateTable("THISWILLNOTWORKEITHER","RIGHT",true); //Error: Different Lengths
        *
        *
        * //Generates the sample working table without printing
        * String[] table = VatsyayanaCipher.generateTable("THEQUICKBROWN", "FXJMPSVLAZYDG");
        *
        * //This method both encrypts AND decrypts a functional generated table.
        * System.out.println(VatsyayanaCipher.cipher("MEET AT ELEVEN", table));
        * System.out.println(VatsyayanaCipher.cipher("QJJF BF JKJCJG", table));
        *
        *
        * //Runs a the method again but this time with an error due to a missing letter in the table
        * String[] badTable = VatsyayanaCipher.generateTable("THQUICKBROWN", "FXMPSVLAZYDG"); //Create a table missing E and J
        * System.out.println(VatsyayanaCipher.cipher("MEET AT ELEVEN", badTable)); //Try to cipher and decipher
        */

        String[] table = inTable();
        VatsyayanaCipher.generateTable(table[0],table[1],printIt());
        System.out.println(VatsyayanaCipher.cipher(input(),table));

    }

    private static String input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("== Input the text you want to encrypt ==");
        return scan.nextLine();
    }

    private static String[] inTable(){
        Scanner scan = new Scanner(System.in);
        System.out.println("== Input first key string ==");
        String key1 = scan.nextLine();
        System.out.println("== Input second key string ==");
        String key2 = scan.nextLine();
        return new String[]{key1,key2};
    }

    private static boolean printIt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("== Do you want to print the table? true/false ==");
        return scan.nextBoolean();
    }
}
