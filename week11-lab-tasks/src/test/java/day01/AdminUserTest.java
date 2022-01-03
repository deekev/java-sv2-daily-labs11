package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testAdminUser() {

        AdminUser adminUser = new AdminUser("johnD@gmail.com", "Johnny01");

        assertEquals("johnD@gmail.com", adminUser.getUserEmail());
        assertEquals("********", adminUser.getPassword());
    }
}