public class CountryCapital {
    public static void main(String[] args) {

        String[][] data = {
            {"America", "England", "Japan", "France", "Indonesia", "Iran", "Iraq"},
            {"Washington", "London", "Tokyo", "Paris", "Jakarta", "Tehran", "Baghdad"}
        };

        for (int i = 0; i < data[0].length; i++) {
            System.out.println("The capital of "
                    + data[0][i] + " is " + data[1][i]);
        }
    }
}
