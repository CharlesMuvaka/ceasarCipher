package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {

    Decrypt decryption = new Decrypt("Charles Muvaka", 3);

    @Test
    public void getUserInput_checksIfThereIsUserInput() {
        assertEquals("Charles Muvaka", decryption.getmUserMessage());
    }

}