///////////////////////////////////////A1(01 and 02) and A2/////////////////////////////////////////////
public class FarzanehBasic_Person {
    String firstName;
    String lastName;
    int age;

    //This is constructor
    public FarzanehBasic_Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void getFullName() {
        System.out.println("The full name is: " + firstName + " " + lastName.toUpperCase());//Exercise A2
    }

    public void getAge() {
        System.out.println("Age is: " + age);
    }



}














