public class Magazine extends Item implements Taxable
{
    private double discount;
    
    public Magazine()
    {

    }
    
    public Magazine(String titel, int id, double basePrice, boolean isAvailable, double discount)
    {
        super(titel, id, basePrice, isAvailable);
        this.discount = discount;
    }   

    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    public double getDiscount()
    {
        return discount;
    } 
     
    public void displayCategoryInfo()
    {
       System.out.println("Category : Magazine");
       System.out.println("Magazine A Fixed Tax 5% ");  
       System.out.println("The Value Of Taxes is : " + calculatTaxes());   
       System.out.println("The Price After Taxes : " + displayTaxes());       
       System.out.println("Discount If Avalible : " + calculatDiscount());       
       if(discount > 0)
       {
          System.out.println("The Price After Discount : " + displayDiscount());
       }
       System.out.println("The Final Value To Magazine is : " + finalValue());
       
    }

    public double displayDiscount()
    {         
        return getBasePrice() - (discount * getBasePrice());          
    }

    public double calculatDiscount()
    {
        if(discount > 0)
        {
            return discount * getBasePrice();
        }
        else
            return 0;    
    }

    public double displayTaxes()
    {
        return getBasePrice() - (getBasePrice() * 0.05) ;
    }

    public double calculatTaxes()
    {
        return getBasePrice() * 0.05 ;
    }

    public double finalValue()
    {
        return getBasePrice() - calculatDiscount() - calculatTaxes();
    }

    public String toString()
    {
        return "The Titel Magazine Is : " + getTitel() + ",Id Is : " + getId() + " ,Base Price : " + getBasePrice()
             + " ,Is Avalible : " + getisAvailable() + " ,Discount Is : "+ discount; 
    }

    
}
