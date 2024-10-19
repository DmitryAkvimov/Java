package gb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator<Map.Entry<String, ArrayList<String>>> {
    @Override
    public int compare(Map.Entry<String, ArrayList<String>> o1,
                       Map.Entry<String, ArrayList<String>> o2) {
        return Integer.compare(o2.getValue().size(), o1.getValue().size());

//        if (o1.getValue().size() > o2.getValue().size()) return -1;
//        if (o1.getValue().size() < o2.getValue().size()) return 1;
//        else return 0;
    }
}
