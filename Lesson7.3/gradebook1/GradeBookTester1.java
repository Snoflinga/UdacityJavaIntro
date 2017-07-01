public class GradeBookTester1
{
    public static void main(String[] args)
    {
        GradeBook1 book = new GradeBook1("grades.txt");
        System.out.println(book.totalForStudent(0));
        System.out.println("Expected: 37.0");
        System.out.println(book.totalForStudent(21));
        System.out.println("Expected: 32.0");
        System.out.println(book.totalForStudent(22));
        System.out.println("Expected: -1");
    }
}
