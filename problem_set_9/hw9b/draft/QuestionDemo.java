import java.util.Scanner;

/**
   This program shows a simple quiz with two questions.
*/
public class QuestionDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int score = 0;

        Question first = new TrueFalseQuestion();
        first.setText("Albert Einstein was the inventor of Java.");
        first.setAnswer("false");
        
        Question second = new TrueFalseQuestion();
        second.setText("True or False: The original name for Java was Oak");
        second.setAnswer("TRUE");

        Question third = new TrueFalseQuestion();
        third.setText("A question the answer is true, I answer fal");
        third.setAnswer("f");
        
        score += presentQuestion(first, in);
        System.out.println("Score: " + score);
        score += presentQuestion(second, in);
        System.out.println("Score: " + score);
        score += presentQuestion(third, in);
        System.out.println("Score: " + score);
    }
    /**
       Presents a question to the user and obtains a response.
       @param q the question to present
       @param in the scanner from which to read the user input
       @return the score (1 if correct, 0 if incorrect)
    */
    public static int presentQuestion(Question q, Scanner in)
    {
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        boolean outcome = q.checkAnswer(response);
        System.out.println(outcome);
        if (outcome)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
