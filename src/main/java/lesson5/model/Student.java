package lesson5.model;

public class Student extends User {
    static Integer idGenerator = 0;
    Integer studenId;

    public Student(String name, Integer birthYear) {
        super(name, birthYear);
        this.studenId = idGenerator++;
    }

    @Override
    public String toString() {
        return studenId + " " + super.toString();
    }
}
