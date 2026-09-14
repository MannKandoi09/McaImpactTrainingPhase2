package Day2;

class Employee{
    String name = "employee";

}

class manager extends Employee{
    String name = "Manager";

    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class Daily_Challenge {
    public static void main(String[] args) {
        manager m = new manager();
        m.display();
    }
}
