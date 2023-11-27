package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String TeacherId;
    private static int nextId = 1;

}
