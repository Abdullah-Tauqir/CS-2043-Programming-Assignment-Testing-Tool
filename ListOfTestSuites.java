import java.util.ArrayList;

/**************************************************************
 * Maintains a list of all test suites available in the project
 *
 * @author Abdullah Tauqir
 * CS 2043 / Group 10
 **************************************************************/
public class ListOfTestSuites 
{
    private ArrayList<TestSuite> suites;

    // Constructor
    public ListOfTestSuites() 
    {
        suites = new ArrayList<>();
    }

    // Adds a TestSuite to the collection
    public void add(TestSuite ts) 
    {
        suites.add(ts);
    }

    // Searches the list for a TestSuite with the given name
    public TestSuite search(String name) 
    {
        for (TestSuite t : suites) 
        {
            // Use getter, NOT t.name
            if (t.getName().equals(name)) 
            {
                return t;
            }
        }
        return null; // not found
    }

    // Returns how many suites exist
    public int getCount()
    {
        return suites.size(); // NOT 'count'
    }

    // Returns the suite at position index
    public TestSuite getSuiteAt(int index) 
    {
        return suites.get(index); // NOT suites[index]
    }
}
