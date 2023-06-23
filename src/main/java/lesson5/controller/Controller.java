package lesson5.controller;

import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;
import lesson5.service.DataServiceImpl;
import lesson5.service.StudentGroupServiceImpl;

import java.util.List;

public class Controller {
    StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl();
    DataServiceImpl dataService = new DataServiceImpl();

    public StudentGroup createGroup(List<Student> studentList, Teacher teacher) {
        return studentGroupServiceImpl.createGroup(studentList, teacher);
    }

    public Student addStudent(String name, Integer birthYear){
        return this.dataService.addStudent(name, birthYear);
    }
    public void read(StudentGroup group) {
        studentGroupServiceImpl.readGroup(group);
    }
}
