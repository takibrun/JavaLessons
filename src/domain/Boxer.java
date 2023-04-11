package domain;

public class Boxer extends Human {

    private double punchingSpeed = 22.2;

    @Override
    public String doWork() {
        return "I punched my opp " + punchingSpeed  + " times.";
    }
}
