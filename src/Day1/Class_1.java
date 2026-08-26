package Day1;
import java.util.*;

public class Class_1 {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();
            int total = mark1 + mark2 + mark3;
            float average = total / 3;
            System.out.printf("Average Marks: %.2f\n", average);
        }
    }
}
