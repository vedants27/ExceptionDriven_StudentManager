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
class InvalidCGPAException extends Exception {
    public InvalidCGPAException(String message) {
        super(message);
    }
}
class EmptyFieldException extends Exception {
    public EmptyFieldException(String message) {
        super(message);
    }
}
