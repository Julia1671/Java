import java.util.Scanner;

public class HW5_1_14 {

    public static void main(String[] args) {
        Task_1_14();
    }

    public static void Task_1_14() {
        System.out.println("Введіть рядок чисел: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        Integer[] mas = new Integer[array.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(array[i]);
        }
        Integer[] mas_ans = new Integer[array.length];
        mas_ans[0] = mas[0];
        int j = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] != mas_ans[j]){
                j += 1;
                mas_ans[j] = mas[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.println(mas_ans[i]);
        }
    }
}