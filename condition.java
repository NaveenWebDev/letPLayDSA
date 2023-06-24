import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();

        String conditionvalue = (number < 0) ? "negative":"positive";
        System.out.println(conditionvalue);

    }
}
