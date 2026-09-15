public class SuccessRate {

    // Calculate success rate using boolean results[] from ExecuteTestSuite
    public static double getTestSuiteSuccessRate(TestSuite suite, boolean[] results) {
        if (suite == null || results == null) return 0.0;

        int total = suite.getTotalTestCases();
        if (total == 0) return 0.0;

        int passed = 0;
        for (boolean r : results) {
            if (r) passed++;
        }

        return ((double) passed / total) * 100.0;
    }

    public static String formatRate(double rate) {
        return String.format("%.2f%%", rate);
    }
}
