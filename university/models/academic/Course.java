package university.models.academic;

import university.enums.CourseType;
import university.enums.Language;
import university.models.users.Teacher;

import java.util.*;

public class Course {

    public Course() {

    }
    public int courseId, credits, targetYear;
    public String courseName;
    public CourseType courseType;
    public Language language;
    public Set<Teacher> instructors = new HashSet<>();
    public Set<Lesson> lessons = new HashSet<>();

}