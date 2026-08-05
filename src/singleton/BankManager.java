package singleton;

public class BankManager {
    private int totalMoney;
    private static final BankManager instance = new BankManager();
    private BankManager(){};

    public static BankManager getInstance(){
        return instance;
    }

    public void deposit(int amount){
        totalMoney+=amount;
    }

    public void withdraw(int amount){
        if(totalMoney>=amount){
            totalMoney-=amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public int getBalance(){
        return totalMoney;
    }

    public static void main(String[] args){
        BankManager vek = BankManager.getInstance();
        BankManager vani = BankManager.getInstance();
        vek.deposit(1000);
        vani.withdraw(100);
        System.out.println(vek.getBalance());
    }

}
