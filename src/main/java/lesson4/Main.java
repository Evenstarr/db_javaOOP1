package lesson4;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User oneUser = new User("Юзер1", "Юзеров1", "Юзерович1", LocalDate.now());
        User twoUser = new User("АЮзер2", "Юзеров2", "Юзерович2", LocalDate.now());
        User threeUser = new User("Юзер3", "БЮзеров3", "Юзерович3", LocalDate.now());

        TreeSet<User> userTreeSet = new TreeSet<>(new UserComparator<>());
        userTreeSet.add(oneUser);
        userTreeSet.add(twoUser);
        userTreeSet.add(threeUser);

        System.out.println(userTreeSet);

        Teacher Ivanov = new Teacher(2, "Иван", "Иванов",
                "Иванович", LocalDate.now());
        Teacher Petrov = new Teacher(3, "Петр", "Петров",
                "Петрович", LocalDate.now());
        Teacher Sidorov = new Teacher(1, "Сидор", "Сидоров",
                "Сидорович", LocalDate.now());

        TreeSet<Teacher> teacherTreeSet = new TreeSet<>(new TeacherComparator<>());
        teacherTreeSet.add(Ivanov);
        teacherTreeSet.add(Petrov);
        teacherTreeSet.add(Sidorov);

        System.out.println(teacherTreeSet);

        LinkedList<Teacher> tl = new LinkedList<>();
        tl.add(Ivanov);
        tl.add(Petrov);
        tl.add(Sidorov);

        TeacherGroup tg = new TeacherGroup();
        tg.setTeachers(tl);

        System.out.println(tg);

        for (var teacher: tg) {
            System.out.println(teacher);
        }
    }
}

