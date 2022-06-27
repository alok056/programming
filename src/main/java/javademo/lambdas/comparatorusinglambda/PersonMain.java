package main.java.javademo.lambdas.comparatorusinglambda;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

    public static void main(String args[]){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John" , 23 , "USA"));
        persons.add(new Person("Carl" , 23 , "Australia"));
        persons.add(new Person("Amit" , 23 , "India"));
        persons.add(new Person("Vikram" , 23 , "Bhutan"));
        persons.add(new Person("Kane" , 23 , "Brazil"));

        // Calling getPerson() method which will return the List of Person in sorted order.
        List<Person> sortedPersons = PersonService.getPersons(persons);

        System.out.println("Persons after sorting");
        // Printing the name of each person.
        for(Person person : sortedPersons){
            System.out.println("Person Name : " + person.getName());
        }

        // Using Lambda
        List<Person> sortedPersonsUsingLambda = PersonService.getPersonsV2(persons);
        System.out.println("Persons after sorting using lambda");
        // Printing the name of each person.
        for(Person person : sortedPersonsUsingLambda){
            System.out.println("Person Name : " + person.getName());
        }
    }
}
