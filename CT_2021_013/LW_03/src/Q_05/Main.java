package Q_05;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Dr. K7", "Computing Technology");
        Course course = new Course("Object Oriented Programming", "CTEC 22043", lecturer);
        Student student = new Student("Pulasthi Ranabahu", "Bachelor of Information Technology", "CTEC 22043");
        System.out.println("Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Student: " + student.getStudentName() + ", Degree: " + student.getDegreeName() + ", Course: " + student.getCourseFollowing());
    }
}