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
}
