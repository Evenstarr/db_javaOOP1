package lesson5;

import lesson5.controller.Controller;
import lesson5.model.Disciples;
import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Teacher teacher0 = new Teacher("Teacher0", 1900);
        Student ivanov = new Student("Иванов Иван Иванович",1999);
        Student petrov = new Student("Петров Петр Петрович", 1998);
        Student sidorov = new Student("Сидоров Сидор Сидорович", 1997);
        List<Student> gr1 = new ArrayList<>(Arrays.asList(ivanov,petrov,sidorov));

        Teacher teacher1 = new Teacher("Teacher1", 1901);
        Student nikitin = new Student("Никитин Никита Никитич", 1990);
        Student andreev = new Student("Андреев Андрей Андреевич", 1989);
        Student kirillov = new Student("Кириллов Кирилл Кириллович", 1987);
        List<Student> gr2 = new ArrayList<>(Arrays.asList(nikitin, andreev, kirillov));

        StudentGroup group1 = controller.createGroup(gr1, teacher0);
        controller.read(group1);

        StudentGroup group2 = controller.createGroup(gr2, teacher1);
        controller.read(group2);
    }
}
