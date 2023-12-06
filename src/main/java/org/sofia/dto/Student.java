package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String fname;
    private String lname;
    private String studentId;
    private Course[] courses;
    private int courseNum = 0;
    private Department department;

    private static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;

    public Student(String fname, String lname, Department department) {
        studentId = String.format("S%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;

    }

    @Override
     public String toString() {
        String courseStr = Arrays.toString(courses);

        return "Student {id= '" + studentId + "', fname= '" + fname + "', lname= '" + lname + "', department= " + department
                + ", courseNum= " + courseNum + ", courses= [" + courseStr +  "}";
     }
}
