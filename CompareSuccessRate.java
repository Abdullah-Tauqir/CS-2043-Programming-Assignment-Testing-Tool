/**************************************************************
 * Compares the success rates of two TestSuites
 *
 * @author Abdullah
 * CS 2043 / Group 10
 **************************************************************/
public class CompareSuccessRate 
{
    public String compare(TestSuite A, TestSuite B)
    {
        if (A == null || B == null)
        {
            return "Error: One or both TestSuites are missing.";
        }

        // Use your SuccessRate class
        double rateA = SuccessRate.getTestSuiteSuccessRate(A);
        double rateB = SuccessRate.getTestSuiteSuccessRate(B);

        StringBuilder result = new StringBuilder();

        result.append("Success Rate Comparison\n");
        result.append("-------------------------\n");
        result.append(A.name + ": " + String.format("%.2f", rateA) + "%\n");
        result.append(B.name + ": " + String.format("%.2f", rateB) + "%\n\n");

        if (rateA > rateB)
            result.append(A.name + " has a higher success rate.\n");
        else if (rateB > rateA)
            result.append(B.name + " has a higher success rate.\n");
        else
            result.append("Both test suites have equal success rates.\n");

        return result.toString();
    }
}
