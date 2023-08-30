public class Program {
    public static void main(String[] args) {
        User jinx = new User("Jinx", 2, 4, 2003, "jinxmail@mail", 92878277, "Silco", 52, "110/75", 0);
        User miguel = new User("Miguel", 12, 9, 1992, "bestspider2099@mail", 727878827, "O`hara", 97, "120/70", 20000);
        User miles = new User("Miles", 20, 2, 2005, "bestspiderever@mail", 342224242, "Morales", 64, "120/79", 10);
        User jonathan = new User("Jonathan", 4, 4, 1987, "truegentleman@mail", 234554234, "Joestar", 105, "123/68", 0);
        User brock = new User("Brock", 6, 8, 1998, "rocketsbestfriend@mail", 213511115, "Bomber", 78, "118/75", 57);
        jinx.printAccountInfo();
        System.out.println();
        miguel.printAccountInfo();
        System.out.println();
        miles.printAccountInfo();
        System.out.println();
        jonathan.printAccountInfo();
        System.out.println();
        brock.printAccountInfo();
        System.out.println();
        jinx.setSteps(4500);
        jinx.setPressure("120/75");
        jinx.printAccountInfo();
        System.out.println();
        miles.setWeight(70);
        miles.setSteps(43002);
        miles.setPressure("120/70");
        System.out.println(miles.toString());
        System.out.println();
        miles.printAccountInfo();
        System.out.println();
        jonathan.setSteps(200000);
        jonathan.setPressure("120/60");
        jonathan.printAccountInfo();
    }
}
