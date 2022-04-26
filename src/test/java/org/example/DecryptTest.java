package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {

    Decrypt decryption = new Decrypt("JK", 2);

    @Test
    public void getUserInput_checksIfThereIsUserInput() {
        assertEquals("JK", decryption.getmUserMessage());
    }
    @Test
    public void getUserKey_checksIfThereIsUserKey() {
        assertEquals(2, decryption.getmUserKey());
    }

    @Test
    public void encryptMessage_encryptsUserMessage_return_HI() {

        assertEquals("HI", decryption.decryptMessage());
    }

}