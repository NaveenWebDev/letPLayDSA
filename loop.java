import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ==============================factorial============================
        int factorial = 1;
        System.out.print("enter any positive number : ");
        int number = sc.nextInt();

        for(int i=1;i<=number;i++){
            factorial *=i;
        }

        System.out.println(factorial);



        // =================================sum of odd and even=======================================

        // int number;
        // int choice;
        // int evenSum=0;
        // int oddSum=0;

        // do{
        //     System.out.print("Enter the number ");
        //     number=sc.nextInt();
        //     if(number%2==0) {
        //         evenSum+=number;
        //     }else{
        //         oddSum+=number;
        //     }
        //     System.out.print("Doyouwanttocontinue?Press1foryesor0forno");
        //     choice=sc.nextInt();
        // }while(choice==1);

        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);

        // ==========================check prime or not =============================
        // System.out.print("enter a number : ");
        // int userNumber = sc.nextInt();
        
        // boolean isPrime = true;

        // for(int i = 2; i<=userNumber-1;i++){
        //     if(userNumber % i == 0){
        //         isPrime = false;
        //     }
        // }
        // if(isPrime){
        //     System.out.println(userNumber + " is a prime number");
        // }else{
        //     System.out.println("not a prime");
        // }


        // ==============================end=========================================

        // while(true){
        //     System.out.print("enter a number");
        //     int number = sc.nextInt();

        //     if(number % 10 == 0){
        //         System.out.println("i am out of the ranger");
        //         break; // continue se 10 se divede wale skip hone or baki ke print
        //     }
        //     System.out.println(number);
        // }

        // System.out.print("enter a number");
        // int num = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= num ; i++) {
        //     sum+=i;   
        // }
        // System.out.println(sum);

        // ======================================reverser number========================

        // for (int i = 963; i > 0; i /=10 ) {
        //     int lastNumber = i % 10;  // is line se last number milta hai or (i/=10 isse last number remove ho jata hai);
        //     System.out.print(lastNumber);
        // }

        // int revNum = 0;
        // for (int i = 963; i > 0; i/=10) {
        //     int lastNumber = i % 10;
        //     revNum = (revNum * 10) + lastNumber;
        // }
        // System.out.println(revNum);





    }
}