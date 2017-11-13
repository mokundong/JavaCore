package core1.ch09.map;

/**
 * Created by MKD on 2017/11/4
 */
public class Employee
{
    private String name;

    /**
     * Constructs an employee with $0 salary.
     * @param name the employee name
     */
    public Employee(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "[name=" + name + "]";
    }
}
