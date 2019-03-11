package com.RSACipher;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.Scanner;

//This is a sample encryption/decryption calculation program that will encrypt and decrypt plaintext/cipher using
//a preset public/private key setup.

// I did this to work on both Java programming and Information Securty at the same time. I do NOT intend for this to ever be used in production.

public class Main {
    public static int publicKeyn = 3233; // Modulo Public Key for both En/Decryption
    public static int publicKeye = 17; //used to encrypt Plaintext
    public static int privateKeyd = 2753; //used to decrypt Ciphers

    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("=== RSA Sample Encryption/Decryption ===");
        System.out.println("Do you want to Encrypt or Decrypt? (E/D)");
        String encOrDec = scan.nextLine();


        if (encOrDec.toUpperCase().startsWith("E")){
            System.out.println("=== Encryption Mode ===");
            System.out.println("=== Please provide a plaintext message to Encrypt ===");
            System.out.println(RSACipher.Encryption((textBox.getString()),publicKeyn, publicKeye));
        } else if (encOrDec.toUpperCase().startsWith("D")){
            System.out.println("=== Decryption Mode ===");
            System.out.println("=== Please provide a cipher to Decrypt ===");
            // Sample: 3000 28 2726 2726 1307 1992 641 2726 2790 2680 2680
            textBox.setString(RSACipher.Decryption((textBox.getString()),publicKeyn,privateKeyd).toString());
        } else
        */
        //main(null);

        JFrame frame = new JFrame("RSApp");
        frame.setContentPane(new RSApp().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}



