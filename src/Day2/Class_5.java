package Day2;
class employee{
    String name;
    void work(){
        System.out.println("Emploeyee is Working");
    }
}

class Manager extends employee{
    void manageTeam(){
        System.out.println("Manager manges the Team..");
    }

}
public class Class_5 {
    public static void main(String[] args) {
        employee emp = new employee();
        Manager mng = new Manager();
        mng.name = "Mann";
        mng.manageTeam();
        mng.work();
    }
}
