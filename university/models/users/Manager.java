package university.models.users;

import university.enums.ManagerType;
import university.models.academic.Course;

public class Manager extends Employee {

    public Manager() {
    }

    public ManagerType managerType;

    public void assignCourse(Course course, Teacher teacher) {
        course.instructors.add(teacher);
    }

    public void approveRegistration(Student student, Course course) {
        student.courses.add(course);
    }

}