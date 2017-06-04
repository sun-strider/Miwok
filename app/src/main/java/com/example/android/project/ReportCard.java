package com.example.android.project;

import java.util.ArrayList;

/**
 * Created by me74 on 04.06.2017.
 */

public class ReportCard {

    /**
     * Title of the classes/subjects, for example "Physics"
     */
    private ArrayList<String> mSubjects;

    /**
     * Grades for the classes
     */
    private ArrayList<Integer> mGrades;

    /**
     * Year of the grades
     */
    private int mYear;

    /**
     * Create a new ReportCard object.
     *
     * @param subject First class (subject) to add to the ReportCard
     * @param grade   Grade of the first subject
     * @param year    is the year of the grades
     */

    public ReportCard(String subject, int grade, int year) {
        mSubjects = new ArrayList<>();
        mGrades = new ArrayList<>();

        this.mSubjects.add(subject);
        this.mGrades.add(grade);
        this.mYear = year;
    }

    // Method to add a new subject with its respective grade to the corresponding ArrayLists
    public void addNewSubjectAndGrade(String subject, int grade) {
        this.mSubjects.add(subject);
        this.mGrades.add(grade);
    }

    // Getters for the respective values of the subjects, grades and year
    public ArrayList<String> getmSubjects() {
        return mSubjects;
    }

    // Setters for the respective values of the subjects, grades and year
    public void setmSubjects(ArrayList<String> mSubjects) {
        this.mSubjects = mSubjects;
    }

    public ArrayList<Integer> getmGrades() {
        return mGrades;
    }

    public void setmGrades(ArrayList<Integer> mGrades) {
        this.mGrades = mGrades;
    }

    public int getmYear() {
        return mYear;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }

    // toString method which returns as output the year and the respective subjects with all grades
    @Override
    public String toString() {

        // Create a String for the output of the toString method. The title "Reportcard" and the year are added immediatly
        String reportCardString = "ReportCard" + "\n" +
                "Year = " + mYear + "\n";

        // This loop adds all the names of the subjects and the respective grades to reportCardString
        for (int index = 0; index < mSubjects.size(); index++) {
            reportCardString = reportCardString + mSubjects.get(index);
            reportCardString = reportCardString + " = ";
            reportCardString = reportCardString + mGrades.get(index);
            reportCardString = reportCardString + "\n";
        }

        return reportCardString;
    }
}

