# ExceptionDriven_StudentManager

## Description ##

This project is a menu-driven **Java application** designed for managing student records using the principles of **Object-Oriented Programming (OOP)**. It allows users to perform basic **CRUD (Create, Read, Update, Delete)** operations and integrates **custom exception handling** to ensure robust user input validation and error management.

The application simulates real-world student data handling scenarios, including searching by various criteria, updating records, and managing invalid operations using user-defined exceptions.

## Features ##

1. Add Student – Add a new student to the system with PRN, Name, Branch, Batch, and CGPA.

2. Display All Students – Display details of all stored students.

3. Search Student by PRN – Locate a student using their PRN number.

4. Search Student by Name – Search for a student using their full name.

5. Search Student by Position – Retrieve student details using their index position in the list.

6. Update Student – Update the existing details of a student based on PRN.

7. Delete Student – Remove a student’s record using their PRN.

8. Custom Exception Handling – Uses user-defined exceptions for validation and error handling.


## How to Run the Program ##

1. Clone the Repository  
```bash
git clone https://github.com/vedants27/ExceptionDriven_StudentManager.git
cd ExceptionDriven_StudentManager
```

2. Compile the Java Files:  
```bash
javac Main.java
```

3. Run the Program:  
```bash
java Main
```

## Code Structure ##

```
Student_Data_Entry/
│
├── Main.java                # Menu-driven interface and user input handling
├── Student.java             # Student class with attributes and methods
├── StudentOperations.java   # Handles CRUD operations on student data
├── CustomExceptions.java    # User-defined exception classes
└── README.md                # Project documentation
```

## Methods and Their Descriptions ##

## 1. StudentOperations.java ##  
Contains the core logic for managing student records. It includes methods to add, display, search, update, and delete student data.

- **addStudent(Student student)**: Adds a new student to the list after checking for duplicates and validating CGPA.  
- **displayStudents()**: Displays details of all students in the list.  
- **searchByPRN(long prn)**: Searches for a student using PRN and returns the object.  
- **searchByName(String name)**: Finds and returns a student by name.  
- **searchByPosition(int position)**: Retrieves student at a specific index position.  
- **updateStudent(long prn, ...)**: Updates details for the given PRN.  
- **deleteStudent(long prn)**: Removes the student record based on PRN.

## 2. Student.java ##  
Defines the student entity with attributes and accessor methods.

- **Student(...)**: Constructor to initialize student details.  
- **Getter/Setter methods**: Used for accessing and modifying private attributes.  
- **display()**: Prints student details in a readable format.

## 3. CustomExceptions.java ##  
Contains custom exception classes used for input validation and logical constraints.

- **DuplicateStudentException**: Thrown when a student with the same PRN is added again.  
- **InvalidCGPAException**: Raised when CGPA is out of valid range (0–10).  
- **EmptyFieldException**: Triggered if mandatory fields like name or branch are empty.  
- **StudentNotFoundException**: Used when the student record is not found in any search, update, or delete operation.

## 4. Main.java ##  
The main file that provides a **menu-driven interface** for user interaction and input handling.

- Provides choices to perform operations like add, search, update, display, and delete.  
- Uses try-catch blocks to catch and display user-defined exceptions.  
- Offers clear output and validation prompts to guide the user.

## Example Usage ##

```
Menu:
1. Add Student
2. Display Students
3. Search Student by PRN
4. Search Student by Name
5. Search Student by Position
6. Update Student Details
7. Delete Student
0. Exit
Enter your choice: 1

Enter Name: Vedant
Enter PRN: 143
Enter Branch: AIML
Enter Batch: B3
Enter CGPA: 8.5
Student added.

Enter your choice: 1
Enter Name: Vedant Shitole
Enter PRN: 143
Enter Branch: AIML
Enter Batch: B3
Enter CGPA: 8.5
Error: Student with PRN 143 already exists.
```

---
##  Coding Guidelines Followed ##

- **Modular Design:** Each core functionality (add, update, search, delete, etc.) is implemented as a separate method inside appropriate classes to ensure modularity and maintainability.

- **Object-Oriented Principles:** 
  - **Encapsulation** through private fields and public getters/setters.
  - **Abstraction** by separating logic into multiple classes.
  - **Custom Exception Handling** for robust and clear error management.

- **Exception Handling:** User-defined exceptions are used to manage specific error scenarios such as invalid input, duplicate entries, and missing records.

- **Multi-File Structure:** The code is organized into logically distinct Java files (`Student.java`, `StudentOperations.java`, `CustomExceptions.java`, `Main.java`).

- **Descriptive Comments:** Every class and method contains clear and concise comments explaining its functionality for easier understanding and maintainability.

- **Readable Code Format:** Consistent indentation, naming conventions, and spacing are followed throughout the code to ensure clean readability and professional presentation.


