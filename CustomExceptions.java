//CustomExceptions.java

class DuplicateStudentException extends Exception {
    public DuplicateStudentException(String message) {
        super(message);
    }
}
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
