package org.sofia.dto;

/**
 * Teacher
 *
 * @author Sofia Martinez
 */

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Teacher {
    private String fname;
    private String lname;
    private String name;
    private Department department;
    private String teacherId;
    private static int nextId = 1;

    public Teacher(String fname, String lname, Department department) {
        teacherId = String.format("T%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        name = fname + " " + lname;
    }

    public String toString() {
        return "Teacher {id= '" + teacherId + "', fname= '" + fname + "', lname= '" + lname + "', department= " +
                department.getDepartmentName() + "}";
    }
}
