import java.util.Arrays;

public class GradeBookTester2
{
    public static void main(String[] args)
    {
        GradeBook1 book = new GradeBook1("grades.txt");
       // double[] studentTotals = book.totalsForAllStudents();
      //  System.out.println(Arrays.toString(studentTotals));
        System.out.println("Expected: [37.0, 40.0, 29.0, 27.0, 43.0, 32.0, 35.0, 29.0, 35.0, 38.0, 34.0, 26.0, 32.0, 32.0, 28.0, 29.0, 25.0, 36.0, 43.0, 42.0, 39.0, 32.0]");

        GradeBook1 book2 = new GradeBook1("empty.txt");
        //System.out.println(Arrays.toString(book2.totalsForAllStudents()));
        System.out.println("Expected: []");
    }
}
