import java.util.ArrayList;
public class Library
{
    ArrayList<Item>Knowledge = new ArrayList<Item>();

    // Adding Method
    public void addItem(Item i)
    {
        Knowledge.add(i);   
    }

    public void showAll()
    {
        for(Item x : Knowledge) // ----->  For Each Loop 
            {
                System.out.println(x);
                x.displayCategoryInfo();
                Item.space();                
            } 
    }

    // Search Method
    public void searchItem(String expectItem)
    {
        boolean found = false; 
        for(Item x : Knowledge)
        {
            if(x.getTitel().equalsIgnoreCase(expectItem))
            {
                found = true;
                break;
            }
            else
                found = false;
        }

        if(found==true)
        {
            System.out.println("The Item Is Available ");
        }
        else
            System.out.println("The Item Is Not Available ");

    }



}
