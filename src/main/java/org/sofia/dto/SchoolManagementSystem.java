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

    public void addStudent(String id, String fname, String lname) {

    }

    public void addTeacher(String id, String fname, String lname) {

    }

    public void addCourse(String id, double credit, String courseName) {

    }

    public void printDepartment() {

    }

    public void printStudent() {

    }

    public void printTeacher() {

    }

    public void printCourse() {

    }





}
