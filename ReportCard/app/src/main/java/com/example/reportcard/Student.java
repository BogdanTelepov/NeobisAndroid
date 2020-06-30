package com.example.reportcard;


public class Student {
    private String name;
    private int age;
    private int numberOfCourse;
    private String subjectName1;
    private String subjectName2;
    private String subjectName3;
    private char gradeSubject1;
    private String gradeSubject2;
    private double gradeSubject3;


    public Student(String name, int age, int numberOfCourse, String subjectName1, String subjectName2, String subjectName3, char gradeSubject1, String gradeSubject2, double gradeSubject3) {
        this.name = name;
        this.age = age;
        this.numberOfCourse = numberOfCourse;
        this.subjectName1 = subjectName1;
        this.subjectName2 = subjectName2;
        this.subjectName3 = subjectName3;
        this.gradeSubject1 = gradeSubject1;
        this.gradeSubject2 = gradeSubject2;
        this.gradeSubject3 = gradeSubject3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public String getSubjectName1() {
        return subjectName1;
    }

    public void setSubjectName1(String subjectName1) {
        this.subjectName1 = subjectName1;
    }

    public String getSubjectName2() {
        return subjectName2;
    }

    public void setSubjectName2(String subjectName2) {
        this.subjectName2 = subjectName2;
    }

    public String getSubjectName3() {
        return subjectName3;
    }

    public void setSubjectName3(String subjectName3) {
        this.subjectName3 = subjectName3;
    }

    public int getGradeSubject1() {
        return gradeSubject1;
    }

    public void setGradeSubject1(char gradeSubject1) {
        this.gradeSubject1 = gradeSubject1;
    }

    public String getGradeSubject2() {
        return gradeSubject2;
    }

    public void setGradeSubject2(String gradeSubject2) {
        this.gradeSubject2 = gradeSubject2;
    }

    public double getGradeSubject3() {
        return gradeSubject3;
    }

    public void setGradeSubject3(double gradeSubject3) {
        this.gradeSubject3 = gradeSubject3;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Number course: " + getNumberOfCourse() + "\n" + "Subject 1: " + getSubjectName1() + " Grade: " + getGradeSubject1() + "\n"
                + "Subject 2: " + getSubjectName2() + " Grade: " + getGradeSubject2() + "\n" + "Subject 3: " + getSubjectName3() + " Grade: " + getGradeSubject3() + "\n";
    }


}
