package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private String currentUrl;

    public void visitPage(String url) {
        if (currentUrl != null) {
            history.push(currentUrl);
        }
        currentUrl = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentUrl = history.pop();
            System.out.println("뒤로 가기: " + currentUrl);
            return currentUrl;
        }
        return null;
    }
}
