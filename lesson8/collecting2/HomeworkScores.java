// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double sum;
    private double lowestValue;
    private int addedScores;

    public HomeworkScores()
    {
        sum = 0;
        lowestValue = Integer.MAX_VALUE;
        addedScores = 0;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        if (sum <= 0 || score < lowestValue){
            sum += score;
            lowestValue = score;
        } else {
            sum += score;
        }
    }

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (sum == lowestValue || sum == 0){
            return sum;
        } else {
            return sum - lowestValue;
        }
    }

}
