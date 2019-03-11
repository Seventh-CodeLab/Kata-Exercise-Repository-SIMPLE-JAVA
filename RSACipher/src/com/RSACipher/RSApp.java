package com.RSACipher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RSApp {
    private JButton Run;
    private JRadioButton EncRadio;
    private JRadioButton DecRadio;
    private JTextField textField1;
    public JPanel panelMain;


    public RSApp() {
        Run.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                if (EncRadio.isSelected()){
                    System.out.println("=== Encryption Mode ===");
                    System.out.println("=== Please provide a plaintext message to Encrypt ===");
                    textField1.setText(RSACipher.Encryption((textField1.getText()),3233, 17));
                } else if (DecRadio.isSelected()){
                    System.out.println("=== Decryption Mode ===");
                    System.out.println("=== Please provide a cipher to Decrypt ===");
                    // Sample: 3000 28 2726 2726 1307 1992 641 2726 2790 2680 2680
                    textField1.setText(RSACipher.Decryption((textField1.getText()),3233,2753).toString());
                } else {
                    textField1.setText("!== No valid option selected ==!");
                }
            }
        });



    }

}
