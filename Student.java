package Assign1;

import java.util.Comparator;

public abstract class Student implements Comparator<Student> {
    protected int id;
    protected String name;
    protected String major;
    protected double grade;

    protected Student() {
    }

    @Override
    public int compare(Student emp1, Student emp2) {
        return (int) (emp2.getGrade() - emp1.getGrade());
    }

    public Student(int id, String name, String major, double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Major: " + major + ", Grade: " + grade;
    }


}