package Day1;
import java.util.Scanner;
public class Class_2 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            int num = n;

            for(int i = 2; i <= num; i++){
                if(num % i == 0){
                    sum = sum + i;
                    while(num % i == 0){
                        num = num / i;
                    }
                }
            }
            System.out.println("Sum of Prime Factors: " + sum);
        }
    }
}
