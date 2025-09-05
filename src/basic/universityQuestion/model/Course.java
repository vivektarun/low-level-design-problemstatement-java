package basic.universityQuestion.model;

import java.util.HashSet;
import java.util.Set;

//Course <-> Students (many-many association)
public class Course {
    private final String title;
    private final Set<Student> students = new HashSet<>();

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
