import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum+=i;   
        }
        System.out.println(sum);
    }
}