import java.util.*;

public class array {
    public static void main(String[] args) {
        // System.out.println("hello Array");

        // int number[] = {1,2,3,4,5};

        // String StudentName[] = {"Naveen","specialist","webDeveloper"};
        // System.out.println(StudentName[0]);

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {
            System.out.println("enter marks");
            int marksnumber = marks[i] = sc.nextInt();
            System.out.println("marks is" + marksnumber);
        }

    }
}
