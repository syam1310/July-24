package org.july_24.thread;

import java.util.ArrayList;
import java.util.List;

public class School {

    public List<Student> getAllStudent(){
        List<Student> list=new ArrayList<>();
        Address address = new Address(2,3,"adad");
        Student student = new Student();
        student.setName("neeraj");
        student.setAddress(address);
        student.setSchoolName("hndsjknds");
        list.add(student);
       return list;
    }

}
