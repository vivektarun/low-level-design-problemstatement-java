package basic.universityQuestion.model;

// Professor <-> Department (aggregation: professors exists independently)
public class Professor {
    private final String name;
    private Department department;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
