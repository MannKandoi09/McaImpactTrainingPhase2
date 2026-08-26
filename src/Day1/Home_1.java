package Day1;
import java.util.Scanner;
public class Home_1 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            int price = sc.nextInt();
            int isWeekday = sc.nextInt();
            int finalPrice = price;
            if (age < 12 || age > 60)
                finalPrice = price - (price * 50 / 100);
            else if (age >= 13 && age <= 19 && isWeekday == 1)
                finalPrice = price - (price * 30 / 100);
            else if (isWeekday == 1)
                finalPrice = price - (price * 20 / 100);
            System.out.println("Final Price: " + finalPrice);
        }
    }
}
