public class SinFullName {
    String firstName;
    String lastName;

    public void getFullName (String firstName, String lastName) {
        System.out.format("%-20s%-16s%n", firstName, lastName);
    }

    public void getFullNameUpperCase (String firstName, String lastName) {
        System.out.format("%-20s%-16s%n", firstName, lastName.toUpperCase());
    }
}
