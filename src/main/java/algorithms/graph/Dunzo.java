package algorithms.graph;

import java.util.*;
import java.util.stream.Collectors;

public class Dunzo {

    public List<String> getAllPlaces(List<String> input, Map<String, TreeNode> map) {
        List<String> answer = new ArrayList<>();

        for (String place: input) {
            if (!map.containsKey(place)) {
                continue;
            }

            for (TreeNode node: map.get(place).getPlaces()) {
                answer.add(node.getName());
                List<String> childs = new ArrayList<>();
                for (TreeNode childNode: node.getPlaces()) {
                    childs.add(childNode.getName());
                }

                answer.addAll(getAllPlaces(childs, map));
            }
        }

        return answer;
    }

    public List<String> getAllPlaces(TreeSet<String> rootSet, Map<String, TreeNode> map) {
        Iterator<String> iterator = rootSet.iterator();

        List<String> answer = new ArrayList<>();

        for (String root: rootSet) {
            List<TreeNode> childs = map.get(root).getPlaces();
            answer.addAll(childs.stream().map(treeNode -> treeNode.getName().toString()).collect(Collectors.toList()));
            answer.add(null);

            rootSet.remove(root);
            answer.addAll(getAllPlaces(rootSet, map));
        }

        answer.add(null);

        return answer;
    }

    public static List<String> getAllPacesWhichAreNotEnlosed(TreeSet<String> rootSet) {
        Iterator<String> iterator = rootSet.iterator();
        List<String> answer = new ArrayList<>();
        while (iterator.hasNext()) {
            answer.add(iterator.next());
        }

        return answer;
    }

    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("Panipat", "Haryana");
        input.put("Gurgaon", "Haryana");
        input.put("Mumbai", "Maharashtra");
        input.put("Bangalore", "Karnataka");
        input.put("Karnataka", "India");
        input.put("Haryana", "India");

        Map<String, TreeNode> map = new HashMap<>();
        TreeSet<String> rootSet = new TreeSet<>();
        Iterator<Map.Entry<String, String>> iterator = input.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String place1 = entry.getKey();
            String place2 = entry.getValue();

            TreeNode parentNode;
            TreeNode childNode;
            if (map.containsKey(place1)) {
                childNode = map.get(place1);
            } else {
                childNode = new TreeNode(place1, new ArrayList<>());
                map.put(place1, childNode);
            }

            if (map.containsKey(place2)) {
                parentNode = map.get(place2);
            } else {
                parentNode = new TreeNode(place2, new ArrayList<>());
                map.put(place2, parentNode);
            }

            List<TreeNode> childs = parentNode.getPlaces();
            childs.add(childNode);

            parentNode.setPlaces(childs); // Not sure if this lines required

            rootSet.add(place1);

            System.out.println("Place1: " + place1 + ", Place2: " + place2);
            System.out.println(rootSet);
        }

//        System.out.println(getAllPacesWhichAreNotEnlosed(rootSet));
     }
}

class TreeNode {
    private String name;
    private List<TreeNode> places;

    public TreeNode (String name, List<TreeNode> places) {
        this.name = name;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeNode> getPlaces() {
        return places;
    }

    public void setPlaces(List<TreeNode> places) {
        this.places = places;
    }
}
