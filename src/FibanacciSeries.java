public class FibanacciSeries
{
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, i;
        int n = 10;
        System.out.println(a + "  " + b);
        for (i = 1; i <= n; i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}
