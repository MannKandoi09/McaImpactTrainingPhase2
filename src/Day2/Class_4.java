package Day2;

public class Class_4 {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if (balance >= 0){
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Class_4 bank = new Class_4();
        bank.setBalance(5000);
        System.out.println(bank.getBalance());
    }
}
