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
        book_name=new String[total_books];
        book_id=new int[total_books];
        no_of_books=new int[total_books];
        input();
    }
    void input()
    {
        for(int i=0;i<total_books;i++)
        {
            System.out.println();
            System.out.println("Enter details of "+(i+1)+" book -:");
            System.out.print("Enter Book ID -:");
            book_id[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Name -:");
            book_name[i]=sc.nextLine();
            System.out.print("Enter total no of books -:");
            no_of_books[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("**************");
        System.out.println();
        System.out.println("Value Inputted...");
        System.out.print("Press Enter to continue...");
        obj.sc.nextLine();
        obj.sc.nextLine();
    }
    void display()
    {
        for(int i=0;i<total_books;i++)
        {
            System.out.println();
            System.out.println("Book Id -> "+ book_id[i]);
            System.out.println("Book Name -> "+ book_name[i]);
            System.out.println("Books Available -> "+no_of_books[i]);
            System.out.println();
            System.out.println("****************");
            System.out.println();
        }
    }

void issue_book(int id)
    {
        System.out.println();
        for(int i=0;i<total_books;i++)
        {
            if(book_id[i]==id) 
            {
                if(no_of_books[i]!=0)
                {
                    no_of_books[i]--;
                    System.out.println("Book Issued.");
                    return;
                }
                System.out.println("No copy available...");
                return;
            }
        }
        System.out.println("Book Not avaiable in Library.");
    }
    public static void main(String args[])
    {
        Books obj=new Books();
        while(true)
        {
            System.out.println("** Main-Menu ****");
            System.out.println("1. Issue");
            System.out.println("2. Return");
            System.out.println("3.Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice -> ");
            int choice=obj.sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter id of book to issue -:");
                    obj.issue_book(obj.sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter id of book to return -:");
                    obj.issue_book(obj.sc.nextInt());
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalud Choice...");
                    System.out.println("Try Again...");

            }
            System.out.println();
            System.out.println("Enter to continue...");
            obj.sc.nextLine();
            obj.sc.nextLine();
            System.out.println("**************");
            System.out.println();
        }
    }
    void return_book(int id)
    {
        System.out.println();
        for(int i=0;i<total_books;i++)
        {
            if(book_id[i]==id) 
            {
                    no_of_books[i]++;
                    System.out.println("Book Returned.");
                    return;
            }
        }
        System.out.println("Wrong ID...");
    }
}
