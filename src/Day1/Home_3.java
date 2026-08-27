package Day1;
import java.util.*;
public class Home_3 {

    public class Main{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int type = sc.nextInt();
            double speed = sc.nextDouble();
            String road = "";
            int limit = 0;


            switch(type){
                case 1:
                    road = "city road";
                    limit = 40;
                    break;
                case 2:
                    road = "residential area";
                    limit = 25;
                    break;
                case 3:
                    road = "highway road";
                    limit = 80;
                    break;
                default:
                    System.out.println("Invalid road type. Please choose a valid road type.");
                    return;
            }
            if(speed < limit){
                System.out.println("You are driving below the speed limit on the " + road + ".");
            }else if (speed == limit){
                System.out.println("You are driving at the speed limit on the " + road + ".");
            }else{
                System.out.println("You are driving above the speed limit on the " + road + ".");
            }
        }
    }
}
