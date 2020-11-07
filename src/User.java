
import javax.swing.JOptionPane;

public class User {
    //User Variables
    private int accNum;
    private int PIN;
    private int balance;
    private long phoneNumber;

    User (int accNum, int PIN, int balance, int phoneNumber) {
        this.accNum = accNum;
        this.PIN = PIN;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    //User Methods
    public int viewBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (this.balance < amount) {
            return false;
        }
        else {
            this.balance -= amount;
            return true;
        }
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }
    
    public int getAccNum () {
        return this.accNum;
    }
    
    public void setAccNum (int acc) {
        this.accNum = acc;
    }
    
    public int getPIN () {
        return this.PIN;
    }
    
    public void setPIN (int PIN) {
        this.PIN = PIN;
    }
    
    public void setPhoneNumber (long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public long getPhoneNumber() {
        return this.phoneNumber;
    }
}
