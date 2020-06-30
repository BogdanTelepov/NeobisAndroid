package com.example.reportcard;

import java.util.ArrayList;

public class ReportCard {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bogdan", 25, 4, "English", "Math", "Physics", 85, 78, 90));
        students.add(new Student("Sashsa", 22, 3, "English", "Math", "Physics", 65, 70, 80));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }

    }
}
