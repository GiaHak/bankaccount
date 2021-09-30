public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numberofAccounts = 0;
    private static double totalAccountsBalance;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this. savingsBalance = savingsBalance;
        this.numberofAccounts++;
        this.totalAccountsBalance = checkingBalance + savingsBalance;
    }
    public double getcheckingBalance () {
        return checkingBalance;
    }
    public double getsavingsBalance () {
        return savingsBalance;
}
    public void setcheckingBalance (double deposit) {
        checkingBalance = checkingBalance  + deposit;
        totalAccountsBalance = totalAccountsBalance + deposit;
    }
    public void setcheckingBalance2 (double withdraw) {
        if (checkingBalance < withdraw) {
            System.out.println("no money");
        }
        else {
        checkingBalance = checkingBalance - withdraw;
        totalAccountsBalance = totalAccountsBalance - withdraw;
        }
    }
    public void setsavingsBalance (double deposit) {
        savingsBalance = savingsBalance  + deposit;
        totalAccountsBalance = totalAccountsBalance + deposit;
    }
    public void setsavingsBalance2 (double withdraw) {
        if (savingsBalance < withdraw) {
            System.out.println("no money");
        }
        else {
        savingsBalance = savingsBalance - withdraw;
        totalAccountsBalance = totalAccountsBalance - withdraw;
        }
    }
    public double gettotalAccountBalance () {
        return totalAccountsBalance;
    }

}
