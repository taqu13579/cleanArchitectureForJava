package entity;

public class User {
    private UserId userId;
    private UserName userName;
    private UserRole userRole;

    public User(UserId userId, UserName userName, UserRole userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
    }

    public UserId getUserId() {
        return userId;
    }

    public UserName getUserName() {
        return userName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void changeName(UserName userName) {
        this.userName = userName;
    }
}
