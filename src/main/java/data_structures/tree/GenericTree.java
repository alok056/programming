package data_structures.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private int rating;
    private List<Employee> subOrdinates;
}

public class GenericTree {
    public static void main(String[] args) {
        Employee alok = new Employee(1, "Alok", 9, new ArrayList<>());

        Employee a  = new Employee(1, "A", 9, new ArrayList<>());
        Employee b = new Employee(1, "B", 9, new ArrayList<>());
        Employee c = new Employee(1, "C", 9, new ArrayList<>());
        Employee d = new Employee(1, "D", 9, new ArrayList<>());


        List<Employee> eSubOrdinates = new ArrayList<>();
        eSubOrdinates.add(a);
        eSubOrdinates.add(b);
        eSubOrdinates.add(c);
        eSubOrdinates.add(d);

        Employee e = new Employee(1, "E", 9, eSubOrdinates);

        Employee f = new Employee(1, "F", 9, new ArrayList<>());
    }
}
