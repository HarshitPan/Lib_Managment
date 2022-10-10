package books;
import java.util.Scanner;
class Books
{
    String book_name[];
    Scanner sc=new Scanner(System.in);
    int total_books;
    int book_id[],no_of_books[];
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
            System.out.println("Enter Book ID -:");
            book_id[i]=sc.nextInt();
            System.out.println("Enter Book Name -:");
            book_name[i]=sc.nextLine();
            System.out.println("Enter total no of books -:");
            no_of_books=sc.nextInt();
        }
        System.out.println();
        System.out.println("**************");
        System.out.println();
        System.out.println("Value Inputted...");
    }
    void display()
    {
        for(int i=0;i<total_books;i++)
        {
            System.out.println();
            System.out.println("Book Id -> "+ book_id[i]);
            System.out.println("Book Name -> "+ book_name[i]);
            System.out.println("Books Available -> "+no_of_books[i]);
        }
    }
}