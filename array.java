import java.util.*;

public class array {
    // public static void updateArry(int arr[]){
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = arr[i] + 1;
    //     }
    // }
    // public static int linearSearch(int arr[], int key){
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // ==================================binary search==========================================

    public static int binarySearch(int numbers[], int key){
        int start = 0 , end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start =  mid+1;
            }else{
                end = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int number[] = {97, 98, 99, 100, 101};
        int key = 98;

        System.out.println(binarySearch(number, key));
        // if(linearSearch(number, key) == -1){
        //     System.out.println("not found");
        // }else{
        //     System.out.println(linearSearch(number, key));
        // }


        // updateArry(number);
        // for (int i = 0; i < number.length; i++) {
        //     System.out.println(number[i]);
        // }




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
