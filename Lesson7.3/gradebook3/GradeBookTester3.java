import java.util.Arrays;

public class GradeBookTester3
{
    public static void main(String[] args)
    {
        GradeBook1 book = new GradeBook1("grades.txt");
       // double[] totals = book.totalsForAllTopics();
       // System.out.println(Arrays.toString(totals));
        System.out.println("Expected: [158.0, 144.0, 166.0, 121.0, 154.0]");

        GradeBook1 book2 = new GradeBook1("empty.txt");
       // System.out.println(Arrays.toString(book2.totalsForAllTopics()));
        System.out.println("Expected: []");
    }
}
