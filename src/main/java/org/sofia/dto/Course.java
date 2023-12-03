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
    private static final int MAX_STUDENT_NUM = 5;

    private double credit;
    private String courseId;
    private Student[] students;
    private Department department;
    private int studentNum = 0;
    private Teacher teacher;
    private String courseName;

    public Course(double credit, String courseId, Department department) {
        this.credit = credit;
        this.courseId = courseId;
        this.students = students;
        this.department = department;
    }
}
