import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {
        int number[] = {5, 4, 1, 6, 2, 3};
        // Arrays.sort(number);
        Arrays.sort(number,1,5);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
