public class FarzanehMain {



    public static void main(String[] args) {
        FarzanehBasic_Person personOne = new FarzanehBasic_Person("Farzaneh", "Younesi", 30);
        System.out.println(personOne.firstName);
        System.out.println(personOne.age);




        personOne.getFullName();
        personOne.getAge();

    }
}
