import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter a number");
        // int num = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= num ; i++) {
        //     sum+=i;   
        // }
        // System.out.println(sum);

        // for (int i = 963; i > 0; i /=10 ) {
        //     int lastNumber = i % 10;  // is line se last number milta hai or (i/=10 isse last number remove ho jata hai);
        //     System.out.print(lastNumber);
        // }

        int revNum = 0;
        for (int i = 963; i > 0; i/=10) {
            int lastNumber = i % 10;
            revNum = (revNum * 10) + lastNumber;
        }
        System.out.println(revNum);





    }
}