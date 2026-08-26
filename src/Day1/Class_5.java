package Day1;
import java.util.Scanner;
public class Class_5 {

    class  Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if((i * j) % 2 == 0){
                        sum += (i * j);
                    }
                }
            }
            System.out.println("Even Product Sum: " + sum);
        }
    }
}
