package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Student {
    private String fname;
    private String lname;
    private String id;
    private Course[] courses;
    private int courseNum;
    private Department department;

    private static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;


}
