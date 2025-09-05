package basic.universityQuestion;

import basic.universityQuestion.model.*;

public class UniversityApp {
    public static void main(String[] args) {
        Department cs = new Department("computer Science");

        Professor prof1 = new Professor(("Dr. vivek"));
        cs.addProfessor(prof1); // aggregations

        Course java = new Course("java programming");
        cs.addCourse(java); // composition

        IDCard aliceIcard = new IDCard("pd1234");
        IDCard bobIcard = new IDCard("pd1235");

        Student alice = new Student("Alice", aliceIcard);
        Student bob = new Student("bob", bobIcard);

        alice.enroll(java);
        bob.enroll(java);

        // Print relationships
        System.out.println("Department: " + cs.getName());
        System.out.println("Professors: " + cs.getProfessors().get(0).getName());
        System.out.println("Courses: " + cs.getCourses().get(0).getTitle());
        System.out.println("Students in Java:");
        java.getStudents().forEach(s -> System.out.println(" - " + s.getName()));
        System.out.println("Alice's IDCard: " + alice.getIdCard().getCardNumber());

    }
}
