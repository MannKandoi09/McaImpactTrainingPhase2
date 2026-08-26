package Day1;
import java.util.Scanner;
public class Home_2 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long sum = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    sum +=   i * j;
                }
            }
            System.out.println("Multiplication Table Sum: " + sum);
        }
    }
}
