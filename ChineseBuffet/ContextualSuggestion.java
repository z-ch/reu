import java.util.*;
import java.io.*;

/**
 * Read in a profile ratings, cities, and attractions and return a CSV file of 
 * suggested POI's
 * 
 * @author Siena - Aidan 
 * @version May
 */
public class ContextualSuggestion
{

    protected ArrayList<Profile> people;
    protected ArrayList<Context> cities;
    protected ArrayList<POI> attractions;

    protected String groupID = "Siena";
    protected String runID = "test";

    /**
     * read in all people and cities;
     */
    public ContextualSuggestion()
    {
        people = new ArrayList<Profile>();
        cities = new ArrayList<Context>();
        attractions = new ArrayList<POI>();
    }

    /**
     * Print out all the attractions that the person has rated
     * testing before final version of writing to a csv file
     * 
     */
    public void suggest()
    {
        try
        {
            PrintWriter out_file = new PrintWriter( "out_file.csv"); //change to csv for final copy

            out_file.println("groupid,runid,profile,context,rank,title,description,url,docId");
            for(Profile person : this.people)
            {
                for(int i = 0; i< person.ratings.length; i++)
                {
                    out_file.println("group44" + "," + "run44a" + "," + person.user_id + "," 
                        + attractions.get(i).context + "," + person.ratings[i][0] + "," + 
                        attractions.get(i).title + "," + "description" + "," +
                        attractions.get(i).url + ",");

                    //                     out_file.println(person.user_id + " - " + attractions.get(i).id_num 
                    //                         + "\t" + person.ratings[i][0] + " " + person.ratings[i][1] + " \t" + 
                    //                         attractions.get(i).title + "," + attractions.get(i).url );

                }
            }

            out_file.close();
        }
        catch (IOException e)
        {
            System.out.println("Error creating output file");
            System.exit(-1);
        }
    }
}
