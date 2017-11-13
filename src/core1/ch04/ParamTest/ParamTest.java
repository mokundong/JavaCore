package core1.ch04.ParamTest;

/**
 * Created by MKD on 2017/10/28
 */
public class ParamTest {
    public static void main(String[] args) {
        /**
         * Test1:Methods can't modify numeric patameters
         * 方法不能修改一个基本数据类型的参数（及数值型或布尔型）
         */
        System.out.println("Testing tripleValue:");
        double precent = 20;
        System.out.println("Before: precent = " + precent);
        tripleValue(precent);
        System.out.println("After:  precent = " + precent);

        /**
         * Test2:Method can change the state of object parameters
         * 方法可以改变一个对象参数的转台
         */
        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        /**
         * Test3:Method can't attach new objects to object parameters
         * 方法不能让对象参数引用一个新的对象
         */
        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice",70000);
        Employee b = new Employee("Bob",60000);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        swap(a,b);
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());

    }
    public static void tripleValue(double x){//doesn't work
        x = 3 * x;
        System.out.println("End of Methods: x = " + x);
    }
    public static void tripleSalary(Employee x){//work
        x.raiseSalary(200);
        System.out.println("End of Methods: salary = " + x.getSalary());
    }
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of Methods: x = " + x.getName());
        System.out.println("End of Methods: y = " + y.getName());
    }
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
