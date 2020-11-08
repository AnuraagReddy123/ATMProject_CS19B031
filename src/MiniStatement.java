public class MiniStatement {
    private String statement = "";
    private int netAmount = 0;
    
    public void changeDeposit(int amount) {
        this.statement += "Deposited:                                       +"+amount+"\n";
        this.netAmount += amount;
    }
    public void changeWithdraw(int amount) {
        this.statement += "Withdrawn:                                      -" + amount + "\n";
        this.netAmount -= amount;
    }
    public void changetransferFunds(int transferAccount, int amount) {
        this.statement += "Transferred:  to: "+transferAccount+ "                    -" + amount + "\n";
        this.netAmount -= amount;
    }
    
    public String showStatement() {
        if (statement.equals("")) {
            return "No transactions performed";
        }
        else {
            if (this.netAmount > 0)
                return this.statement + "---------------------------------------------------------\n" + "Net transaction is:                           +"+this.netAmount;
            else if (this.netAmount < 0)
                return this.statement + "---------------------------------------------------------\n" + "Net transaction is:                           -"+this.netAmount;
            else
                return this.statement + "---------------------------------------------------------\n" + "Net transaction is:                            "+this.netAmount;
        }
    }
    public void resetStatement() {
        this.statement = "";
    }
}
