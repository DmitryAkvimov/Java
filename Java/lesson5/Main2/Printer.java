import java.util.Deque;
import java.util.LinkedList;

class BrowserHistory {
    private Deque<String> history = new LinkedList<>();

    // Добавляет сайт в историю посещений
    public void visitSite(String site) {
        history.addFirst(site);
    }

    // Возвращает название сайта, который был посещен steps назад
    public String back(int steps) {
        if (steps >= history.size()) {
            return null;
        }
        return history.stream().skip(steps).findFirst().orElse(null);
    }

    // Возвращает историю посещений
    public Deque<String> getHistory() {
        return history;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");

        System.out.println(browserHistory.back(1)); // stackoverflow.com
        System.out.println(browserHistory.getHistory()); // [github.com, stackoverflow.com, google.com]
    }
}
