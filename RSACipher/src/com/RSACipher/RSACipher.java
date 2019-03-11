package com.RSACipher;

import java.math.BigInteger;

public class RSACipher {
    // Encryption Function
    public static String Encryption(String message, int n, int e){
        int[] encryptedMessage = new int [message.length()];
        String encryptionResult = "";
        for (int i = 0; i < message.length(); i++){
            int charToAscii = (int) message.charAt(i);
            BigInteger charBI = BigInteger.valueOf(charToAscii); //Base for Exp(keyeBI)
            BigInteger keyeBI = BigInteger.valueOf(e); //Exponent for CharBI
            BigInteger keynBI = BigInteger.valueOf(n); //Modulo
            BigInteger totalPower = charBI.modPow(keyeBI, keynBI); //CharBI^keyeBI % keynBI
            encryptedMessage[i] =  totalPower.intValue();
        }
        for (int j = 0; j < encryptedMessage.length; j++){
            encryptionResult += String.valueOf(encryptedMessage[j]);
            encryptionResult += " ";
        }
        System.out.println("=== Your encrypted cypher is: ===");
        return encryptionResult;
    }

    //Decryption function
    public static StringBuilder Decryption(String cipherCode, int n, int d){
        String[] cipherArr = cipherCode.split(" "); // Split code into array on spaces
        int arrLength = cipherArr.length;
        int[] cipherIntArr = new int [arrLength]; // Convert string array into ints next For Loop
        long[] decipherIntArr = new long[arrLength];
        StringBuilder sb = new StringBuilder(cipherArr.length);
        for (int i = 0; i <  cipherArr.length; i++){
            cipherIntArr[i] = Integer.parseInt(cipherArr[i]);
            int decipherValue = cipherIntArr[i];
            BigInteger cipherInt = BigInteger.valueOf(decipherValue); //Base for exp(privateKeyd)
            BigInteger keydBI = BigInteger.valueOf(d); //Exponent for cipherInt
            BigInteger keynBI = BigInteger.valueOf(n); // Modulo
            BigInteger decryptPower = cipherInt.modPow(keydBI,keynBI); //CipherInt^keydBI % keynBI
            decipherIntArr[i] = decryptPower.intValue();
            sb.append((char) decipherIntArr[i]);
        }
        System.out.println("=== Your decrypted plaintext is: ===");
        return sb;
    }

}


