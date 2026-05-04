package university.models.users;

import university.enums.TeacherType;

public class Teacher extends Employee {

    public TeacherType teacherType;

    public Teacher() {
    }

    public void putMark(Student s, double mark) {
        s.addMark(mark);
    }

    public void sendComplaint(Student s) {
        System.out.println("Complaint registered regarding student " + s.username);
    }
}