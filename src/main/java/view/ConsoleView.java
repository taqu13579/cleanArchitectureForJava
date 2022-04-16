package view;

public class ConsoleView {
    public void showCreatedUserId(ConsoleViewModel viewModel) {
        System.out.println("User created");
        System.out.println("UserId:" + viewModel.getUuid());
    }
}
