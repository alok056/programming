import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(8);
        list.add(6);
        list.add(0);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(-1);
        list.add(6);
        
        System.out.println(minimumGroups(list));
    }


    public static int minimumGroups(List<Integer> predators) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i=0; i < predators.size(); i++) {
            if (predators.get(i) == -1) {
                list.add(i);
            } else {
                List<Integer> l = new ArrayList<>();
                if (map.containsKey(predators.get(i))) {
                    l = map.get(predators.get(i));
                }

                l.add(i);
                map.put(predators.get(i), l);
            }
        }

        int level = 0;
        while(!list.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();

            for (Integer listItem: list) {
                List<Integer> list2 = map.get(listItem);
                if (list2 != null) {
                    tempList.addAll(list2);
                }
            }

            list = tempList;
            level++;
        }

        return level;
    }
}
