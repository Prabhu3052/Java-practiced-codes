public class passcal {
    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Change this value for a different number of rows
        printPascalsTriangle(rows);
    }
}
