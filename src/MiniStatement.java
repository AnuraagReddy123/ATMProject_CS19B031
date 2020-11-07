public class MiniStatement {
    private String statement = "";
    
    public void changeDeposit(int amount) {
        this.statement += "Deposited:                                       +Rs "+amount+"\n";
    }
    public void changeWithdraw(int amount) {
        this.statement += "Withdrawn:                                       -Rs " + amount + "\n";
    }
    public void changetransferFunds(int transferAccount, int amount) {
        this.statement += "Transferred:  to: "+transferAccount+ "                       -Rs " + amount + "\n";
    }
    
    public String showStatement() {
        return this.statement;
    }
    public void resetStatement() {
        this.statement = "";
    }
}
