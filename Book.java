public class Book extends Item
{
    private String nameOfAuthor;
    private int pages_Number;

    public Book()
    {

    }

    public Book(String titel,int id,double basePrice,boolean isAvailable,String nameOfAuthor,int pages_Number)
    {
        super(titel, id, basePrice, isAvailable);
        this.nameOfAuthor = nameOfAuthor;
        this.pages_Number = pages_Number;     
    }

    public void setNameOfAuthor(String nameOfAuthor)
    {
    
        this.nameOfAuthor = nameOfAuthor;
    }

    public void setPages_Number(int pages_Number)
    {
        this.pages_Number = pages_Number;
    }

    public String getNameOfAuthor()
    {
        return nameOfAuthor;
    }

    public int getPages_Number()
    {
        return pages_Number;
    }

    public void displayCategoryInfo()
    {
        System.out.println("Category : Programming Book ");
        System.out.println("The Language Book : Arabic And English ");
        System.out.println("Only a paper book is available");       
    }

    public String toString()
    {
        return "The Titel Magazine Is : " + getTitel() + ",Id Is : " + getId() + " ,Base Price : " + getBasePrice() + " ,Is Avalible : " + getisAvailable()
             + ",Name Author : " + nameOfAuthor + " ,Number Of Pages Is : " + pages_Number;
    }
    
}
