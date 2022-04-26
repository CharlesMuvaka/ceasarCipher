package org.example;


import java.util.concurrent.SynchronousQueue;

public class Decrypt {

    private String mUserMessage;
    private int mUserKey;

    public Decrypt(String userMessage, int key) {
        this.mUserMessage = userMessage;
        this.mUserKey = key;

    }

    public String getmUserMessage() {
        return mUserMessage;
    }

    public void setmUserMessage(String mUserMessage) {
        this.mUserMessage = mUserMessage;
    }

    public int getmUserKey() {
        return mUserKey;
    }

    public void setmUserKey(int mUserKey) {
        this.mUserKey = mUserKey;
    }


    public String decryptMessage() {

        String myAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder decryptedUserMessage = new StringBuilder();

        char[] userEncryptedMessage = getmUserMessage().toCharArray();

        for (char d : userEncryptedMessage
        ) {
            int currentPosition = myAlphabet.indexOf(d);
            int key = getmUserKey();

            if (Character.isAlphabetic(d)) {
                if (currentPosition != -1) {
                    int newIndex = (currentPosition - key) % 26;
                    char decryptedCharacter = myAlphabet.charAt(newIndex);
                    decryptedUserMessage.append(decryptedCharacter);
                }else{
                    int newIndex = (currentPosition - key) + 26;
                    char decryptedCharacter = myAlphabet.charAt(newIndex);
                    decryptedUserMessage.append(decryptedCharacter);

                }
            }else{
                decryptedUserMessage.append(d);
            }
        }

        return decryptedUserMessage.toString();
    }
}