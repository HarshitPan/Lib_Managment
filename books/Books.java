package books;
import java.util.Scanner;
class Books
{
    String book_name[];
    Scanner sc=new Scanner(System.in);
    int total_books;
    int id[],no_of_books[];
    Books()
    {
        System.out.println("Welcome to Library...");
        System.out.println("Input Some Books...");
        System.out.print("Enter Total no of books ->");
        total_books=sc.nextInt();
        input();
    }
    void input()
    {
        for(int i=0;i<total_books;i++)
        {
            System.out.println();
            System.out.println("Enter details of "+(i+1)+" book -:");

        }
    }
}