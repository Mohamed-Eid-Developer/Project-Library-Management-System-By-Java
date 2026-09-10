public abstract class Item
{
    private String titel;
    private int id;
    private double basePrice;
    private boolean isAvailable;

    public Item()
    {

    }

    public Item(String titel, int id, double basePrice, boolean isAvailable)
    {
        this.titel = titel;
        this.id = id;
        this.basePrice = basePrice;
        this.isAvailable = isAvailable;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }

    public void setAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    public String getTitel()
    {
        return titel;
    }

    public int getId()
    {
        return id;
    }

    public double getBasePrice()
    {
        return basePrice;
    }

    public boolean getisAvailable()
    {
        return isAvailable;
    }

    public abstract void displayCategoryInfo(); 
    
    public static void space()
    {
        for(int i=1;i<=25;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
