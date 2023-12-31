import org.sofia.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem("Vanier");

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Health Sciences");
        schoolManagementSystem.addDepartment("Engineering");
        schoolManagementSystem.addDepartment("Art");
        schoolManagementSystem.addDepartment("History");
        schoolManagementSystem.addDepartment("Medicine");

        schoolManagementSystem.printDepartment();

        schoolManagementSystem.addStudent("Mike", "Conan", "D001");
        schoolManagementSystem.addStudent("Elena", "Dobrev", "D001");
        schoolManagementSystem.addStudent("Stefan", "Walker", "D001");
        schoolManagementSystem.addStudent("Ian", "Somerholder", "D002");
        schoolManagementSystem.addStudent("Ian", "Somerholder", "D004");
        // add new student until max student is reached and eventually will fail to add student

        schoolManagementSystem.printStudent();

        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        schoolManagementSystem.addTeacher("Shawna", "Lambert", "D004");
        // add new teacher until max teacher is reached and eventually will fail to add teacher

        schoolManagementSystem.printTeacher();

        schoolManagementSystem.addCourse("Introduction to Programming", 3.0, "D005");

        schoolManagementSystem.printCourse();

        schoolManagementSystem.modifyCourseTeacher("T001", "C001");
        schoolManagementSystem.modifyCourseTeacher("T001", "C007");

        schoolManagementSystem.registerCourse("S001", "C001");
        schoolManagementSystem.registerCourse("S010", "C002");
    }
}
