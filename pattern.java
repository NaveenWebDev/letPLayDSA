public class pattern {
    public static void main(String[] args) {

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // int n = 7;
        // for (int i = 1; i<=n; i++) {
        // for (int j = 1; j<=n-i+1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // ========================half pyramid pattern===============================
        // int n = 4;
        // for (int i = 1; i<=n; i++) {
        // for (int j = 1; j<=i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // ========================chracter pattern===============================
        // int n = 4;
        // char ch= 'A';
        // for (int i = 1; i<=n; i++) {
        // for (int j = 1; j<=i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }
        // ========================hallo ractangle pattern===============================

        // int n = 4;
        // for (int i = 1; i <=n ; i++) {

        // for (int j = 1; j <=5; j++) {
        // if(j == 1 || j == 5 || i == 1 || i == 4){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // ========================INVERTED & ROTATED HALF-PYRAMID pattern===============================

        // int n = 6;
        // for (int i = 1; i <=n ; i++) {
        // for (int j = 1; j <=n-i+1; j++) {
        // System.out.print(" ");
        // }

        // for (int index = 1; index <=i; index++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
        // ========================INVERTED HALF-PYRAMID with Numbers pattern===============================

        // int n = 5;
        // for (int i = 1; i <=n ; i++) {
        // for (int j = 1; j <=n-i+1; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }
        // ========================FLOYD'S Triangle pattern===============================
        // int n = 5;
        // int number = 1;
        // for (int i = 1; i <=n ; i++) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print(number);
        // number++;
        // }

        // System.out.println();
        // }
        // ========================Binary Triangle pattern===============================
        int n = 10;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }

    }
}