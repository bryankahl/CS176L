package edu.monmouth.course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private String id;
    private Map<Integer, Integer> grades; // Map to store test scores (test number -> score)

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void addGrade(int testNumber, int score) {
        grades.put(testNumber, score);
    }

    public int getGrade(int testNumber) {
        return grades.getOrDefault(testNumber, -1); // Return -1 if the test score is not available
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private String courseLevel;
    private List<Student> students;

    public Course(String courseCode, String courseName, String courseLevel) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseLevel = courseLevel;
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
    }

    public void addGrade(String studentId, int testNumber, int score) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.addGrade(testNumber, score);
        } else {
            System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
        }
    }

    public void printGrade(int testNumber) {
        System.out.print("Test " + testNumber + ": ");
        for (Student student : students) {
            int score = student.getGrade(testNumber);
            if (score != -1) {
                System.out.print(student.getName() + " " + score + ", ");
            }
        }
        System.out.println();
    }

    public void sortGrade(int testNumber) {
        students.sort((s1, s2) -> s2.getGrade(testNumber) - s1.getGrade(testNumber));
    }

    public void updateGrade(String studentId, int newScore) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.addGrade(1, newScore); // Update test 1 score for the specified student
        } else {
            System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
        }
    }

    private Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null; // Student not found
    }
}