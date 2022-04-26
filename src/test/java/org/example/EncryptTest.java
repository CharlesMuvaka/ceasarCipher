package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    Encrypt encryption = new Encrypt("Hi", 2);


    @Test
    public void getUserInput_checksIfThereIsUserInput() {
        assertEquals("Hi", encryption.getmUserMessage());
    }

    @Test
    public void encryptMessage_encryptsUserMessage_return_JK() {

        assertEquals("JK", encryption.encryptUserMessage());
    }
}

