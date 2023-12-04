package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String teacherId;
    private static int nextId = 1;

    public Teacher(String fname, String lname, Department department) {
        teacherId = String.format("T%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    public String toString() {
        return teacherId + fname + lname + department;
    }
}
