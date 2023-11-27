package org.sofia.dto;

public class Department {
    private static int nextId = 1;
    private String id;
    private String departmentName;

    /**
     * displays all the departments in the school that is not a null
     * @param id String id of the department
     * @param nextId int id that will increase each time a new department is made
     * @param departmentName String department name
     * @return a series of Strings that will display the department's id, and name
     */
    public String toString(String id, int nextId, String departmentName) {
        return String.format("department");
    }
}
