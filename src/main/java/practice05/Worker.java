package practice05;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String introduce = super.introduce();
        introduce += " I am a Worker. I have a job.";
        return introduce;
    }
}

