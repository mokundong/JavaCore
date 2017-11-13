package core1.ch04.employee;

import java.time.LocalDate;

class Employee {
    //instance field     实例域
    private static int nextId = 1;
    private int id;
    private final String name;
    private double salary;
    private LocalDate hireday;

    //constructor        构造器 与类同名
    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        hireday = LocalDate.of(year,month,day);
    }
    //method             方法

    public void setId(int id) {
        id = nextId;
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }
    public void raiseSalary(double byPrecent){
        double raise = this.salary * byPrecent / 100;
        this.salary += raise;
    }
    public boolean equals(Employee other){
        return name.equals(other.name);
    }
}
