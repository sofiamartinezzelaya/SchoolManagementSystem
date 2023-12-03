package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private static int nextId = 1;
    private String departmentId;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentId = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    public String toString() {
        return departmentId + departmentName;
    }
}
