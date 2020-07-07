public class FarzanehMain {



    public static void main(String[] args) {
        FarzanehBasic_Person personOne = new FarzanehBasic_Person("Farzaneh", "Younesi", 30);
        System.out.println(personOne.firstName);
        System.out.println(personOne.age);




        personOne.getFullName();
        personOne.getAge();


        System.out.println("============================== A3 ====================================");

        FBankAccount account01 = new FBankAccount("Farzaneh", 100.0);
        System.out.println("Balance right now: " + account01.balance);
        account01.addMoney(120.0);

        account01.withdrawMoney(300);


    }
}
