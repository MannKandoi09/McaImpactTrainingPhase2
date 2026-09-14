package Day2;

class calculator{
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }
}
public class Home_1 {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.add(10,10,10));
        System.out.println(cal.add(10.5,10.5));
        System.out.println(cal.add(5,5));
    }
}
