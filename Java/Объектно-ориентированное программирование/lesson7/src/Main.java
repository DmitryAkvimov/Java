import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook model = new Notebook();
        NotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(model, view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Note\n2. Show Notes for Day\n3. Show Notes for Week\n4. Save Notes\n5. Load Notes\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> presenter.addNote();
                case 2 -> presenter.showNotesForDay();
                case 3 -> presenter.showNotesForWeek();
                case 4 -> presenter.saveNotes();
                case 5 -> presenter.loadNotes();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
