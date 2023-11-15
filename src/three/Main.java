package three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();

        System.out.print("Enter Teacher Phone Number: ");
        String teacherPhoneNumber = scanner.nextLine();

        ClassRoom classRoom = new ClassRoom(roomNumber, teacherName, teacherPhoneNumber);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter Student Name #" + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            classRoom.addStudent(studentName);
        }

        System.out.println("\nClass Information:");
        classRoom.displayClassInfo();

        scanner.close();
    }
}
