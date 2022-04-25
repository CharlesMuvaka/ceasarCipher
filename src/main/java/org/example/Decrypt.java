package org.example;

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
}
