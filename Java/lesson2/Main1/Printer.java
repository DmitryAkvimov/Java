class URLBuilder {
    public static String buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");
        boolean isFirstParam = !baseURL.contains("?"); // Проверяем, есть ли уже символ "?" в базовом URL

        for (String pair : pairs) {
            String[] keyValue = pair.split("=");

            // Если значение параметра "null", пропускаем этот параметр
            if (keyValue.length < 2 || "null".equals(keyValue[1])) {
                continue;
            }

            // Добавляем разделитель ? для первого параметра, & для остальных
            if (isFirstParam) {
                url.append("?");
                isFirstParam = false;
            } else {
                url.append("&");
            }

            // Добавляем ключ и значение
            url.append(keyValue[0]).append("=").append(keyValue[1]);
        }

        return url.toString();
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String baseURL = "";
        String params = "";
        
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            baseURL = "https://example.com/search?";
            params = "query=java&sort=desc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }

        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));
    }
}
