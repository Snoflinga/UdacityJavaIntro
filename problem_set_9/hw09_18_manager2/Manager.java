// This problem builds on the class from the previous project.
//
// The manager class is a subclass of Employee. A Manager is different from an employee in that
// a Manager has a bonus. So we add that instance variable
//
// In the previous problem you added the code to complete the constructor
// Now override the getSalary method to return the total of the salary and bonus
//
public class Manager extends Employee
{
    private double bonus;

    /**
     * Constructs a Manager
     * @name the name of the manager
     * @salary the salary of this manager
     * @param theBonus the bonus for this Manager
     */
    public Manager(String name, double salary, double theBonus)
    {
        super(name, salary);
        this.bonus = theBonus;
        // TODO: complete the constructor

    }

    public double getBonus()
    {
        return bonus;
    }


     // Gets the total salary for this Manager
     // that is the salary + the bonus

    public double getSalary()
    {
        double salary = super.getSalary() + bonus; // TODO: finish the method implementation
        return  salary;

    }
}
