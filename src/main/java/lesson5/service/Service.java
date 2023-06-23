package lesson5.service;

import lesson5.model.Student;
import lesson5.model.Teacher;

import java.util.List;

public interface Service {
    //public void create(List<Student> inputList, Teacher teacher);
    public Student addStudent(String name, Integer birthYear);
}
