package org.example;

import java.util.Locale;

public class Decrypt {

    private String mUserMessage;
    private int mUserKey;
    public Decrypt(String userMessage, int key) {
        this.mUserMessage = userMessage;
        this.mUserKey  = key;

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

    public String encryptUserMessage(){

        String myAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder userDecryptedMessage = new StringBuilder();


        String userMessageToBeDecrypted = getmUserMessage().toLowerCase();
        char[] userMessageArray = userMessageToBeDecrypted.toCharArray();
        int userEncryptionKey = getmUserKey();

        if (userEncryptionKey>0 && userEncryptionKey<26){
            for (char c:userMessageArray
            ) {
                if (Character.isLetter(c)){
                    int currentPosition = myAlphabet.indexOf(c);
                    int newIndex = (currentPosition + userEncryptionKey) % 26;
                    char encryptedLetter = myAlphabet.charAt(newIndex);
                    userDecryptedMessage.append(encryptedLetter);
                }else{
                    userDecryptedMessage.append(c);
                }

            }

        }

        return userDecryptedMessage.toString();
    }

}
