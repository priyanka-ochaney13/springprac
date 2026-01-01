package com.example;

public class Student {
    private int age;
    private Computer computer;

    // private Laptop laptop = new Laptop();
    public Student() {
        System.out.println("Student object created");
    }
    // public Student(int age, Laptop laptop) {
    //     System.out.println("Student object created with age");
    //     this.age = age;
    //     this.laptop = laptop;
    // }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // public Laptop getLaptop() {
    //     return laptop;
    // }
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public void code() {
        System.out.println("Student is coding...");
        computer.compile();
    }
}
