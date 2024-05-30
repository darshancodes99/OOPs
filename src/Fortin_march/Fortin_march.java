package Fortin_march;

import java.util.Scanner;

public class Fortin_march {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("kartik", 40, 50, 60, 70, 80);
        s1.TotalMarks();
        s1.Show();
        System.out.println("highest marks : " + s1.getHighest());
        System.out.println("lowest marks : " + s1.getLowest());
        System.out.println("average : " + s1.getAverage());
        System.out.println("passed in " + s1.getPassCount() + " subjects");

        Student s2 = new Student();
        s2.input("kishan", 50, 60, 80, 85, 95);
        s2.TotalMarks();
        s2.Show();
        System.out.println("highest marks : " + s2.getHighest());
        System.out.println("lowest marks : " + s2.getLowest());
        System.out.println("average : " + s2.getAverage());
        System.out.println("passed in " + s2.getPassCount() + " subjects");

        Student.TotalStudents();
    }
}

class Student {
    static int uniqueNumber;
    int rollNo;
    String name;
    int totalMarks;

    static {
        uniqueNumber = 0;
    }

    Student() {
        this.rollNo = ++uniqueNumber;
    }

    int[] students = new int[5];

    public void input(String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
        this.name = name;
        students[0] = mark1;
        students[1] = mark2;
        students[2] = mark3;
        students[3] = mark4;
        students[4] = mark5;
    }

    public void TotalMarks() {
        for (int i = 0; i < students.length; i++) {
            totalMarks += students[i];
        }
    }

    public int getHighest() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < students.length; i++) {
            if (students[i] > max) {
                max = students[i];
            }
        }

        return max;
    }

    public int getLowest() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < students.length; i++) {
            if (students[i] < min) {
                min = students[i];
            }
        }

        return min;
    }

    public double getAverage() {
        return (double) totalMarks / students.length;
    }

    public int getPassCount() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] >= 50) {
                count++;
            }
        }
        return count;
    }

    public void Show() {
        System.out.println("============");
        System.out.println("roll number : " + this.rollNo);
        System.out.println("name : " + this.name);
        System.out.println("marks : ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("subject : " +  (i + 1) +  " marks : " + students[i] + " ");
        }
    }

    public static void TotalStudents() {
        System.out.println("total students : " + uniqueNumber);
    }
}