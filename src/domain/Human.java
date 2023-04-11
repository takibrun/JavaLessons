package domain;

public class Human {
   private int age;
    private String firstName;
    private String lastName;

    private char gender;

    private boolean gayOrNot;

    private double salary;

    private String ethnicity;

    private int creditScore;

    public Human() {

    }

    public Human(String firstName, String lastName) {
         this.setFirstName(firstName);
         this.setLastName(lastName);
    }

    public Human(String firstName, String lastName, int age, char gender, boolean gayOrNot, double salary, String ethnicity, int creditScore) {

     this.setFirstName(firstName);
     this.setLastName(lastName);
     this.setAge(age);
     this.setGender(gender);
     this.setGayOrNot(gayOrNot);
     this.setSalary(salary);
     this.setEthnicity(ethnicity);
     this.setCreditScore(creditScore);
     System.out.println("I just was born");

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean getGayOrNot() {
        return gayOrNot;
    }

    public void setGayOrNot(boolean gayOrNot) {
        this.gayOrNot = gayOrNot;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }


    public String doWork(){
        return "Working";
    }

    public String doWork(String work){
        return "working on " + work;
    }

    public String doWork(String work, double hours){
        return "I work " + work + " " + hours;
    }

    public String doWork(String work, double hours, boolean offOrNo){
        return "I work " + work + " " + hours + " No " + offOrNo;
    }
}
