package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testNormalUser() {
        NormalUser normalUser = new NormalUser("johnD@gmail.com", "Johnny01");

        assertEquals("johnD@gmail.com", normalUser.getUserEmail());
        assertEquals("Johnny01", normalUser.getPassword());
    }
}