package org.sofia.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private static int nextId = 1;
    private String departmentId;
    private String departmentName;

    public Department(String departmentId) {

    }

    /**
     * intializes all the fields
     * @param departmentidId String of department
     * @param nextId int that increases the id of the department when a new department is added
     * @param departmentName String of the department name
     * @return the id and department name
     */
    public String toString(String departmentidId, int nextId, String departmentName) {
        return null; //filler for empty method, will be replaced during completion
    }
}
