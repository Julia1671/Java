import java.util.Scanner;
public class HW2_n4_5 {
    public static void NPerLine(int n){
        String s = "";
        for(int i = 1; i <= 1000; i++) {
            if (i < 10) s += "   " + i;
            else if (i < 100) s += "  " + i;
            else s += " " + i;
            if (i%n == 0) s += "\n";
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("������ n: ");
        n = in.nextInt();
        in.close();
        NPerLine(n);
    }
}
