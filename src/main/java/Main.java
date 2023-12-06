import org.sofia.dto.Department;
import org.sofia.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem("Vanier");

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Health Sciences");
        schoolManagementSystem.addDepartment("Engineering");
        schoolManagementSystem.addDepartment("Art");

        schoolManagementSystem.printDepartment();

        schoolManagementSystem.findDepartment("D004");

        schoolManagementSystem.addDepartment("Art");

        schoolManagementSystem.addStudent("Mike", "Conan", "D001");

        schoolManagementSystem.printStudent();

        schoolManagementSystem.findStudent("S001");


        System.out.println(schoolManagementSystem.findDepartment("D004"));
    }
}
