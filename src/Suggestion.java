
/**
 * Write a description of class Suggestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suggestion
{
    private String rating, name, url, categories[], phone, address;

    public Suggestion(String ratingIn, String nameIn, String urlIn, String categoriesIn, 
    String phoneIn, String addressIn)
    {
        rating = ratingIn;
        nameIn = nameIn.replaceAll("\"", "");
        name = nameIn;
        urlIn = urlIn.replaceAll("\"", "");
        url = urlIn;
        categoriesIn = categoriesIn.replaceAll("\\[", "");          
        categoriesIn = categoriesIn.replaceAll("\\]", "");
        categoriesIn = categoriesIn.replaceAll("\"", "");
        categoriesIn = categoriesIn.replaceAll(" ", "");
        categories = categoriesIn.split(",");
        phoneIn = phoneIn.replaceAll("\"", "");
        phoneIn = phoneIn.replaceAll("\\+", "");
        phoneIn = phoneIn.replaceAll("\\-", "");
        phone = phoneIn;
        addressIn = addressIn.replaceAll("\\[", "");
        addressIn = addressIn.replaceAll("\\]", "");
        addressIn = addressIn.replaceAll("\"", "");
        address = addressIn;       
    }
    
    public String toString()
    {
        String output = "";
        output += ("Name: " + this.name + "\n");
        output += ("Rating: " + this.rating + "\n");
        output += ("URL: " + this.url + "\n");
        output += ("Phone: " + this.phone + "\n");
        output += ("Address: " + this.address + "\n");
        output += "Categories: ";
        for (String s : categories)
        {
            output += (s + ", ");
        }
        
        return output + "\n";
    }
    
    public void print()
    {
        System.out.println(this.toString());
    }
}
