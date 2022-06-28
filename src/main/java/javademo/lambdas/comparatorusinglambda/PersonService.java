package javademo.lambdas.comparatorusinglambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    public static List<Person> getPersons(List<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        return persons;
    }

    public static List<Person> getPersonsV2(List<Person> persons) {
        // Comparator<Person> personComparator = (p1, p2) -> p2.getName().compareTo(p1.getName());
        // Collections.sort(persons, personComparator);

        Collections.sort(persons, (p1, p2) -> p2.getName().compareTo(p1.getName()));

        return persons;
    }
}
