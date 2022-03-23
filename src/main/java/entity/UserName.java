package entity;

public class UserName {
    private String value;

    public UserName(String value) {
        if (value.length() < 3) throw new RuntimeException();
        if (value.length() > 10) throw new RuntimeException();
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
