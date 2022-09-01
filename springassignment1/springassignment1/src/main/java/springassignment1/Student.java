package springassignment1;

import java.util.List;

public class Student
{

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student(Address address, int id, String name) {
        this.id = id;
        this.name = name;
        this.add = address;
    }
}

