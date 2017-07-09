// TO-DO
// Fill in the methods in the manager class so
// that when the simulation runs, and simulates the
// story, the assignments are assigned to photographers
// in the correct order, and printed out with photographers
// signatures below them in the order in which they are completed.
import java.util.ArrayList;
import java.util.List;

public class Manager
{
    private List<Photographer> photographerList;
    private List<Assignment> assignmentList;
    private List<FinishedPhoto> portfolio;
    // What does the manager need to remember to do his/her job?

    public Manager()
    {
        photographerList = new ArrayList<>();
        assignmentList = new ArrayList<>();
        portfolio = new ArrayList<>();
        // How do you need to initialize the instance variables?
    }

    /**
     * Called when it's time to hire a new photographer.
     */
    public void hire(String photographer)
    {
        Photographer hiredPhotographer = new Photographer(photographer);
        photographerList.add(hiredPhotographer);
        // How will you keep track of the photographers you have hired?
    }

    /**
     * Called when it's time for the daily meeting where
     * the highest priority assignments are given to photographers.
     * Each photographer can take one assignment. The highest priority
     * assignment should be given out first and the highest priority
     * assignment should go to the photographer who was hired first.
     */
    public void giveOutAssignments()
    {
        for (Photographer photographer : photographerList) {
            if (assignmentList.size() == 0) {
                break;
            } else {
                Assignment highestPriority = assignmentList.get(0);
                int counter = 0;
                int highestPos = 0;
                for (Assignment assignment : assignmentList) {
                    if (assignment.getPrio() > highestPriority.getPrio()) {
                        highestPriority = assignment;
                        highestPos = counter;
                    }
                    counter += 1;
                }
                if (photographer.tryAddAssignment(highestPriority)) {
                    FinishedPhoto finishedPhoto = new FinishedPhoto(photographer.getName(), photographer.displayAssignment());
                    portfolio.add(finishedPhoto);
                    assignmentList.remove(highestPos);
                } else { // TODO delete this if/else
                    System.out.println("Photographer already has an assignment");
                }
            }
        }

        // Where did you store the photographers and unfinished assignments?
        // Assign the highest priority assignment first to the
        // photographer who was hired first, then the next highest priority
        // assignment to the next photographer.
    }

    /**
     * A Customer came up with a new assignment. The manager should
     * add it to the to-do list so that next time it's time to give
     * out assignments, the new assignment will be a possibility.
     */
    public void newAssignment(int priority, String description)
    {
        Assignment assignment = new Assignment(priority, description);
        assignmentList.add(assignment);
        // How will you keep track of the unfinished assignments?
    }

    /**
     * It's the end of the story for now. Time to look at all the
     * work the company has done.
     */
    public void checkPortfolio()
    {
        int translate = 0;
        for (FinishedPhoto photo : portfolio) {

            Picture picture = photo.getPicture();
            picture.translate(translate,0);
            picture.draw();
            Text text = new Text(translate, picture.getMaxY(), photo.getAuthor());
            text.draw();
            translate = picture.getMaxX();
        }
        // You may need to display all the finished work when
        // this method is called, or you may have been displaying
        // the photos as you went. If you have already displayed
        // the photos, there is no need to do anything here.
    }
}
