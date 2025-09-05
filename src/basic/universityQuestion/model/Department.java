package basic.universityQuestion.model;

import java.util.ArrayList;
import java.util.List;

//Department <-> Professors (aggregation: 1:N)
//Department <-> Courses (Composition: if dept closes, courses close)
public class Department {
    private final String name;
    private final List<Professor> professors = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
        professor.setDepartment(this);// aggregation link
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
