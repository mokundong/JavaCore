package ch03.ParamTest;

/**
 * Created by MKD on 2017/10/28
 */
public class ParamTest {


}
class Employee{
    private String name;
    private double salary;

    public Employee(String n,double s){
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPrecent){
        double raise = salary * byPrecent / 100;
        salary += raise;
    }
}
