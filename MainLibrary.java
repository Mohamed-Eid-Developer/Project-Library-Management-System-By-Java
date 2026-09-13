import java.util.Scanner;
public class MainLibrary
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Library result = new Library();
        int option; 
        
        do
        {
            System.out.println("1- Add Book");
            System.out.println("2- Add Magazine");
            System.out.println("3- Show All");
            System.out.println("4- Search Item");
            System.out.println("5- Exit");
            System.out.println("Enter The Choice To Continue");
            option = input.nextInt();
            switch (option)
            {
                // Add Book
                case 1 :
                    System.out.println("Enter The Titel Of Book Please : ");
                    String name = input.next();
                    System.out.println("Enter The id Book Please : ");
                    int id = input.nextInt();
                    System.out.println("Enter The Base Price Please : ");
                    double price = input.nextDouble();
                    System.out.println("The Book Is Available(true Or false) : ");
                    boolean Avail = input.nextBoolean();
                    System.out.println("Enter The Name Of Author : "); 
                    String author = input.next();
                    System.out.println("Enter The Number Of Pages : ");
                    int pages = input.nextInt();
                    result.addItem(new Book(name,id,price,Avail,author,pages));
                    break;

                // Add Magazine    
                case 2 :
                    System.out.println("Enter The Titel Of Magazine Please : ");
                    String name2 = input.next();
                    System.out.println("Enter The id Magazine Please : ");
                    int id2 = input.nextInt();
                    System.out.println("Enter The Base Price Please : ");
                    double price2 = input.nextDouble();
                    System.out.println("The Book Is Available(true Or false) : ");
                    boolean Avail2 = input.nextBoolean();
                    System.out.println("Enter TheDiscount If Found : ");
                    double discou = input.nextDouble();                     
                    result.addItem(new Magazine(name2,id2,price2,Avail2,discou));
                    break;
                    
                case 3 :
                    result.showAll();
                    break;
                    
                case 4 :
                    System.out.println("Enter The Name Item For Search : ");
                    String searchItem = input.next();
                    result.searchItem(searchItem);
                    break;        
            }
         
        }while(option!=5);
        
    }

}
