package lesson5.model;

public class Teacher extends User {
    static Integer idGenerator = 0;
    private final int idTeacher;

    public Teacher(String name, Integer birthYear) {
        super(name, birthYear);
        this.idTeacher = idGenerator++;
    }

    @Override
    public String toString() {
        return "teacher " + idTeacher + " " + super.toString();
    }
}
