import java.util.*;

public class array {
    public static void updateArry(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {

        int number[] = {97, 98, 99};
        updateArry(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }





        // System.out.println("hello Array");

        // int number[] = {1,2,3,4,5};

        // String StudentName[] = {"Naveen","specialist","webDeveloper"};
        // System.out.println(StudentName[0]);

        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i <= 2; i++) {
        //     System.out.println("enter marks");
        //     int marksnumber = marks[i] = sc.nextInt();
        //     System.out.println("marks is" + marksnumber);
        // }


    }
}
