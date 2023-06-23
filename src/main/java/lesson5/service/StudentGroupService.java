package lesson5.service;

import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;

import java.util.List;

public interface StudentGroupService {
    public StudentGroup createGroup(List<Student> students, Teacher teacher);
    public void readGroup(StudentGroup group);
}
