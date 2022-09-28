import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("in ra 20 số nguyên tố");
        boolean check;
        int n = 2;
        int count = 0;
        while (count < 20) {
            check = true;
            for (int i = 2; i < n; i++)
                if (n%i == 0) {
                    check = false;
                    break;
                }
                if (check) {
                    System.out.printf("%d ", n);
                    count++;
                }
                
            n++;
        }
    }
}