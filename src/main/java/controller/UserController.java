package controller;

import dto.UserAddInputData;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import usecase.UserAddUseCase;

public class UserController {
    @Autowired
    private UserAddUseCase addUseCase;

    public void createUser (String name, String roleId) {
        UserRole userRole = convertRole(roleId);
        UserAddInputData inputData = new UserAddInputData(name, userRole);
        addUseCase.handle(inputData);
    }

    private UserRole convertRole(String roleId) {
        switch (roleId) {
            case "admin" : return UserRole.ADMIN;
            case "member" : return UserRole.MEMBER;
            default : throw new RuntimeException();
        }
    }
}
