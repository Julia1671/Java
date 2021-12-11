import java.util.Scanner;

public class HW6_2_8 {
    static Scanner in = new Scanner (System.in);
    static void showMatrix(int[][]matr) {
        for (int i=0; i<matr.length; ++i) {
            String s = "";
            for (int j=0; j<matr.length; ++j) {
                s += " "+matr[i][j]+" ";
            }
            System.out.println(s);
        }
    }
    static int[][] inputSquareMatrix(int n) {
        int[][] res= new int[n][n];
        for (int i=0; i<n*n;++i) {
            System.out.printf("a[%d,%d]=", i/n, i%n);
            res[i/n][i%n]=in.nextInt();
        }
        return res;
    }
    public static int det(int[][] matr) {
        int res = 0;
        if (matr.length == 1) {
            res = matr[0][0];
        }
        else if (matr.length == 2) {
            res = matr[0][0] * matr[1][1] - matr[1][0] * matr[0][1];
        }
        else if (matr.length == 3) {
            int a1 = matr[0][0] * (matr[2][2] * matr[1][1] - matr[1][2] * matr[2][1]);
            int a2 = matr[0][1] * (matr[2][2] * matr[1][0] - matr[1][2] * matr[2][0]);
            int a3 = matr[0][2] * (matr[2][1] * matr[1][0] - matr[1][1] * matr[2][0]);
            res = a1 - a2 + a3;
        }
        else System.out.println("I can`t solve this problem");
        return res;
    }
    public static void main(String[] args) {
        int[][] matr;
        int n;
        System.out.println("input n:");
        n = in.nextInt();
        matr = inputSquareMatrix(n);
        showMatrix(matr);
        double dett = det(matr);
        System.out.println(dett);
    }
}
