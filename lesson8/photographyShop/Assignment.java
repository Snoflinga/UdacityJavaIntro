// What should an Assignment do?
// How do you want to use it for this program?
// You can put any code related to the Assignment class you
// want in here.

public class Assignment
{
    private int prio;
    private String textdesc;

/**
Creates an assignment with priority and description
@param priority of the assignment
@param description of the assignment
 */
    public Assignment(int priority, String description){
        this.prio = priority;
        this.textdesc = description;
    }

    public int getPrio(){
        return prio;
    }

    public String getTextdesc(){
        return textdesc;
    }
}
