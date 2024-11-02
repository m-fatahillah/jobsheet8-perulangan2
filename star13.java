import java.util.Scanner;

public class star13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.print("Masukkan nilai N = ");
        N = sc.nextInt();

        for (int i=1; i<=N; i++) { 
            System.out.print("*");
        }
    }
}