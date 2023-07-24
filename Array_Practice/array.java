import java.util.*;

public class array {

    public static void subarray(int arr[]){

        int[] arrValue = new int[15];
        int incrase= 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int subarraySum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    subarraySum += arr[j2];
                }
                arrValue[incrase] = subarraySum;
                incrase++;
                System.out.print(subarraySum + " ");
            }
        }

        System.out.println(Arrays.toString(arrValue));
        
    }
   
    
    public static void main(String[] args) {

        int[] number = {2, 4, 6, 8, 10};

        subarray(number);


    }
}

