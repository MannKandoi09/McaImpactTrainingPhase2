package Day2;

public class Class_3 {
    int id;
    String name;
    int marks;

    Class_3(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Class_3 obj = new Class_3(101,"Mann", 100);
        obj.display();
    }
}
