package lesson6;

import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getTeacherId().compareTo(o2.getTeacherId());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
