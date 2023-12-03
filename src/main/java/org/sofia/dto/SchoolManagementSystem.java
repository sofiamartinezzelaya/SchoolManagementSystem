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

    private Student[] students;
    private Teacher[] teachers;
    private int departmentNum = 0;
    private Department[] departments;
    private Course[] course;

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPART_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
    }

    /**
     * adds a new department if there are less than 5 existing departments
     * else it will fail to add a department
     * @param department Department
     */
    public void addDepartment(Department department) {
        if (departmentNum < MAX_DEPART_NUM) {
            departments[departmentNum] = department;
        }
        System.out.println("Max departments reached, add a new department failed");
    }

    /**
     * adds a new student if there are less than 200 existing students
     * else it will fail to add a student
     * @param studentId String studentId
     * @param fname String student's first name
     * @param lname String student's last name
     */
    public void addStudent(String studentId, String fname, String lname) {
        //call findDepartment

    }

    /**
     * adds a new teacher if there are less than 20 existing teachers
     * else it will fail to add a teacher
     * @param teacherId String teacherId
     * @param fname String teacher's first name
     * @param lname String teacher's last name
     */
    public void addTeacher(String teacherId, String fname, String lname) {

    }

    /**
     * adds a new course if there are less than 30 existing courses
     * else it will fail to add a course
     * @param courseId String courseId
     * @param credit double number of redits earned from course
     * @param courseName String course's name
     */
    public void addCourse(String courseId, double credit, String courseName) {

    }

    /**
     * Displays all departments in the system that is not a null
     */
    public void printDepartment(Department department) {
        for ()
    }

    /**
     * Displays all students in the system that is not a null
     * if there are course and departments, the names of the course and department will be displayed
     * else it won't display the course or department names
     */
    public void printStudent() {

    }

    /**
     * Displays all teachers in the system that is not a null
     * if there are course and departments, the names of the course and department will be displayed
     * else it won't display the course or department names
     */
    public void printTeacher() {

    }

    /**
     * Displays all courses in the system that are not a null
     * if there are teachers, courses and departments, the names of the teachers, course and department will be displayed
     * else it won't display the teachers, course or department names
     */
    public void printCourse() {

    }

    /**
     * finds a department in the departments based on the department id
     * if the department id does not match with anything in the departments, will return a null
     * @param departmentId Strind of departmentId
     * @return the Department department that was being searched
     */
    public Department findDepartment(String departmentId) {
        return null;//filler for empty method, will be replaced during completion
    }

    /**
     * finds a teacher in the teachers based on the teacher id
     * if the teacher id does not match with anything in the teachers, will return a null
     * @param teacherId String of teacherId
     * @return the Teacher teacher that was being searched
     */
    public Teacher findTeacher(String teacherId) {
        return null;//filler for empty method, will be replaced during completion
    }

    /**
     * finds a course in the course based on the course id
     * if the teacher id does not match with anything in the courses, will return a null
     * @param courseId String of courseId
     * @return the Course course that was being searched
     */
    public Course findCourse(String courseId) {
        return null;//filler for empty method, will be replaced during completion
    }

    /**
     * finds a student in the students based on the student id
     * if the studentid does not match with anything in the students, will return a null
     * @param studentId String of studentId
     * @return the Student student that was being searched
     */
    public Student findStudent(String studentId) {
        return null;//filler for empty method, will be replaced during completion
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
