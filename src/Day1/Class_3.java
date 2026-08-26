package Day1;
import java.util.*;
public class Class_3 {

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double height = sc.nextDouble();
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);

            System.out.printf("BMI: %.2f\n", bmi);

            if(bmi < 18.5){
                System.out.println("Classification: Underweight");
            }else if(bmi >= 18.5 && bmi < 25.00){
                System.out.println("Classification: Normal Weight");
            }else  if(bmi >= 25.0 && bmi < 30.0){
                System.out.println("Classification: Overweight");
            }else{
                System.out.println("Classification: Obese");
            }
        }
    }
}
