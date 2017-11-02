package ch05.arrayList;

import java.util.*;

/**
 * Created by MKD on 2017/11/2
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //fill the staff array list with three Enployee objects
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker",50000,1987,1,1));
        staff.add(new Employee("Harry Hacker",51000,1982,1,4));
        staff.add(new Employee("Tony Tester",52000,1983,1,5));

        //raise everyone's salary by 5%
        for (Employee e:staff){
            e.raiseSalary(5);
        }

        //print out ...
        for (Employee e:staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay() );
        }
    }
}
