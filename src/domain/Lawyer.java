package domain;

public class Lawyer extends Human {


    public String profession() {
        return "I practice law";
    }

    @Override
    public String doWork() {
        return "I'm working on criminal cases";
    }
}
