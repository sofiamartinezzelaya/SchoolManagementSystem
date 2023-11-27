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

    /**
     * adds a new department if there are less than 5 existing departments
     * else it will fail to add a department
     * @param department Department
     */
    public void addDepartment(Department department) {

    }

    /**
     * adds a new student if there are less than 200 existing students
     * else it will fail to add a student
     * @param studentId String studentId
     * @param fname String student's first name
     * @param lname String student's last name
     */
    public void addStudent(String studentId, String fname, String lname) {

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
    public void printDepartment() {

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

    public Department findDepartment(String departmentId) {
        return null;//filler for empty method, will be replaced during completion
    }

    public Teacher findTeacher(String teacherId) {
        return null;//filler for empty method, will be replaced during completion
    }

    public Course findCourse(String courseId) {
        return null;//filler for empty method, will be replaced during completion
    }

    public Student findStudent(String studentId) {
        return null;//filler for empty method, will be replaced during completion
    }

    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    public void registerCourse(String studentId, String courseId) {

    }






}
