public class SinBankAccount {
    public String  customerName;
    public int balance;

    public SinBankAccount() {
        customerName = "Sinduri G";
        balance = 1000;
    }

    public void deposit(int depositAmount) {
        this.balance += depositAmount;
        System.out.println("\nDear " + customerName + ", Deposit of " + depositAmount + " is successful! New balance is " + this.balance + ".");
    }

    public void withdrawal(int withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("\nDear " + customerName + ", Balance is not sufficient to make a withdrawal!");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("\nDear " + customerName + ", Withdrawal of " + withdrawalAmount + " is successful! New balance is " + this.balance + ".");
        }
    }

}
