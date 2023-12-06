package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class SchoolManagementSystem {
    private static final int MAX_DEPART_NUM  = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;

    private int studentNum = 0;
    private Student[] students;
    private int teacherNum = 0;
    private Teacher[] teachers;
    private int departmentNum = 0;
    private Department[] departments;
    private int courseNum = 0;
    private Course[] courses;

    public SchoolManagementSystem(String name) {
        this.departments = new Department[MAX_DEPART_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
    }

    /**
     * adds a new department if there are less than 5 existing departments
     * else it will fail to add a department
     * @param departmentName String of department name
     */
    public void addDepartment(String departmentName) {
        for (; departmentNum < MAX_DEPART_NUM; departmentNum++) {
            if (departments[departmentNum] == null) {
                Department department = new Department(departmentName);
                departments[departmentNum] = department;
                System.out.printf("Add department %s successfully.\n", department);
                return;
            }
        }
        System.out.println("Failed to add department");
    }

    /**
     * adds a new student if there are less than 200 existing students
     * else it will fail to add a student
     * @param fname String student's first name
     * @param lname String student's last name
     * @param departmentId String of department id
     */
    public void addStudent(String fname, String lname, String departmentId) {
        for (; studentNum < MAX_STUDENT_NUM; studentNum++) {
            if (students[studentNum] == null) {
                Student student = new Student(fname, lname, findDepartment(departmentId));
                students[studentNum] = student;
                System.out.printf("%s added successfully.\n", student);
                return;
            }
        }
        System.out.println("Failed to add student");
    }

    /**
     * adds a new teacher if there are less than 20 existing teachers
     * else it will fail to add a teacher
     * @param fname String teacher's first name
     * @param lname String teacher's last name
     * @param departmentId String of department id
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        for (; teacherNum < MAX_TEACHER_NUM; teacherNum++) {
            if (teachers[teacherNum] == null) {
                Teacher teacher = new Teacher(fname, lname, findDepartment(departmentId));
                teachers[teacherNum] = teacher;
                System.out.printf("%s added successfully.\n", teacher);
                return;
            }
        }
        System.out.println("Max teacher reached, add a new teacher failed");
    }

    /**
     * adds a new course if there are less than 30 existing courses
     * else it will fail to add a course
     * @param courseName String course's name
     * @param credit double number of credits earned from course
     * @param departmentId String of the department id
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        for (; courseNum < MAX_COURSE_NUM; courseNum++) {
            if (courses[courseNum] == null) {
                Course course = new Course(courseName, credit, findDepartment(departmentId));
                courses[courseNum] = course;
                System.out.printf("%s added successfully\n", course);
                return;
            }
        }
        System.out.println("Max number of courses reaches, adda new course failed");
    }

    /**
     * Displays all departments in the system that is not a null
     */
    public void printDepartment() {
        for (Department department: departments) {
            if (department != null) {
                System.out.println(department);     //double check output and modify if needed (ex. if courses not being
                                                    // printed how expected
            }
        }
    }

    /**
     * Displays all students in the system that is not a null
     * if there are course and departments, the names of the course and department will be displayed
     * else it won't display the course or department names
     */
    public void printStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);         //double check output and modify if needed (ex. if courses not being
                                                    // printed how expected
            }
        }
    }

    /**
     * Displays all teachers in the system that is not a null
     * if there are course and departments, the names of the course and department will be displayed
     * else it won't display the course or department names
     */
    public void printTeacher() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);         //double check output and modify if needed (ex. if courses not being
                                                     // printed how expected
            }
        }
    }

    /**
     * Displays all courses in the system that are not a null
     * if there are teachers, courses and departments, the names of the teachers, course and department will be displayed
     * else it won't display the teachers, course or department names
     */
    public void printCourse() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);          //double check output and modify if needed (ex. if courses not being
                                                     // printed how expected
            }
        }
    }

    /**
     * finds a department in the departments based on the department id
     * if the department id does not match with anything in the departments, will return a null
     * @param departmentId String of departmentId
     * @return the department from the Department class that was being searched
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    /**
     * finds a teacher in the teachers based on the teacher id
     * if the teacher id is found in the teachers array and return the teacher with data type Teacher
     * @param teacherId String of teacherId
     * @return a null if teacher not found
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * finds a course in the course based on the course id
     * if the teacher id does not match with anything in the courses, will return a null
     * @param courseId String of courseId
     * @return the Course course that was being searched
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;//filler for empty method, will be replaced during completion
    }

    /**
     * finds a student in the students based on the student id
     * if the studentid is found in students then it will return the student with data type Student
     * @param studentId String of studentId
     * @return null if studentId not found
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * assigns a teached to a specific course based on parameters
     * if no teacher or course is found, a message will be printed
     * @param teacherId String of teacherId
     * @param courseId String of courseId
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * registers a course for a student based on parameters
     * if the parametes does not match with anything, prints a message
     * if the student has registed for the max num of courses, prints a message
     * if the course is registered by max num of students, prints a message
     * else it will add te course to the students registered course arrat and add the student to the reistered students
             array
     * @param studentId String of studentId
     * @param courseId string of courseId
     */
    public void registerCourse(String studentId, String courseId) {

    }






}
