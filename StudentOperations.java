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
        public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                student.display();
            }
        }
    }
    public Student searchByPRN(long prn) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
        public Student searchByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name " + name + " not found.");
    }
        public Student searchByPosition(int position) throws StudentNotFoundException {
        if (position >= 0 && position < students.size()) {
            return students.get(position);
        } else {
            throw new StudentNotFoundException("Invalid position: " + position);
        }
    }
        public void updateStudent(long prn, String name, String branch, String batch, double cgpa) throws StudentNotFoundException, InvalidCGPAException {
        Student student = searchByPRN(prn);

        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new InvalidCGPAException("Invalid CGPA. It must be between 0 and 10.");
        }

        student.setName(name);
        student.setBranch(branch);
        student.setBatch(batch);
        student.setCGPA(cgpa);
        System.out.println("Student details updated.");
    }
        public void deleteStudent(long prn) throws StudentNotFoundException {
        Student student = searchByPRN(prn);
        students.remove(student);
        System.out.println("Student removed successfully.");
    }
}





