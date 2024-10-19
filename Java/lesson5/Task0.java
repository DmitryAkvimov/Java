package lesson5;

import java.util.Map;
import java.util.TreeMap;

public class Task0 {
    private static final Map<Integer, String> passportToName = new TreeMap<>();

    public static void run() {
        Map<Integer, String> pasToName =
                Map.of(
                        123456, "Иванов",
                        321456 , "Васильев",
                        234561 , "Петрова",
                        234432 , "Иванов",
                        654321 , "Петрова",
                        345678 , "Иванов",
                        8, "8"
                );


//        System.out.println(pasToName);

        passportToName.put(123456, "Иванов");
        passportToName.put(321456 , "Васильев");
        passportToName.put(234561 , "Петрова");
        passportToName.put(234432 , "Иванов");
        passportToName.put(654321 , "Петрова");
        passportToName.put(345678 , "Иванов");


        passportToName.remove(123456);
        System.out.println(  passportToName.values());
        passportToName.get(123456);
        passportToName.keySet();

        for(Map.Entry<Integer, String> entry : passportToName.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry);
            }
        }
    }
}
