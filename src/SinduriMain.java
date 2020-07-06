//Statement that creates a class
public class SinduriMain {

    public static void main(String[] args) {
        SinFullName newName = new SinFullName();
        newName.getFullName("Sinduri", "Gunutpalli");
        newName.getFullName("Johann", "Fladeboe");
        newName.getFullName("Hema", "Rallapalli");
        newName.getFullName("Thalia", "Pascal");
        newName.getFullName("Marina", "Fred");
        newName.getFullName("Minerva", "Fg");
        newName.getFullName("Hella", "fg");

        System.out.println("");

        SinFullName newNames = new SinFullName();
        newNames.getFullNameUpperCase("Sinduri", "Gunutpalli");
        newNames.getFullNameUpperCase("Johann", "Fladeboe");
        newNames.getFullNameUpperCase("Hema", "Rallapalli");
        newNames.getFullNameUpperCase("Thalia", "Pascal");
        newNames.getFullNameUpperCase("Marina", "Fred");
        newNames.getFullNameUpperCase("Minerva", "Fg");
        newNames.getFullNameUpperCase("Hella", "fg");


    }

}
