package com.lambton.faculty;

import com.lambton.faculty.Faculty;
import com.lambton.iPrintable;

import java.time.LocalDate;

public class FullTimeFaculty extends Faculty implements iPrintable {

    private float bonus;

    public FullTimeFaculty(int id) {
        super(id);
    }

    public FullTimeFaculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specialization, float bonus) {
        super(id, firstName, lastName, birthDate, gender, designation, salary, specialization);
        this.bonus = bonus;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Faculty Type           : Full Time" );
        System.out.println("Faculty Bonus          : " + this.bonus);
        System.out.println("Faculty Net Salary     : " + getNetSalary());
    }

    @Override
    public void calculateTotalSalary() {
        setNetSalary(getBaseSalary() + bonus);
    }

    @Override
    public void print() {

    }
}
