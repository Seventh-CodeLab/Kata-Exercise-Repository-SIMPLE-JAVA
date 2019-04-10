public class Main {
    public static void main(String[] args) {
        // I set a boolean for printing the table if successfull or not
        VatsyayanaCipher.generateTable("THEQUICKBROWN", "FXJMPSVLAZYDG",true); //Successful Generation
        System.out.println();
        VatsyayanaCipher.generateTable("THIS CIPHER", "WILLNOTWORK",true); //Error: Contains duplicates
        System.out.println();
        VatsyayanaCipher.generateTable("THISWILLNOTWORKEITHER","RIGHT",true); //Error: Different Lengths


        //Generates the sample working table without printing
        String[] table = VatsyayanaCipher.generateTable("THEQUICKBROWN", "FXJMPSVLAZYDG");

        //This method both encrypts AND decrypts a functional generated table.
        System.out.println(VatsyayanaCipher.cipher("MEET AT ELEVEN", table));
        System.out.println(VatsyayanaCipher.cipher("QJJF BF JKJCJG", table));


        //Runs a the method again but this time with an error due to a missing letter in the table
        String[] badTable = VatsyayanaCipher.generateTable("THQUICKBROWN", "FXMPSVLAZYDG"); //Create a table missing E and J
        System.out.println(VatsyayanaCipher.cipher("MEET AT ELEVEN", badTable)); //Try to cipher and decipher
    }
}
