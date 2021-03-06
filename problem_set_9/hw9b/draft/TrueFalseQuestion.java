// You are going to add a true/false type question to the question heirachy. Call it
// TrueFalseQuestion
//
// When the quiz is displayed, we want this text to preceed the question.
//     Answer True or False: question here
// We want the "Answer True or False: " to be prepended automatically.
// So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
// the question will be displayed to the user like this
//      Answer True or False: Albert Einstein was the inventer of Java.
//
// Capitalization should not matter when determining if the answer is correct. Also t for true
// and f for false should be accepted.
//
// You will need to override three methods although not everyone will override the
// exact same three methods
//
// You will not need to add instance variables
//
//For the draft, make the changes necessary to prepend the question submitted by the user with
//    Answer True or False:
//
public class TrueFalseQuestion extends Question
{
    /**
     Displays this question.
     */
    @Override
    public void display()
    { // TODO: for the draft, override the appropriate method(s) to present the question as specified
        System.out.print("Answer True or False: ");
        super.display();
    }

    /**
     Sets the answer for this question.
     @param correctResponse the answer
     */
    @Override
    public void setAnswer(String correctResponse)
    {
        String answer = correctResponse.toLowerCase();
        super.setAnswer(answer);
    }

    /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was correct, false otherwise
     */
    @Override
    public boolean checkAnswer(String response)
    {
        String respondedAnswer = response.toLowerCase();
        if (respondedAnswer.equals("t") || respondedAnswer.equals("true")){
            return super.checkAnswer("true");
        }else if (respondedAnswer.equals("f") || respondedAnswer.equals("false")){
            return super.checkAnswer("false");
        } else {
            return super.checkAnswer(response);
        }
    }
   // TODO: for the final, override the necessary  method(s) all valid answers as specified

}
