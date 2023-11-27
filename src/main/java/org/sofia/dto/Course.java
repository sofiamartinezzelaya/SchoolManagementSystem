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
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(String courseId, double credit, Department department) {

    }
}
