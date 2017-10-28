package ch03.StaticTest;

import java.time.LocalDate;

/**
 * Created by MKD on 2017/10/28
 */
public class Employee {
    private static int nextId = 1;

    private  String name;
    private double salary;
    private int id;

    //constructor        构造器 与类同名
    public Employee(String n,double s){
        name = n;
        salary = s;
    }

    //method             方法
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public int getId(){
        return id;
    }
    public void setId() {
        id = nextId;
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }
}
