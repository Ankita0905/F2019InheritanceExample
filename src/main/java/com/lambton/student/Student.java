package com.lambton.student;

import com.lambton.Person;
import com.lambton.iPrintable;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person implements iPrintable
{
    private String courseName;
    private int currentSemester;

    public Student(int id) {
        super(id);
    }



    public Student(int id, String firstName, String lastName, LocalDate birthDate, String gender, String courseName, int currentSemester) {
        super(id, firstName, lastName, birthDate, gender);
        this.courseName = courseName;
        this.currentSemester = currentSemester;
        //x=900;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public void display() {
        System.out.println("Student ID              : " + getId());
        System.out.println("Student First Name      : " + getFirstName());
        System.out.println("Student Last Name       : " + getLastName());
        System.out.println("Student Birth Date      : " + getBirthDate());
        System.out.println("Student Gender          : " + getGender());
        System.out.println("Student Course Name     : " + this.courseName);
        System.out.println("Student Current Semester: " + this.currentSemester);
    }

  @Override
    public void print()
    {
        System.out.println("print() from Student");
    }

}
