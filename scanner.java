import java.util.*;

// ============================area of circle======================= 

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float areaOfCirlce = 3.14f * radius * radius;
        
        System.out.println(areaOfCirlce);
    }
    
}