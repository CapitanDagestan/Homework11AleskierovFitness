public class User {
    private String firstName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private long number;

    private String secondName;
    private int weight;
    private String pressure;
    private int steps;

    public User(String firstName, int birthDay, int birthMonth, int birthYear, String email, long number, String secondName, int weight, String pressure, int steps) {
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.number = number;
        this.secondName = secondName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public User() {
    }

    void printAccountInfo(){
        int age = 2020 - birthYear;
        System.out.println("Account:" + firstName);
        System.out.println("Full name: " + firstName + " " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Number: " + number);
        System.out.println("Today pressure: " + pressure + " mm/Hg");
        System.out.println("Today steps: " + steps);
        System.out.println("Personal Info (not shown to other users)");
        System.out.println("Email: " + email);
        System.out.println("Birth: " + birthMonth + "/" + birthDay + "/" + birthYear);
    }

}
