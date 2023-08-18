import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {
        Integer number[] = {5, 4, 1, 6, 2, 3}; // collections reverse order me int to capital Interger krna hoga 
        // Arrays.sort(number);
        // Arrays.sort(number,1,5);
        Arrays.sort(number, Collections.reverseOrder());

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
