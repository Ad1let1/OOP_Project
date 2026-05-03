package university.models.users;

import university.enums.TeacherType;

public class Teacher extends Employee {
    public Teacher() {
    }
    public TeacherType teacherType;
    public void putMark(Student s, double mark) {
        s.addMark(mark);
    }

    public void sendComplaint(Student s) {
        System.out.println("Complaint registered regarding student " + s.username);
    }

}