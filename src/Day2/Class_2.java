package Day2;

public class Class_2 {
    int id;
    String name;
    int marks;

   void display(){
       System.out.println("ID: " + id);
       System.out.println("Name: " + name);
       System.out.println("Marks: " +marks);
   }

    public static void main(String[] args) {
        Class_2 c = new Class_2();
        c.id = 101;
        c.name = "Mann";
        c.marks = 100;
        c.display();

    }
}
