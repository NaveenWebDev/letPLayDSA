public class function{
    public static void hello(int a, int b){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("sum of a + b = " + (a + b));
    }
    public static void swap(int a, int b){
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is = " + a);
        System.out.println("value of b is = " + b);
    }

    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binomialcoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_number = factorial(n-r);

        int binomialcoefficient = fact_n / (fact_r * fact_number);
        return binomialcoefficient;
    }

    public static void main(String[] args) {
        // hello(5,5);
        int a = 5;
        int b = 10;
        System.out.println(binomialcoefficient(5, 2));
        // swap(a,b);
        // System.out.println(factorial(4));

    }
}