public class pattern{
    public static void main(String[] args) {

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n = 7;
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // ========================half pyramid pattern===============================
        // int n = 4;
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // ========================chracter pattern===============================
        int n = 4;
        char ch= 'A';
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }





    }
}