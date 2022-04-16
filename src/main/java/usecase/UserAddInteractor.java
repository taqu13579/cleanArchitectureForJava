package usecase;

import dto.UserAddInputData;
import dto.UserAddOutputData;
import entity.User;
import entity.UserId;
import entity.UserName;
import org.springframework.beans.factory.annotation.Autowired;
import presenter.UserAddPresenter;
import repository.UserRepository;

import java.util.UUID;

public class UserAddInteractor implements UserAddUseCase {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAddPresenter userAddPresenter;

    @Override
    public void handle(UserAddInputData inputData) {
        String uuid = UUID.randomUUID().toString();

        User user = new User(
                new UserId(uuid),
                new UserName(inputData.getUserName()),
                inputData.getUserRole()
        );

        userRepository.save(user);

        UserAddOutputData userAddOutputData = new UserAddOutputData(uuid);
        userAddPresenter.output(userAddOutputData);
    }
}
