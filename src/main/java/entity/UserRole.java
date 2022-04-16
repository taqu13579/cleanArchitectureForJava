package entity;

public class UserRole {
    private String value;
    public static UserRole ADMIN;
    public static UserRole MEMBER;

    public UserRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
