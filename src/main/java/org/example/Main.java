package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myTerminal = new Scanner(System.in);
        boolean stopRunning = true;

        while (stopRunning){

            System.out.println("Welcome to Caesar Cipher");
            System.out.println("Please Select Between Encrypt, Decrypt or Exit");
            String userMessage = myTerminal.nextLine();

            if (userMessage.equals("Encrypt")) {
                System.out.println("---------------------------------------------------");
                System.out.println("Enter Message to be Encrypted");
                String userText = myTerminal.nextLine();

                System.out.println("Enter a number between 1 and 25");
                int key = Integer.parseInt(myTerminal.nextLine());

                if (key > 0 && key < 25) {

                    Encrypt encryptUserMessage = new Encrypt(userText, key);
                    encryptUserMessage.setmUserMessage(userText);
                    encryptUserMessage.setmKey(key);

                    System.out.println("Your Encryption Message is " + encryptUserMessage.encryptUserMessage());

                }
            }

            else if (userMessage.equals("Decrypt")) {
                System.out.println("---------------------------------------------------");
                System.out.println("Enter Message to be Decrypted");
                String userText = myTerminal.nextLine();

                System.out.println("Enter a number between 1 and 25");
                int key = Integer.parseInt(myTerminal.nextLine());

                if (key > 0 && key < 25) {

                    Decrypt encryptUserMessage = new Decrypt(userText, key);
                    encryptUserMessage.setmUserMessage(userText);
                    encryptUserMessage.setmUserKey(key);

                    System.out.println("Your Encryption Message is " + encryptUserMessage.decryptMessage());

                }
            }else if (userMessage.equals("Exit")){
                stopRunning = false;
            }else{
                System.out.println("Please check on your spelling and repeat");
            }
        }
    }
}