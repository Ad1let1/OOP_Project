package university.models.academic;

import university.enums.CourseType;
import university.enums.Language;
import university.models.users.Teacher;

import java.util.HashSet;
import java.util.Set;

public class Course {

    public int courseId;
    public int credits;
    public int targetYear;
    public String courseName;
    public CourseType courseType;
    public Language language;
    public Set<Teacher> instructors = new HashSet<>();
    public Set<Lesson> lessons = new HashSet<>();

    public Course() {
    }
}