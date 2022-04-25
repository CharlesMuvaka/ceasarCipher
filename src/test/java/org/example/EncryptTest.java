package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    Encrypt encryption = new Encrypt("Charles Muvaka", 3);

    @Test
    public void getUserInput_checksIfThereIsUserInput() {
        assertEquals("Charles Muvaka", encryption.getmUserMessage());
    }

}