package basic.universityQuestion.model;

import java.util.HashSet;
import java.util.Set;

//Student has-a IDCard (composition) -> idcard can't existes without student
//Student <-> course (many-many association) -> just a link
public class Student {
    private final String name;
    private final IDCard idCard; // 1:1 relationship
    private final Set<Course> courses = new HashSet<>();

    public Student(String name, IDCard idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }
}
