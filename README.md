# SchoolManagementSystem
This file is the README file for Sofia Martinez

 The github link to the repository:
 https://github.com/sofiamartinezzelaya/SchoolManagementSystem.git
 The class diagram: 
 https://github.com/sofiamartinezzelaya/SchoolManagementSystem/blob/main/ClassDiagram.jpg

 Final Project: SchoolManagementSystem
 This project contains 5 classes and the main(currently empty):
 - Teacher: contains toString() and the class's constructor
   contains fields: String fname, String lname, Department department, String teacherId and nextId
   these fields will be used in the constructor to be initalized
 - Student: contains toString() and the class's constructor
   contains fields: String fname, String lname, Department department, String studentId, Course[] courses, int CourseNumand nextId
   these fields will be used in the constructor to be intialized
 - Course: Department department, double credit, String courseId, Student[] students, int studentNum, Teacher teacher, String courseName, and nextId
   these fields will be used in the constructor to be intialized
 - Department: nextId, String departmentId, String departmentName
   these fields will be used in the constructor to be intialized
 - SchoolManagementSystem: contains constants within the fields to be used later to initalize different arrays for a multple methods.

   SchoolManagementSystem also contains several methods in order to create different departments, teachers, students and courses. It also contains methods to modify teachers and course as well as to print and display the teachres, students, courses and departments.
   It will work so that a students can register in a course meeting the conditions and will also work to print a message to notify the student they cannot register for a course if they do not meet the conditions.

