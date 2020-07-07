public class FBankAccount {
    String accountOwner;
    double balance;

    //constructor
    public FBankAccount (String accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
    }


    //method
    public void addMoney (double x){

        balance += x;
        System.out.println("Your current balance is: " + balance);
    }


    //method
    public void withdrawMoney (double y) {
        if ( y > balance) {
            System.out.println("You can not withdraw " + y + " from your account." +
                    " You just have " + balance + " in your account.");
        } else {
            balance -= y;
            System.out.println("You withdrao  " + y );
            System.out.println("Now your balance is: " + balance);

        }



    }

}
