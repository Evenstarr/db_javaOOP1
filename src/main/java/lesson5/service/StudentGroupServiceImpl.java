package lesson5.service;

import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;

import java.util.List;

public class StudentGroupServiceImpl implements StudentGroupService{
    static Integer groupID = 0;

    @Override
    public StudentGroup createGroup(List<Student> students, Teacher teacher) {
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.setStudentList(students);
        studentGroup.setTeacher(teacher);
        studentGroup.setGroupID(groupID++);
        return studentGroup;
    }

    @Override
    public void readGroup(StudentGroup group) {
        System.out.println("Группа " + group.getGroupID());
        System.out.println(group.getTeacher());
        for(Student s: group.getStudentList()){
            System.out.println("\t" + s);
        }
        System.out.println();
    }
}
