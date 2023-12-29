package org.anudip.array;

import java.util.HashMap;

public class StudentMark {
    public static void main(String[] args) {
        // Initialize arrays for student IDs and marks
        String[] studentIds = {"S101", "S102", "S103", "S104", "S105"};
        double[] studentMarks = {90, 85.7, 78, 92, 88.5};

        // Create a HashMap to associate student IDs with marks
        HashMap<String, Double> studentMap = new HashMap<>();

        // Populate the HashMap with data from arrays
        for (int i = 0; i < studentIds.length; i++) {
            studentMap.put(studentIds[i],studentMarks[i]);
        }

        // Print the student IDs and their corresponding marks
        System.out.println("Student Id\tMarks");
        for (String id : studentMap.keySet()) {
            double marks = studentMap.get(id);
            System.out.println(id + "\t\t" + marks);
        }

        // Print the length of the arrays
        System.out.println("\nLength of Student Id's array: " + studentIds.length);
        System.out.println("Length of Student Marks array: " + studentMarks.length);
    }
}