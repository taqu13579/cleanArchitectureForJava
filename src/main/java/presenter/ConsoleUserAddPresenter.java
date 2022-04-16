package presenter;

import dto.UserAddOutputData;
import view.ConsoleView;
import view.ConsoleViewModel;

public class ConsoleUserAddPresenter implements UserAddPresenter {
    private ConsoleView consoleView = new ConsoleView();

    @Override
    public void output(UserAddOutputData userAddOutputData) {
        String uuid = userAddOutputData.getCreatedId();
        ConsoleViewModel viewModel = new ConsoleViewModel(uuid);
        consoleView.showCreatedUserId(viewModel);
    }
}
