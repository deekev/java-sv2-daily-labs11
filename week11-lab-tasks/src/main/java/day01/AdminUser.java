package day01;

public class AdminUser extends NormalUser {

    public AdminUser(String userEmail, String userPassword) {
        super(userEmail, userPassword);
    }

    @Override
    public String getPassword() {
        String secreted = "*".repeat(super.getPassword().length());
        return secreted;
    }
}