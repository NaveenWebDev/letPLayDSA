import java.util.*;

import javax.naming.spi.DirStateFactory.Result;


public class scanner {
    // ============================area of circle======================= 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     float radius = sc.nextFloat();
    //     float areaOfCirlce = 3.14f * radius * radius;
    //     System.out.println(areaOfCirlce);

    // ========================sum of three number and average of this number=======================

    // System.out.print("enter first number");
    // int numOne = sc.nextInt();
    // System.out.print("enter second number");
    // int numTwo = sc.nextInt();
    // System.out.print("enter thids number");
    // int numThree = sc.nextInt();

    // int average = (numOne + numTwo + numThree) / 3;

    // System.out.println("average of this numbers is : " + average);

    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;

    double result = (f*b) + (i%c) - (d*s);
    System.out.println(result);

}
}