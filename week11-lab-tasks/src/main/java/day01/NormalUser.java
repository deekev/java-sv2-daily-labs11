package day01;

public class NormalUser implements User {

    private String userEmail;
    private String userPassword;

    public NormalUser(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String getPassword() {
        return userPassword;
    }
}