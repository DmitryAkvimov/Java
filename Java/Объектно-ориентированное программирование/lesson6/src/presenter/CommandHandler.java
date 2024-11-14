package presenter;

import view.PresenterView;

public class CommandHandler {
    private TreePresenter presenter;
    private PresenterView view;

    public CommandHandler(TreePresenter presenter, PresenterView view) {
        this.presenter = presenter;
        this.view = view;
    }

    public void handleUserInput() {
        while (true) {
            view.displayMessage("Enter command (add, list, save, exit):");
            String command = view.getUserInput();
            switch (command) {
                case "add":
                    view.displayMessage("Enter name:");
                    String name = view.getUserInput();
                    view.displayMessage("Enter birth year:");
                    int birthYear = Integer.parseInt(view.getUserInput());
                    presenter.addPerson(name, birthYear);
                    break;
                case "list":
                    presenter.showAllPersons();
                    break;
                case "save":
                    view.displayMessage("Enter file name:");
                    presenter.saveTree(view.getUserInput());
                    break;
                case "exit":
                    return;
                default:
                    view.displayMessage("Unknown command");
            }
        }
    }
}
