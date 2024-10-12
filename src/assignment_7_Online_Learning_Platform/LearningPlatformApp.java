package assignment_7_Online_Learning_Platform;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addLecture(new ProxyVideoLecture("Introduction to Java"));
        course.addLecture(new ProxyVideoLecture("Advanced Python Techniques"));
        course.addLecture(new ProxyVideoLecture("Design Patterns in Java"));

        course.showCourseInfo();

        course.playLecture(0);

        course.playLecture(2);
    }
}

