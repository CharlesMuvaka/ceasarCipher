package org.example;

public class Encrypt {
    private int mKey;
    private String mUserMessage;
    public Encrypt(String userMessage, int key) {
        this.mUserMessage = userMessage;
        this.mKey = key;

    }

    public int getmKey() {
        return mKey;
    }

    public void setmKey(int mKey) {
        this.mKey = mKey;
    }

    public String getmUserMessage() {
        return mUserMessage;
    }

    public void setmUserMessage(String mUserMessage) {
        this.mUserMessage = mUserMessage;
    }

    public String encryptUserMessage(){

        String myAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder userEncryptedMessage = new StringBuilder();


        String userMessageToBeEncrypted = getmUserMessage().toUpperCase();
        char[] userMessageArray = userMessageToBeEncrypted.toCharArray();
        int userEncryptionKey = getmKey();

        if (userEncryptionKey>0 && userEncryptionKey<26){
            for (char c:userMessageArray
            ) {
                if (Character.isLetter(c)){
                    int currentPosition = myAlphabet.indexOf(c);
                    int newIndex = (currentPosition + userEncryptionKey) % 26;
                    char encryptedLetter = myAlphabet.charAt(newIndex);
                    userEncryptedMessage.append(encryptedLetter);
                }else{
                    userEncryptedMessage.append(c);
                }

            }

        }

        return userEncryptedMessage.toString();
    }
}
