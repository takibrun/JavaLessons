package domain;

public class MathStudent extends MathTeacher {

    @Override
    public String doWork() {
        return " Eating in class";
    }

    public String doWork(String snacks){
        return "Candy " + snacks;
    }
}