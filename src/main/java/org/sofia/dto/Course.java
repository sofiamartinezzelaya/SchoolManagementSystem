package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Course {
    private double credit;
    private String courseId;
    private Student[] students;
    private Department department;
    private int studentNum = 0;
    private Teacher teacher = null;
    private String courseName;

    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;

    public Course(String courseName, double credit, Department department) {
        courseId = String.format("C%03d", nextId++);
        this.credit = credit;
        this.courseName = courseName;
        this.department = department;
        students = new Student[MAX_STUDENT_NUM];
    }
}
