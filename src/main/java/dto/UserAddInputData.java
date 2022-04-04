package dto;

import entity.UserRole;

public class UserAddInputData implements InputData<UserAddOutputData> {
    private final String userName;
    private final UserRole userRole;

    public UserAddInputData(String userName, UserRole userRole) {
        this.userName = userName;
        this.userRole = userRole;
    }

    public String getUserName() { return this.userName; }
    public UserRole getUserRole() { return this.userRole; }
}
