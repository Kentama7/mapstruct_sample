package object_factory;

import dto.Student;

public class StudentFactory {

    public Student createStudent() {
        Student student = new Student();
        student.setAddress("STUDENT_FACTORY");
        return student;
    }
}
