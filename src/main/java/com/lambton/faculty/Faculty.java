package com.lambton.faculty;

import com.lambton.Person;

import java.time.LocalDate;

public abstract class Faculty extends Person
{
    private String designation;
    private String specialization;
    private float baseSalary;
    private float netSalary;

    public Faculty(int id) {
        super(id);
    }

    public Faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specialization) {
        super(id, firstName, lastName, birthDate, gender);
        this.designation = designation;
        this.baseSalary = salary;
        this.specialization = specialization;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float salary) {
        this.baseSalary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(float netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public void display() {
        System.out.println("Faculty ID              : " + getId());
        System.out.println("Faculty First Name      : " + getFirstName());
        System.out.println("Faculty Last Name       : " + getLastName());
        System.out.println("Faculty Birth Date      : " + getBirthDate());
        System.out.println("Faculty Gender          : " + getGender());
        System.out.println("Faculty Designation     : " + this.designation);
        System.out.println("Faculty Specialization  : " + this.specialization);
        System.out.println("Faculty Salary          : " + this.baseSalary);
    }

    public abstract void calculateTotalSalary();
}
