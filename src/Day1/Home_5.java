package Day1;
import java.util.*;
public class Home_5 {

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            String result = "";
            for(int i = a; i <= b; i++){
                int  sum = 1;
                for(int j = 2; j * j <= i; j++){
                    if(i % j == 0){
                        sum += j;
                        if(j * j != i){
                            sum += i / j;
                        }
                    }
                }
                if(sum == i){
                    result += i + " ";
                }
            }
            System.out.println(result.isEmpty()? "No perfect numbers" : result.trim());
        }
    }
}
