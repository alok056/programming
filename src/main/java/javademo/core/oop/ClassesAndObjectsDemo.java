package javademo.core.oop;

public class ClassesAndObjectsDemo {
    public static void main(String[] args) {
        /************************************
         *  Creating objects                *
         ************************************/

        Student s1 = new Student();
        s1.name = "Alok";
        s1.setRollNumber(101);

        Student s2 = new Student();
        s2.setName("Abhishek");
        s2.setRollNumber(102);

        System.out.println(s1.display());
        System.out.println(s2.display());
    }
}

class Student {
    String name;
    private int rollNumber;

    void setName(String name) {
        this.name = name;
    }

    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    int getRollNumber() {
        return rollNumber;
    }

    String display() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}
