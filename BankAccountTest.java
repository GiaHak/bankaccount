public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount (2000, 700);
        
        account1.setcheckingBalance(200);
        account1.setcheckingBalance2(3000);

        
        System.out.println(account1.getcheckingBalance());
        System.out.println(account1.getsavingsBalance());
        System.out.println(account1.gettotalAccountBalance());


    }
}