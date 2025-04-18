//StudentOperations.java
// StudentOperations.java
import java.util.*;

class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) throws DuplicateStudentException, InvalidCGPAException {
        for (Student s : students) {
            if (s.getPRN() == student.getPRN()) {
                throw new DuplicateStudentException("Student with PRN " + student.getPRN() + " already exists.");
            }
        }

        if (student.getCGPA() < 0.0 || student.getCGPA() > 10.0) {
            throw new InvalidCGPAException("CGPA must be between 0 and 10.");
        }

        students.add(student);
        System.out.println("Student added.");
    }
