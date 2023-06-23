package lesson5.service;

import lesson5.model.Student;
import lesson5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements Service {
    List<Student> studentList;

    public DataServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public Student addStudent(String name, Integer birthYear) {
        return new Student(name, birthYear);
    }
}
