package three;


import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private int roomNumber;
    private String teacherName;
    private String teacherPhoneNumber;
    private List<String> studentNames;
    private int studentCount;

    public ClassRoom(int roomNumber, String teacherName, String teacherPhoneNumber) {
        this.roomNumber = roomNumber;
        this.teacherName = teacherName;
        this.teacherPhoneNumber = teacherPhoneNumber;
        this.studentNames = new ArrayList<>();
        this.studentCount = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudent(String studentName) {
        studentNames.add(studentName);
        studentCount++;
    }

    public void displayClassInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Teacher Phone Number: " + teacherPhoneNumber);
        System.out.println("Student Names: " + studentNames);
        System.out.println("Student Count: " + studentCount);
    }
}
