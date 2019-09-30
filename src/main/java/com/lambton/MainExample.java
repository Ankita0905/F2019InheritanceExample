package com.lambton;

import com.lambton.faculty.Faculty;
import com.lambton.faculty.FullTimeFaculty;
import com.lambton.student.Student;

import java.time.LocalDate;

public class MainExample
{
    public static void main(String[] args)
    {
        Person p1;
        iPrintable ip;

        Student s1 = new Student(1,
                "Pritesh",
                "Patel",
                LocalDate.now(),
                "Male",
                "MADT",
                2);

        ip=s1;
        ip.print();

        p1 = s1;

        p1.display();
        p1.print();

        Faculty f1 = new FullTimeFaculty(1,
                "Pritesh",
                "Patel",
                LocalDate.now(),
                "Male",
                "Software Engineer", 1000.00f,
                "Mobile Software Development",
                200);

        f1.calculateTotalSalary();
        p1 = f1;
        p1.display();





    }

}
