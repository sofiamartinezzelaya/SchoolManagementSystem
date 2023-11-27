package org.sofia.dto;

import lombok.ToString;

@ToString
public class Department {
    private static int nextId = 1;
    private String id;
    private String departmentName;

}
