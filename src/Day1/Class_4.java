package Day1;
import java.util.Scanner;
public class Class_4 {

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int currentNumber = 1;

            for(int i = 1; i <=n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(currentNumber);
                    if(j < 1){
                        System.out.print(" ");
                    }
                    currentNumber++;
                }
                System.out.println();
            }
        }
    }
}
