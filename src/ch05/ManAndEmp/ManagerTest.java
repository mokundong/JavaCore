package ch05.ManAndEmp;

public class ManagerTest {
    public static void main(String[] args) {
        //Construct a Manaher object
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(50000);

        Employee[] staff = new Employee[3];

        //fill the staff array with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tommy Tester",40000,1990,1,15);

        //print out information abuout all Employee objects
        for (Employee e:staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
